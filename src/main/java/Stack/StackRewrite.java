package Stack;

public class StackRewrite <E> implements AbstractStack {

    private int size = 0;

    @Override
    public boolean push(Object element) {
        return false;
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
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
