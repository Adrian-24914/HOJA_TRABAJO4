/**--------------------------------------
 * Universidad del Valle de Guatemala
 * @author: Jorge Villeda, Andrés Ismalej, Adrián Penagos
 * Fecha de finalización: 20/02/2025
 * --------------------------------------
 */

// Implementación de Lista Simplemente Enlazada
class Node<E> {
    E data;
    Node<E> next;
    
    Node(E data) { this.data = data; this.next = null; }
}

public class SimpleLinkedList<E> implements Lista<E> {
    private Node<E> head;
    private int size;
    
    public SimpleLinkedList() { head = null; size = 0; }
    
    public void add(E item) {
        Node<E> newNode = new Node<>(item);
        newNode.next = head;
        head = newNode;
        size++;
    }
    
    public E remove() {
        if (isEmpty()) return null;
        E data = head.data;
        head = head.next;
        size--;
        return data;
    }
    
    public boolean isEmpty() { return head == null; }
    public int size() { return size; }
}