package EstructurasLineales.LinkedList.MySinglyLinkedList;

public class Main {

    public static void main(String[] args) {

        MyPersonalLinkedList<String> list = new MyPersonalLinkedList<>();

        list.addFirst("Primer dato agregado");
        list.addFirst("Segundo dato agregado");
        list.addFirst("Tercer dato agregado");
        list.addFirst("Cuarto dato agregado");
        list.add(0, "Quinto elemento agregado."); // add con indice funcionando.
        list.printList();

        System.out.println(list.contains("Quinto elemento agregado."));
        System.out.println(list.get(0));

        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        int indexOfHead = list.indexOf("Quinto elemento agregado.");
        System.out.println(indexOfHead);

        String headRecuperadaMasUno = list.remove(1);
        System.out.println(headRecuperadaMasUno);

        String datoAnteriorASet = list.set(3, "ELEMENTO SETTEADO POR SET");
        list.printList();
        System.out.println(datoAnteriorASet);

        System.out.println("Elementos en la lista: " + list.size());
        list.clear();

        list.printList();

    }
}
