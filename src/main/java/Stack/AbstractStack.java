package Stack;


public interface AbstractStack<E> {

    E push(E element);
    E pop();
    E peek();
    int size();
    boolean isEmpty();

}
