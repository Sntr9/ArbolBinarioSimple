
# Aplicación de Editor de Texto en Consola (Java)

## ¿QUE ES UN ARBOL BINARIO?
Imagina un árbol genealógico, pero con números.

Un Árbol Binario es una estructura de datos jerárquica (como un organigrama) donde cada elemento, llamado Nodo, tiene como máximo dos hijos o ramificaciones: uno a la izquierda y otro a la derecha.

Específicamente, este proyecto usa un **Árbol Binario de Búsqueda (ABB)**, regla muy estricta para mantener datos ordenados:

1.  El valor de un nodo en el subárbol **izquierdo** siempre debe ser **menor** que el valor del nodo padre.
2.  El valor de un nodo en el subárbol **derecho** siempre debe ser **mayor** que el valor del nodo padre.

Esta regla es lo que permite que la búsqueda y el ordenamiento sean muy rápidos.

## Implementación en Java

El código está dividido en tres componentes principales, todos contenidos en el archivo `App.java`:

### Clase Nodo
Representa cada caja de datos en el árbol. Contiene:
* `valor`: El número entero almacenado.
* `izquierda`: Una referencia al nodo hijo izquierdo.
* `derecha`: Una referencia al nodo hijo derecho.

### Clase ArbolBinario
Maneja la lógica del árbol, incluyendo la **raíz** (el punto de partida del árbol) y los siguientes métodos:

* `insertar`
* `recorrido`
* `buscar`

### Clase App (Clase Principal)
Contenido el método `main` y el menú interactivo en consola para que el usuario pueda probar todas las funcionalidades.


## Ejecución en Consola

Al ejecutar el programa, aparecerá el menú:
<img width="840" height="143" alt="image" src="https://github.com/user-attachments/assets/b814fbd7-df48-4f91-8880-4738b03f4c5e" />
<img width="806" height="455" alt="image" src="https://github.com/user-attachments/assets/86f79abe-0e23-4f35-adb1-67f356a10fa2" />
<img width="807" height="457" alt="image" src="https://github.com/user-attachments/assets/f8c45e28-f0b1-4b8a-9ef2-84c7bdc3dd5b" />


## Contribuyentes
* **Santiago Lopez Restrepo** - (santiago.lopezr@est.iudigital.edu.co )

## DOCENTE

* **Steven Zuluaga Cortes** 




