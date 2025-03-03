/**--------------------------------------
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * Ing. Douglas Barrios
 * @author: Jorge Villeda, Andrés Ismalej, Adrián Penagos
 * Fecha de finalización: 20/02/2025
 * --------------------------------------
*/
import java.util.ArrayList;
public class StackArrayList<E> implements Stack<E> {
    private ArrayList<E> stack;
    
    public StackArrayList() {
        stack = new ArrayList<>();
    }
    
    public void push(E item) { stack.add(item); }
    public E pop() { return empty() ? null : stack.remove(stack.size() - 1); }
    public E peek() { return empty() ? null : stack.get(stack.size() - 1); }
    public boolean empty() { return stack.isEmpty(); }
    public int size() { return stack.size(); }
}
