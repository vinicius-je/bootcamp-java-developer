package entities;

public class Queue {

    private Node first, last;
    private Integer size;

    public Queue() {
        this.first = this.last = null;
        this.size = 0;
    }

    public boolean isEmpty(){
        return (this.first == null && this.size == 0) ? true : false;
    }

    public void enqueue(Object value){
        Node newNode = new Node(value);

        if(isEmpty()){
            this.first = this.last = newNode;
        }else{
            this.last.setNext(newNode);
            this.last = newNode;
        }
        size++;
    }

    public void dequeue(){
        if(!isEmpty()){
            this.first = this.first.getNext();
            this.size--;
        }
    }

    public void clean(){
        if(!isEmpty()){
            if(this.first == this.last){
                this.first = this.last = null;
                this.size = 0;
            }else{
                while (!this.isEmpty()){
                    this.dequeue();
                }
            }
        }
    }

    public Node front(){
        return this.first;
    }
    public Node rear(){
        return this.last;
    }

    public Integer getSize(){
        return this.size;
    }

    @Override
    public String toString() {
        String str = "";
        Node aux = this.first;

        while(aux != null){
            str += aux.getValue();
            aux = aux.getNext();
        }

        return str;
    }
}
