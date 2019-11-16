package OOPAvanzado.SistemaDeDescuento;

public class Customer {

    protected static final boolean MEMBER_DEF = false;

    private String name;
    private boolean member;
    private String memberType;

    public Customer(String name) {
        this.name = name;
    }

    public Customer(String name, String memberType) {
        this.name = name;
        this.member = MEMBER_DEF;
        this.memberType = memberType;
    }

    public Customer(String name, boolean member, String memberType) {
        this.name = name;
        this.member = member;
        this.memberType = memberType;
    }

    public boolean isMember() {
        return member;
    }

    public void setMember(boolean member) {
        this.member = member;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Customer [name=" + name + ", member=" + member + ", memberType=" + memberType + "]";
    }
}
