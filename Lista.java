/**--------------------------------------
 * Universidad del Valle de Guatemala
 * @author: Jorge Villeda, Andrés Ismalej, Adrián Penagos
 * Fecha de finalización: 20/02/2025
 * --------------------------------------
 */

public interface Lista<E> {
    void add(E item);
    E remove();
    boolean isEmpty();
    int size();
}