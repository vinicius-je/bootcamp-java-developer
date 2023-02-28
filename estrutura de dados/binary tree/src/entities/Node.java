package entities;

public class Node<T extends Comparable<T>> {
    private T value;
    private Node<T> left, right;

    public Node(T value){
        this.value = value;
        this.left = this.right = null;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getLeft() {
        return left;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }

    public Node<T> getRight() {
        return right;
    }

    public void setRight(Node<T> right) {
        this.right = right;
    }



    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }
}
