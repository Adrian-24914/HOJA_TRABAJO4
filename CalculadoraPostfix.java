/**--------------------------------------
 * Universidad del Valle de Guatemala
 * @author: Jorge Villeda, Andrés Ismalej, Adrián Penagos
 * Fecha de finalización: 20/02/2025
 * --------------------------------------
 */

 import java.util.Scanner;
 import java.util.Stack;
 
 /**
  * Clase que implementa la calculadora para evaluar expresiones en notación postfix.
  */
 public class CalculadoraPostfix {
     private Stack<Integer> stack;
 
     /**
      * Constructor
      */
     public CalculadoraPostfix() {
         stack = new Stack<>(); // Usamos Stack<Integer> de Java
     }
 
     /**
      * Evalúa una expresión en notación postfix y devuelve el resultado
      * @param operacion La expresión en notación postfix a evaluar.
      * @return El resultado de la operación.
      */
     public int evaluar(String operacion) {
         Scanner scanner = new Scanner(operacion);
 
         while (scanner.hasNext()) {
             if (scanner.hasNextInt()) {
                 stack.push(scanner.nextInt()); // Metemos el entero en la pila
             } else {
                 // Extraemos el operador y operamos con los últimos dos valores en la pila
                 String operador = scanner.next();
                 if (stack.size() < 2) {
                     throw new IllegalStateException("Expresión inválida: faltan operandos.");
                 }
                 int operandoB = stack.pop();
                 int operandoA = stack.pop();
                 int resultado = operar(operandoA, operandoB, operador);
                 stack.push(resultado);
             }
         }
         scanner.close();
         return stack.pop();
     }
 
     /**
      * Realiza una operación matemática entre dos operandos dados un operador.
      * @param operandoA El primer operando
      * @param operandoB El segundo operando
      * @param operador  El operador matemático
      * @return El resultado de la operación.
      * @throws ArithmeticException Si se intenta dividir entre cero.
      * @throws IllegalArgumentException Si el operador no es válido.
      */
     public int operar(int operandoA, int operandoB, String operador) {
         switch (operador) {
             case "+":
                 return operandoA + operandoB;
             case "-":
                 return operandoA - operandoB;
             case "*":
                 return operandoA * operandoB;
             case "/":
                 if (operandoB == 0) {
                     throw new ArithmeticException("Error: División por cero.");
                 }
                 return operandoA / operandoB;
             case "%":
                 return operandoA % operandoB;
             default:
                 throw new IllegalArgumentException("Operador no válido: " + operador);
         }
     }
 }
 