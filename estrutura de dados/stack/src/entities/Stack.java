package entities;

public class Stack {

    private Node topNode;

    public Stack(){
        this.topNode = null;
    }

    public Node top(){
        return this.topNode;
    }

    public Node pop(){
        if(this.topNode != null){
            Node aux = this.topNode;
            this.topNode = aux.getNext();
            return aux;
        }

        return this.topNode;
    }

    public void push(Object value){
        Node<Object> newNode = new Node<Object>(value);
        newNode.setNext(this.topNode);
        this.topNode = newNode;
    }

    @Override
    public String toString() {
        String str = "";

        Node aux = this.topNode;
        while(aux != null){
            str += aux.getValue() + "\n";
            aux = aux.getNext();
        }

        return str;
    }
}
