public interface Lista<E> {
    void add(E item);
    E remove();
    boolean isEmpty();
    int size();
}