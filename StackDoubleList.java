// Implementación de Stack con Lista Doblemente Enlazada
public class StackDoubleList<E> implements Stack<E> {
    private DoubleLinkedList<E> list;
    
    public StackDoubleList() {
        list = new DoubleLinkedList<>();
    }
    
    public void push(E item) { list.add(item); }
    public E pop() { return list.remove(); }
    public E peek() { return list.isEmpty() ? null : list.remove(); }
    public boolean empty() { return list.isEmpty(); }
    public int size() { return list.size(); }
}