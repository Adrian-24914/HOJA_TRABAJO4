// Implementación de Stack con Lista Simplemente Enlazada
public class StackLinkedList<E> implements Stack<E> {
    private SimpleLinkedList<E> list;
    
    public StackLinkedList() {
        list = new SimpleLinkedList<>();
    }
    
    public void push(E item) { list.add(item); }
    public E pop() { return list.remove(); }
    public E peek() { return list.isEmpty() ? null : list.remove(); }
    public boolean empty() { return list.isEmpty(); }
    public int size() { return list.size(); }
}