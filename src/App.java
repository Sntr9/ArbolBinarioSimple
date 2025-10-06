import java.util.InputMismatchException;
import java.util.Scanner;

// Estructura básica de cada elemento del árbol

class Nodo {
    int valor;
    Nodo izquierda;
    Nodo derecha;

    public Nodo(int valor) {
        this.valor = valor;
        this.izquierda = null;
        this.derecha = null;
    }
}


// Lógica del Árbol Binario de Búsqueda
class ArbolBinario {
    Nodo raiz;

    public ArbolBinario() {
        this.raiz = null;
    }

    // --- Insertar ---
    public void insertar(int valor) {
        raiz = insertarRecursivo(raiz, valor);
    }

    private Nodo insertarRecursivo(Nodo actual, int valor) {
        // Identificación nodo actual nulo, se crea un nuevo nodo y se devuelve.
        if (actual == null) {
            return new Nodo(valor);
        }

        // Regla del ABB: Menor a la izquierda, mayor a la derecha.
        if (valor < actual.valor) {
            actual.izquierda = insertarRecursivo(actual.izquierda, valor);
        } else if (valor > actual.valor) {
            actual.derecha = insertarRecursivo(actual.derecha, valor);
        }
        // Si el valor es igual, no se realiza no se permiten duplicados.

        return actual;
    }

    // Recorrido Inorden 
    // Elementos en orden ascendente, evidenciando el orden del ABB.
    public void recorridoInorden() {
        System.out.print("Recorrido Inorden: ");
        inordenRecursivo(raiz);
        System.out.println();
    }

    private void inordenRecursivo(Nodo nodo) {
        if (nodo != null) {
            inordenRecursivo(nodo.izquierda); // 1. Izquierda
            System.out.print(nodo.valor + " "); // 2. Raíz (Imprimir)
            inordenRecursivo(nodo.derecha); // 3. Derecha
        }
    }

    //Buscar
    public boolean buscar(int valor) {
        return buscarRecursivo(raiz, valor);
    }

    private boolean buscarRecursivo(Nodo actual, int valor) {
        // Si llega a un nodo nulo, significara que no encontro.
        if (actual == null) {
            return false;
        }

        // Si lo encuentra en el nodo actual.
        if (valor == actual.valor) {
            return true;
        }

        // Definción si ir a la izquierda o a la derecha (optimización del ABB).
        if (valor < actual.valor) {
            return buscarRecursivo(actual.izquierda, valor);
        } else {
            return buscarRecursivo(actual.derecha, valor);
        }
    }
}


// Contenido método main y menú de consola
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArbolBinario arbol = new ArbolBinario();
        int opcion = 0;

        System.out.println("Árbol Binario de Búsqueda ");

        while (opcion != 4) {
            System.out.println("\n--- MENÚ DE OPCIONES ---");
            System.out.println("1. Insertar número en el árbol");
            System.out.println("2. Mostrar recorrido Inorden (Datos ordenados)");
            System.out.println("3. Buscar un número");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                // Leer la opción
                opcion = scanner.nextInt();
                int numero;

                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese el número a insertar: ");
                        numero = scanner.nextInt();
                        arbol.insertar(numero);
                        System.out.println(" Número " + numero + " insertado correctamente.");
                        break;

                    case 2:
                        // Muestra el recorrido Inorden, datos ordenados.
                        if (arbol.raiz == null) {
                            System.out.println("El árbol está vacío. Inserte datos primero.");
                        } else {
                            arbol.recorridoInorden();
                            System.out.println(" Nota: El recorrido Inorden muestra los datos ordenados (menor a mayor).");
                        }
                        break;

                    case 3:
                        System.out.print("Ingrese el número a buscar: ");
                        numero = scanner.nextInt();
                        if (arbol.buscar(numero)) {
                            System.out.println(" El número " + numero + " SÍ se encuentra en el árbol.");
                        } else {
                            System.out.println(" El número " + numero + " NO se encuentra en el árbol.");
                        }
                        break;

                    case 4:
                        System.out.println(" Saliendo del programa. ¡Hasta luego!");
                        break;

                    default:
                        System.out.println("Opción no válida. Por favor, ingrese un número entre 1 y 4.");
                }
            } catch (InputMismatchException e) {
                System.out.println(" Error: Entrada inválida. Por favor, ingrese un número entero.");
                scanner.next(); // Limpia del buffer para evitar un bucle infinito en el sistema
                opcion = 0; // Reinicia la opción para que el bucle continúe
            }
        }
        scanner.close();
    }

}
