import entities.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {

        DoublyLinkedList<String> list = new DoublyLinkedList<>();

        for(int i = 0; i < 10; i++){
            list.add("element nº " + (i + 1));
        }

        System.out.println(list);

        list.remove(3);
        list.add(3, "element nº 11");

        System.out.println(list);
        System.out.println(list.get(3));
    }
}