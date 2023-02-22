package entities;

public class CircularLinkedList<T> {
    private Node<T> first, last;
    private int size;

    public CircularLinkedList(){
        this.first = this.last = null;
        this.size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty(){
        return this.size == 0;
    }

    private Node<T> getNode(int index){
        if(isEmpty())
            throw new IndexOutOfBoundsException("List is empty!");

        if(index == 0) return this.first;

        Node<T> aux = this.first;

        for(int i = 0; i < index; i++){
            aux = aux.getNext();
        }
        return  aux;
    }

    public T get(int index){
        return this.getNode(index).getValue();
    }

    public void add(T value){
        Node<T> newNode = new Node<T>(value);
        if(this.isEmpty()){
            this.last = newNode;
            this.first = this.last;
            this.last.setNext(this.first);
        }else{
            newNode.setNext(this.first);
            this.first = newNode;
            this.last.setNext(this.first);
        }
        this.size++;
    }

    public void remove(int index){
        if(index > this.size())
            throw new IndexOutOfBoundsException("The index is outside the size of the list");

        if(index == 0){
            this.first = this.first.getNext();
            this.last.setNext(this.first);
        }else if(index == 1){
            this.first.setNext(this.first.getNext().getNext());
        }else{
            Node<T> aux = this.first;

            for(int i = 0; i < index - 1; i++){
                aux = aux.getNext();
            }

            aux.setNext(aux.getNext().getNext());
        }
        this.size--;
    }

    @Override
    public String toString() {
        String str = "";
        Node<T> aux = this.first;
        for(int i = 0; i < size(); i++){
            str += aux.getValue() + "\n";
            aux = aux.getNext();
        }
        return str;
    }
}
