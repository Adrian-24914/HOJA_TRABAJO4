/**--------------------------------------
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * Ing. Douglas Barrios
 * @author: Jorge Villeda, Andrés Ismalej, Adrián Penagos
 * Fecha de finalización: 20/02/2025
 * --------------------------------------
*/
// Implementación de Stack con Lista Simplemente Enlazada
public class StackLinkedList<E> implements Stack<E> {
    private Lista<E> list;

    // Constructor que recibe la lista desde el exterior
    public StackLinkedList(Lista<E> list) {
        this.list = list;
    }

    public void push(E item) { 
        list.add(item); 
    }

    public E pop() { 
        return list.remove(); 
    }

    public E peek() { 
        if (list.isEmpty()) {
            return null;
        }
        E item = list.remove(); // Sacamos el primer elemento
        list.add(item); // Lo volvemos a insertar
        return item;
    }

    public boolean empty() { 
        return list.isEmpty(); 
    }

    public int size() { 
        return list.size(); 
    }
}
