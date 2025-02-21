/**--------------------------------------
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * Ing. Douglas Barrios
 * @author: Jorge Villeda, Andrés Ismalej, Adrián Penagos
 * Fecha de finalización: 20/02/2025
 * --------------------------------------
*/
// Factory para Stack
public class StackFactory {
    public static <E> Stack<E> getStack(String type) {
        switch (type) {
            case "ArrayList": return new StackArrayList<>();
            case "Vector": return new StackVector<>();
            case "SimpleList": return new StackLinkedList<>();
            case "DoubleList": return new StackDoubleList<>();
            default: return null;
        }
    }
}
