package entities;

public class LinkedList<T> {
    private Node<T> first, last;
    private Integer size;

    public LinkedList(){
        this.first = this.last = null;
        this.size = 0;
    }

    public boolean isEmpty(){
        return this.first == null;
    }

    public void add(T value){
        Node<T> newNode = new Node<T>(value);

        if(this.isEmpty()) {
            this.first = this.last = newNode;
        }
        else{
           this.last.setNext(newNode);
           this.last = newNode;
        }
        size++;
    }

    public void remove(int index){
        if(index == 0){
            this.first = this.first.getNext();
        }else{
            Node target = this.get(index);
            Node aux = this.get(index - 1);
            aux.setNext(target.getNext());
        }
        size--;
    }

    public Node<T> get(int index){
        Node aux = this.first;
        Node ret = null;
        for(int i = 0; i <= index; i++){
            ret = aux;
            aux = aux.getNext();
        }
        return ret;
    }

    public Integer size(){
        return this.size;
    }

    @Override
    public String toString() {
        String str = "";

        Node<T> aux = this.first;
        while(aux != null){
            str += aux.getValue() + "\n";
            aux = aux.getNext();
        }

        return str;
    }
}
