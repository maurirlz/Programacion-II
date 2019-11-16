package OOPAvanzado.MyDate;

public class MyDate {

    private static final int  YEAR_MAX = 3000;
    private static final int  YEAR_MIN = 1;

    private static final int  MONTH_MAX = 12;
    private static final int  MONTH_MIN = 1;

    private static final int DAY_MIN = 1;

    private int year;
    private int month;
    private int day;

    private static String strMonths[] = {
            "Jan", "Feb", "Mar", "Apr", "May", "Jun",
            "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
    };

    private static String strDays[] = {
            "Sunday", "Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday"
    };

    private static int daysInMonths[] = {
            31,28,31,30,31,30,31,31,30,31,30,31
    };

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public static boolean isLeapYear(int year) {
        // sacado de stackoverflow
        return (year % 400 == 0) || (year % 100 != 0) && (year % 4 == 0);
    }

    public static int getLastDayInMonth(int year, int month) {
        return daysInMonths[month] + (isLeapYear(year) && month == 2 ? 1 : 0);
    }

    public static boolean isValidDate(int year, int month, int day) {

        if (year < YEAR_MIN || year > YEAR_MAX) {

            return false;
        }
        if (month < MONTH_MIN || month > MONTH_MAX) {

            return false;
        }

        return (day > DAY_MIN || getLastDayInMonth(year, month) < day);
    }

    public static int getDayOfWeek(int year, int month, int day) {

        // algoritmo de tomohiko sakamoto
        // source:  https://www.geeksforgeeks.org/tomohiko-sakamotos-algorithm-finding-day-week/

        int t[] = { 0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};
        if (month < 3) {
            year -= 1;
        }
        // 0 para domingo, 1 para lunes... 6 para sabado.
        return (year + year / 4 - year / 100 + year / 400 + t[month - 1] + day) % 7;
    }

    public MyDate nextDay() {
        int daymax = getLastDayInMonth(year, month);

        if (YEAR_MAX == year && MONTH_MAX == month && daymax == day) {
            return this;
        }
        if (daymax == day) {
            setDate(year, month+1, DAY_MIN);
            return this;
        }
        if (MONTH_MAX == month && daymax == day) {
            setDate(year+1,MONTH_MIN, DAY_MIN);
            return this;
        }
        setDate(year, month, day+1);
        return this;
    }

    public MyDate nextMonth() {

        int daymax;
        if (MONTH_MAX == month && YEAR_MAX == year) {
            return this;
        }
        if (MONTH_MAX == month){
            daymax = getLastDayInMonth(year+1, MONTH_MIN);
        }else{
            daymax = getLastDayInMonth(year, month+1);
        }
        if (daymax > day) {
            daymax = day;
        }
        if (MONTH_MAX == month) {
            setDate(year+1, MONTH_MIN, daymax);
        }

        setDate(year, month+1, daymax);
        return this;
    }

    public MyDate nextYear() {
        if (YEAR_MAX == year) {
            return this;
        }
        int daymax = getLastDayInMonth(year+1, month);
        if (daymax > day){
            daymax = day;
        }
        setDate(year+1, month, daymax);
        return this;
    }

    public MyDate previousDay() {
        if (YEAR_MIN == year && MONTH_MIN == month && DAY_MIN == day) {
            return this;
        }
        if (MONTH_MIN == month && DAY_MIN == day) {
            setDate(year-1, month, getLastDayInMonth(year-1, MONTH_MAX));
        }
        if (DAY_MIN == day) {
            setDate(year, month-1, getLastDayInMonth(year, month-1));
            return this;
        }
        setDate(year, month, day-1);
        return this;

    }

    public MyDate previousMonth() {
        if (YEAR_MIN == year && MONTH_MIN == month) {
            return this;
        }
        int daymax;
        if (MONTH_MIN == month) {
            daymax = getLastDayInMonth(year-1, month);
        }else {
            daymax = getLastDayInMonth(year, month-1);
        }
        if (daymax > day) {
            daymax = day;
        }
        setDate(year, month-1, daymax);
        return this;
    }

    public MyDate previousYear() {
        if (YEAR_MIN == year) {
            return this;
        }
        int daymax = getLastDayInMonth(year-1, month);
        if (daymax > day) {
            daymax = day;
        }
        setDate(year-1, month, daymax);
        return this;
    }

    public void setDate(int year, int month, int day) {
        if (! isValidDate(year, month, day)) {
            throw new IllegalArgumentException("Invalid year, month or day.");
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {

        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        if (YEAR_MIN > year || YEAR_MAX < year){
            throw new IllegalArgumentException("Invalid year.");
        }else {
            this.year = year;
        }

    }

    public void setMonth(int month) {
        if (MONTH_MIN > month || MONTH_MAX < month) {
            throw new IllegalArgumentException("Invalid month.");
        }else {
            this.month = month;
        }

    }

    public void setDay(int day) {

        if (DAY_MIN > day || getLastDayInMonth(this.year, this.month) < day) {
            throw new IllegalArgumentException("Invalid day.");
        }else{
            this.day = day;
        }
    }

    @Override
    public String toString() {
        int index = getDayOfWeek(year,month,day);
        return String.format("%1$s %2$d %3$s %4%$d",strDays[index],day,strMonths[month],year);
    }
}
