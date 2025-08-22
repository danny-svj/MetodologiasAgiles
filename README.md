# Estructura de Datos
Actividad2

Actividad 2: Simulador de Sistema Operativo
1. Introducción al Proyecto
Este proyecto es una simulación de un sistema operativo básico que utiliza dos estructuras de datos fundamentales implementadas con listas ligadas:

Pila (Stack): Para el historial de comandos, siguiendo el principio LIFO (Last In, First Out).

Cola (Queue): Para la cola de programas en espera, siguiendo el principio FIFO.

La aplicación funciona a través de un menú interactivo en la terminal, donde el usuario puede realizar acciones como ejecutar comandos, deshacerlos y gestionar programas.

2. Guía de Ejecución
Para ejecutar el programa y probar sus funcionalidades, siga estos sencillos pasos:

Abrir el Proyecto: Abra la carpeta del proyecto en su entorno de Java (como Visual Studio Code).

Ir al Archivo Principal: Navegue al archivo SistemaOperativo.java.

Ejecutar el Código:

En Visual Studio Code: En la parte superior derecha del editor, hay un botón de "Play" (ejecutar). Haga clic en él.

En la Terminal: Si prefiere usar la terminal integrada, puede compilar y ejecutar el código con los siguientes comandos:

Para compilar: javac SistemaOperativo.java

Para ejecutar: java SistemaOperativo

3. Interacción con el Programa y Verificación
Una vez que el programa se esté ejecutando, la terminal mostrará un menú interactivo. A continuación, se detalla qué hace cada opción y qué se espera ver:

3.1. Probar la Pila (Historial de Comandos)
Paso 1: Agregar comandos.

Comando: Escriba 1 y presione Enter. Cuando se le pida, escriba un comando como mkdir proyectos y presione Enter.

Qué sucede: El programa llamará al método push() y el comando se agregará a la cima de la pila.

Verificación: La terminal mostrará "Comando 'mkdir proyectos' agregado al historial.". Repita este paso con otros comandos como cd proyectos y touch index.html.

Paso 2: Mostrar el historial.

Comando: Escriba 5 y presione Enter.

Qué sucede: El programa llamará al método mostrar() para recorrer la pila.

Verificación: Deberá ver la lista de comandos, con el último comando (touch index.html) en la parte superior.

Paso 3: Deshacer un comando.

Comando: Escriba 2 y presione Enter.

Qué sucede: El programa llamará al método pop() y removerá el comando de la cima de la pila (LIFO).

Verificación: La terminal mostrará "Comando 'touch index.html' deshecho.". Si vuelve a usar la opción 5, verá que ese comando ya no está en el historial.

3.2. Probar la Cola (Programas en Espera)
Paso 1: Agregar programas a la cola.

Comando: Escriba 3 y presione Enter. Cuando se le pida, escriba el nombre de un programa como Navegador y presione Enter.

Qué sucede: El programa llamará al método enqueue() y el programa se agregará al final de la cola.

Verificación: La terminal mostrará "Programa 'Navegador' agregado a la cola.". Repita este paso con otros programas como EditorDeTexto.

Paso 2: Mostrar la cola.

Comando: Escriba 5 y presione Enter.

Qué sucede: El programa llamará al método mostrar() para recorrer la cola.

Verificación: Deberá ver los programas en el orden en que los agregó (Navegador, EditorDeTexto).

Paso 3: Procesar el siguiente programa.

Comando: Escriba 4 y presione Enter.

Qué sucede: El programa llamará al método dequeue() y procesará el programa del frente de la cola (FIFO).

Verificación: La terminal mostrará "Programa 'Navegador' procesado.". Si vuelve a usar la opción 5, verá que el Navegador ya no está en la cola y ahora el EditorDeTexto está al frente.
