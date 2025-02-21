/**--------------------------------------
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * Ing. Douglas Barrios
 * @author: Jorge Villeda, Andrés Ismalej, Adrián Penagos
 * Fecha de finalización: 20/02/2025
 * --------------------------------------
*/

/**
 * Interface for a Postfix Calculator.
 * Provides methods to evaluate postfix expressions and perform operations.
 */
public interface Interfaz {
    int evaluar(String operacion); // Evaluar la operación y devolver el resultado
    int operar(int operandoA, int operandoB, String operador); // Realizar operación con dos operandos
}
