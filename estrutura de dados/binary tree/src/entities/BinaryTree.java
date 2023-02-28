package entities;

public class BinaryTree<T extends Comparable<T>> {

    private Node<T> root;
    public BinaryTree(){
        this.root = null;
    }

    private Node<T> insert(Node<T> current, Node<T> newNode){
        if(current == null){
            return newNode;
        }else if(newNode.getValue().compareTo(current.getValue()) < 0){
            current.setLeft(insert(current.getLeft(), newNode));
        }else{
            current.setRight(insert(current.getRight(), newNode));
        }
        return current;
    }

    public void insert(T value){
        Node<T> newNode = new Node<T>(value);
        this.root = insert(this.root, newNode);
    }

    public void remove(T value){
        try {
            Node<T> current = this.root;
            Node<T> father, son, aux;

            while(current != null && !current.getValue().equals(value)){
                father = current;

                if(value.compareTo(current.getValue()) < 0){
                    current = current.getLeft();
                }else{
                    current = current.getRight();
                }

                if(current == null){
                    System.out.println("Value is out of the tree");
                }

                if(father == null){
                    if(current.getRight() == null){
                        this.root = current.getLeft();
                    }else if(current.getLeft() == null){
                        this.root = current.getRight();
                    }else{
                        for(aux = current, son = current.getLeft();
                            son.getRight() != null;
                            aux = son, son = son.getLeft())
                        {
                            if(son != current.getLeft()){
                                aux.setRight(son.getLeft());
                                son.setLeft(this.root.getLeft());
                            }
                        }
                        son.setRight(this.root.getRight());
                        this.root = son;
                    }
                }else if(current.getRight() == null){
                    if(father.getLeft() == current){
                        father.setLeft(current.getLeft());
                    }else{
                        father.setRight(current.getLeft());
                    }
                }else if(current.getLeft() == null){
                    if(father.getLeft() == current){
                        father.setLeft(current.getRight());
                    }else{
                        father.setRight(current.getRight());
                    }
                }else{
                    for(
                            aux = current, son = current.getLeft();
                            son.getRight() != null;
                            aux = son, son = son.getRight()
                    )
                    {
                        if(son != current.getLeft()){
                            aux.setRight(son.getLeft());
                            son.setLeft(current.getLeft());
                        }
                        son.setRight(current.getRight());
                        if(father.getLeft() == current){
                            father.setLeft(son);
                        }else{
                            father.setRight(son);
                        }
                    }
                }
            }
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
    }

    public void displayInOrder(){
        System.out.println("\nIn Order");
        displayInOrder(this.root);
    }

    private void displayInOrder(Node<T> current){
        if(current != null){
            displayInOrder(current.getLeft());
            System.out.print(current.getValue() + ", ");
            displayInOrder(current.getRight());
        }
    }

    public void displayPostOrder(){
        System.out.println("\nPost Order");
        displayPostOrder(this.root);
    }

    private void displayPostOrder(Node<T> current){
        if(current != null){
            displayPostOrder(current.getLeft());
            displayPostOrder(current.getRight());
            System.out.print(current.getValue() + ", ");
        }
    }

    public void displayPreOrder(){
        System.out.println("\nPre Order");
        displayPreOrder(this.root);
    }

    private void displayPreOrder(Node<T> current){
        if(current != null){
            System.out.print(current.getValue() + ", ");
            displayPreOrder(current.getLeft());
            displayPreOrder(current.getRight());
        }
    }
}
