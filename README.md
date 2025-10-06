
# Aplicación de Editor de Texto en Consola (Java)

## ¿QUE ES UN ARBOL BINARIO?
Imagina un árbol genealógico, pero con números.

Un Árbol Binario es una estructura de datos jerárquica (como un organigrama) donde cada elemento, llamado Nodo, tiene como máximo dos hijos o ramificaciones: uno a la izquierda y otro a la derecha.

Específicamente, este proyecto usa un **Árbol Binario de Búsqueda (ABB)**, que sigue una regla muy estricta para mantener los datos ordenados:

1.  El valor de un nodo en el subárbol **izquierdo** siempre debe ser **menor** que el valor del nodo padre.
2.  El valor de un nodo en el subárbol **derecho** siempre debe ser **mayor** que el valor del nodo padre.

Esta regla es lo que permite que la búsqueda y el ordenamiento sean muy rápidos.

## Implementación en Java

El código está dividido en tres componentes principales, todos contenidos en el archivo `App.java`:

### Clase `Nodo`
Representa cada caja de datos en el árbol. Contiene:
* `valor`: El número entero almacenado.
* `izquierda`: Una referencia al nodo hijo izquierdo.
* `derecha`: Una referencia al nodo hijo derecho.

### Clase `ArbolBinario`
Maneja la lógica del árbol, incluyendo la **raíz** (el punto de partida del árbol) y los siguientes métodos:

| Método | Función | Definición |
| :--- | :--- | :--- |
| `insertar(valor)` | **Inserción** | Recorre el árbol recursivamente desde la raíz, siguiendo la regla del ABB (menor a izquierda, mayor a derecha) hasta encontrar un espacio libre. |
| `recorridoInorden()` | **Recorrido** | Sigue la secuencia: **Izquierda → Raíz → Derecha**. Este recorrido es la **prueba de fuego** del ABB, ya que siempre mostrará los números **ordenados** de menor a mayor. |
| `buscar(valor)` | **Búsqueda** | Utiliza la misma lógica de inserción para reducir el área de búsqueda, yendo a la izquierda o derecha en cada paso, lo que hace la búsqueda muy eficiente. |

### Clase `App` (Clase Principal)
Contiene el método `main` y el **menú interactivo en consola** para que el usuario pueda probar todas las funcionalidades.


## Ejecución en Consola

Al ejecutar el programa, aparecerá el menú:



## Contribuyentes
* **Santiago Lopez Restrepo** - (santiago.lopezr@est.iudigital.edu.co )

## DOCENTE

* **Steven Zuluaga Cortes** 
