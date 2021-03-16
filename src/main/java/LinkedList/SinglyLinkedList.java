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
        if (this.head == null) {
            this.head = new Link<>(value);
            head.setNext(null);
        } else {
            tail = head;
            while (tail.next != null) {
                tail = tail.getNext();
            }
            Link<T> newElement = new Link(value);
            tail.setNext(newElement);
        }
    }

    public T get(int index) {
        T valueAtIndex = null;
        int size = size();
        tail = head;

        if (size < index) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = 0; i < index+1; i++) {
            T value = tail.getValue();
            valueAtIndex = value;
            this.tail = tail.getNext();
        }
        return valueAtIndex;
    }

    /**
     * Returns the zero-based index of the first occurrence of a value in the list.
     *
     * @param number value to be searched
     * @return Index of 'number' if it's in the list, otherwise -1;
     */
    public int indexOf(T number) {
        int size = size();
        tail = head;
        if (tail == null ) return -1;

        for (int i = 0; i < size; i++) {
            T value = tail.getValue();
            if (number.equals(value)) {
                return i;
            } else {
                this.tail = tail.getNext();
            }
        }
        return -1;
    }


    public void insert(int index, T number) {
        this.size();
        Link<T> temp = new Link<>(number);
        tail = head;
        if (index < 0 ) {
            throw new IndexOutOfBoundsException();

        }else if (index == 0) {
            head = temp;
            temp.setNext(tail);
        } else {
            for (int i = 1; i < index; i++) {
                tail = tail.getNext();
            }
            temp.setNext(tail.getNext());
            tail.setNext(temp);
        }
    }


    public int size() {
        int counter = 0;
        if (this.head == null) {
            return counter;
        } else {
            tail = head;
            counter++;
            while (tail.next != null) {
                counter++;
                this.tail = this.tail.getNext();
            }
        }
        return counter;
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
