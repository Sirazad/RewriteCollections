package Stack;


public interface AbstractStack<E> {

    boolean push(E element);

    E pop();

    E peek();
    int size();

    boolean isEmpty();

}
