import entities.BinaryTree;
import entities.model.Obj;

public class Main {
    public static void main(String[] args) {

        BinaryTree<Obj> bt = new BinaryTree<>();

        bt.insert(new Obj(13));
        bt.insert(new Obj(10));
        bt.insert(new Obj(25));
        bt.insert(new Obj(2));
        bt.insert(new Obj(12));
        bt.insert(new Obj(20));
        bt.insert(new Obj(31));
        bt.insert(new Obj(29));

        bt.displayInOrder();
        bt.displayPreOrder();
        bt.displayPostOrder();

        System.out.println("");
        bt.remove(new Obj(12));

        bt.displayInOrder();
        bt.displayPreOrder();
        bt.displayPostOrder();
    }
}