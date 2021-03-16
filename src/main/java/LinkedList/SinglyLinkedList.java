package LinkedList;

public class SinglyLinkedList<T> {

    private class Link<T> {

        private T value;
        private Link<T> next;

        Link(T value) {
            this.value = value;
        }

        T getValue() {
            return value;
        }

        Link<T> getNext() {
            return next;
        }

        void setNext(Link<T> next) {
            this.next = next;
        }
    }

    private Link<T> head;
    private Link<T> tail;

    public SinglyLinkedList() {
    }


    public void add(T value) {
    }

    public T get(int index) {
        return null;
    }

    /**
     * Returns the zero-based index of the first occurrence of a value in the list.
     *
     * @param number value to be searched
     * @return Index of 'number' if it's in the list, otherwise -1;
     */
    public int indexOf(T number) {
        return -1;
    }

    public void insert(int index, T number) {
    }


    public int size() {
        return 0;
    }

    /**
     * Removes the element at 'index' from the array.
     *
     * @param index Position of value to be deleted.
     */
    public void remove(int index) {
        if (index == 0) {
            if (head == null) {
                throw new IndexOutOfBoundsException();
            } else {
                head = head.getNext();
            }
            return;
        }
        Link<T> elementBeforeIndex = head;
        while (index - 1 > 0) {
            elementBeforeIndex = elementBeforeIndex.getNext();
            index--;
            if (elementBeforeIndex == null) {
                throw new IndexOutOfBoundsException();
            }
        }
        Link<T> elementAtIndex = elementBeforeIndex.getNext();
        if (elementAtIndex == null) {
            throw new IndexOutOfBoundsException();
        }
        elementBeforeIndex.setNext(elementAtIndex.getNext());
    }

    /**
     *
     Override the toString() method: returns the string representation of the list content
     In case of empty list toString() returns with "[]"
     In case of non-empty array the toString() method returns with the inserted elements in the following form: "[1, 5, 10, 654]"
     */

    public String toString() {
        int size = size();
        tail = head;
        String list = "[";
        if (size == 0) {
            return "[]";
        } else {
            for (int i = 0; i < size; i++) {
                list += tail.getValue();
                if (tail.getNext()!= null) list += ", ";
                tail = tail.getNext();
            }
            list += "]";
        }
        return list;
    }


}