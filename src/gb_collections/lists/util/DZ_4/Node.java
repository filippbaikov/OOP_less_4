package gb_collections.lists.util.DZ_4;

public class Node<E> {
    private E currentElement;
    private Node <E>nextElement;
    private Node <E> prevElement;

    public Node(E currentElement, Node<E> prevElement, Node<E> nextElement) {
        this.currentElement = currentElement;
        this.nextElement = nextElement;
        this.prevElement = prevElement;
    }

    public void setCurrentElement(E currentElement) {
        this.currentElement = currentElement;
    }

    public void setNextElement(Node<E> nextElement) {
        this.nextElement = nextElement;
    }

    public void setPrevElement(Node<E> prevElement) {
        this.prevElement = prevElement;
    }

    public E getCurrentElement() {
        return currentElement;
    }

    public Node<E> getNextElement() {
        return nextElement;
    }

    public Node<E> getPrevElement() {
        return prevElement;
    }
}
