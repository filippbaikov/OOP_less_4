package gb_collections.lists.util.DZ_4;

import java.util.Iterator;

public class GBLinkedList<E> implements GbLinkedL<E>
//
{
    private int size;
    public Node<E> firstNode;
    public Node<E> lastNode;

    public GBLinkedList() {
        lastNode = new Node<>(null, null, firstNode);
        firstNode = new Node<>(null, null, lastNode);

    }

    @Override
    public void addLastValue(E e) {
        Node<E> prev = lastNode;
        prev.setCurrentElement(e);
        lastNode = new Node<E>(null, prev, null);
        prev.setNextElement(lastNode);
        size++;


    }

    @Override
    public void addFirstValue(E e) {
        Node<E> next = firstNode;
        next.setCurrentElement(e);
        firstNode = new Node<>(null, null, next);
        next.setPrevElement(firstNode);
        size++;


    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E getElementByIndex(int counter) {
        Node<E> target = firstNode.getNextElement();
        for (int i = 0; i < counter; i++) {
            target = getNextElement(target);
        }
        return target.getCurrentElement();
    }

     @Override
     public E unlink1(Node <E>value) {
        Node <E>current= value;
        Node<E> next=value.getNextElement();
        Node<E>prev=value.getPrevElement();
         if (prev == null) {
             firstNode = next;
         } else {
             prev.setNextElement(next);
             value.setPrevElement(null);
         }

         if (next == null) {
             lastNode = prev;
         } else {
             next.setPrevElement(prev);
             value.setNextElement(null);
         }
         value.setCurrentElement(null);
         size--;

         return (E) current;

     }


    @Override
    public boolean remove1(Object o) {
        if (o == null) {
            for (Node<E> x = firstNode; x != null; x = x.getNextElement()) {
                if (x.getCurrentElement() == null) {
                    unlink1(x);
                    return true;
                }
            }
        } else {
            for (Node<E> x = firstNode; x != null; x = x.getNextElement()) {
                if (o.equals(x.getCurrentElement())) {
                    unlink1(x);
                    return true;
                }
            }
        }
        return false;
    }

    private Node<E> getNextElement(Node<E> current) {
        return current.getNextElement();

    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int counter;

            @Override
            public boolean hasNext() {
                return counter < size;
            }

            @Override
            public E next() {
                return getElementByIndex(counter++);
            }
        };
    }


}
