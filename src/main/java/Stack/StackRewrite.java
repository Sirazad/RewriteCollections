package Stack;

import java.util.ArrayList;
import java.util.List;

public class StackRewrite <E> implements AbstractStack {

    private List<E> elements = new ArrayList<>();
    private int size = 0;



    @Override
    public E push(Object element) {
        elements.add((E) element);
        size++;
        return (E) element;
    }

    @Override
    public Object pop() {
        return null;
    }

    @Override
    public Object peek() {
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {

        return (size == 0);
    }
}
