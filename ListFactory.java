/**--------------------------------------
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * Ing. Douglas Barrios
 * @author: Jorge Villeda, Andrés Ismalej, Adrián Penagos
 * Fecha de finalización: 20/02/2025
 * --------------------------------------
*/
// Factory para List
public class ListFactory {
    public static <E> Lista<E> getList(String type) {
        switch (type) {
            case "Simple": return new SimpleLinkedList<>();
            case "Double": return new DoubleLinkedList<>();
            default: return null;
        }
    }
}
