/**--------------------------------------
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * Ing. Douglas Barrios
 * @author: Jorge Villeda, Andrés Ismalej, Adrián Penagos
 * Fecha de finalización: 20/02/2025
 * --------------------------------------
*/
// Implementación de Lista Doblemente Enlazada
class DoubleNode<E> {
    E data;
    DoubleNode<E> next, prev;
    
    DoubleNode(E data) { this.data = data; next = prev = null; }
}

public class DoubleLinkedList<E> implements Lista<E> {
    private DoubleNode<E> head, tail;
    private int size;
    
    public DoubleLinkedList() { head = tail = null; size = 0; }
    
    public void add(E item) {
        DoubleNode<E> newNode = new DoubleNode<>(item);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    
    public E remove() {
        if (isEmpty()) return null;
        E data = head.data;
        head = head.next;
        if (head != null) head.prev = null;
        else tail = null;
        size--;
        return data;
    }
    
    public boolean isEmpty() { return head == null; }
    public int size() { return size; }
}

