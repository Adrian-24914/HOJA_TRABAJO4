import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la implementación del Stack
        System.out.println("Seleccione la implementación de la pila: (ArrayList, Vector, SimpleList, DoubleList)");
        String stackType = scanner.nextLine();

        // Si elige una pila basada en listas, pedir la implementación de la lista
        String listType = null;
        if (stackType.equals("SimpleList") || stackType.equals("DoubleList")) {
            System.out.println("Seleccione la implementación de la lista: (Simple, Double)");
            listType = scanner.nextLine();
        }

        // Crear la pila usando la fábrica
        Stack<Integer> stack;
        if (stackType.equals("SimpleList") || stackType.equals("DoubleList")) {
            Lista<Integer> list = ListFactory.getList(listType);
            stack = new StackLinkedList<>(list);
        } else {
            stack = StackFactory.getStack(stackType);
        }

        // Verificar si se creó correctamente la pila
        if (stack == null) {
            System.out.println("Error: Implementación de pila no válida.");
            return;
        }

        System.out.println("Pila creada exitosamente: " + stack.getClass().getSimpleName());

        // Crear la instancia de la calculadora con la pila seleccionada
        CalculadoraPostfix calculadoraPF = new CalculadoraPostfix(stack);
        boolean CalcEncendida = true;

        while (CalcEncendida) {
            System.out.println("\nOpciones de la calculadora Postfix");
            System.out.println("1. Realizar una operación (separada por espacios)");
            System.out.println("2. Leer un archivo de texto");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            
            String opciones = scanner.nextLine();
            switch (opciones) {
                case "1":
                    System.out.print("Ingresa la operación (separada por espacios): ");
                    String operacion = scanner.nextLine();
                    try {
                        int resultado = calculadoraPF.evaluar(operacion);
                        System.out.println("El resultado de la operación: " + operacion  + " es: " + resultado);
                    } catch (Exception error) {
                        System.out.println("Hay un error: " + error.getMessage());
                    }
                    break;
                
                case "2":
                    System.out.print("Ingresa la ruta del archivo que deseas leer: ");
                    String PathDeArchivo = scanner.nextLine();
                    try (BufferedReader leer = new BufferedReader(new FileReader(PathDeArchivo))) {
                        String linea;
                        System.out.println("Resultados:");
                        while ((linea = leer.readLine()) != null) {
                            try {
                                int resultado = calculadoraPF.evaluar(linea);
                                System.out.println("El resultado de la operación: " + linea + " es: " + resultado);
                            } catch (Exception error) {
                                System.out.println("Existe un error en la línea/operación: " + linea + " el error se debe a: " + error.getMessage());
                            }
                        }
                    } catch (IOException error) {
                        System.out.println("No se pudo leer el archivo: " + error.getMessage());
                    }
                    break;

                case "3":
                    System.out.println("Saliendo...");
                    CalcEncendida = false;
                    break;

                default:
                    System.out.println("La opción elegida no está en las funciones.");
            }
            System.out.println();
        }
        scanner.close();
    }
}
