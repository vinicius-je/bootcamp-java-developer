import entities.CircularLinkedList;

public class Main {
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();

        cll.add("element nº 0");
        System.out.println(cll);
        cll.remove(0);
        System.out.println(cll.isEmpty());
        System.out.println(cll);

        for(int i = 1; i < 11; i++){
            cll.add("element nº " + i);
        }

        System.out.println(cll);

        for(int i = 0; i < cll.size(); i++){
            System.out.println(cll.get(i));
        }

    }
}