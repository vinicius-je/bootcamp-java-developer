package entities;

public class DoublyLinkedList<T> {
    private Node<T> first;
    private Node<T> last;
    private int size;

    public DoublyLinkedList(){
        this.first = this.last = null;
        this.size = 0;
    }

    public int size(){
        return size;
    }

    public T get(int index){
        return this.getNode(index).getValue();
    }

    private Node<T> getNode(int index){
        Node<T> aux = this.first;

        for(int i = 0; (i < index) && (aux != null); i++){
            aux = aux.getNext();
        }

        return aux;
    }

    public void add(T value){
        Node<T> newNode = new Node<T>(value);
        newNode.setNext(null);
        newNode.setPrevious(this.last);

        if(this.first == null){
            this.first = this.last = newNode;
        }else{
            this.last.setNext(newNode);
            this.last = newNode;
        }
        this.size++;
    }

    public void add(int index, T value){
         Node<T> aux = getNode(index);
         Node<T> newNode = new Node<T>(value);
         newNode.setNext(aux);

         if (newNode.getNext() != null){
             newNode.setPrevious(aux.getPrevious());
             aux.setPrevious(newNode);
         }else{
             aux.setPrevious(newNode);
             this.last = newNode;
         }

         if(index == 0){
             this.first = newNode;
         }else{
             newNode.getPrevious().setNext(newNode);
         }

         size++;
    }

    public void remove(int index){

        if(index == 0){
            this.first = this.first.getNext();
            if(this.first != null){
                this.first.setPrevious(null);
            }
        }else{
            Node<T> aux = this.getNode(index);
            aux.getPrevious().setNext(aux.getNext());
            if(aux.getNext() != null){
                aux.getNext().setPrevious(aux.getPrevious());
            }else{
                this.last = aux;
            }
        }
        size--;
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
