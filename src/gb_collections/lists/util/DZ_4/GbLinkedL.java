package gb_collections.lists.util.DZ_4;

import java.util.Iterator;

public interface GbLinkedL<E> extends Iterable<E> {
    void addLastValue(E e);

    void addFirstValue(E e);

    int size();

    E getElementByIndex(int counter);

    E unlink1(Node<E> value);


    boolean remove1(Object o);

    Iterator<E> iterator();
}
