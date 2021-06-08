package Stack;

import java.util.ArrayList;
import java.util.List;

public class StackRewrite <E> implements AbstractStack {

    private List<E> elements = new ArrayList<>();
    private int size = 0;
    private E lastElement = null;

    @Override
    public E push(Object element) {
        elements.add((E) element);
        size++;
        lastElement = (E) element;
        return lastElement;
    }

    @Override
    public E pop() {
        if (size == 0) return null;
        E removed = lastElement;
        elements.remove(lastElement);
        lastElement = elements.get(--size-1);
        return removed;
    }

    @Override
    public E peek() {
        return (lastElement== null)?null:lastElement;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return (size == 0);
    }

    @Override
    public String toString() {
        if (isEmpty()) return "The stack is empty.";
        StringBuilder sb = new StringBuilder();
        int count = size;
        for (E element : elements) {
            sb.append(element);
            if (--count > 0) sb.append(", ");
        }
        return sb.toString();
    }
}
