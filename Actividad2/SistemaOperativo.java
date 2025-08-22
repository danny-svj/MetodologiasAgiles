import java.util.InputMismatchException;
import java.util.Scanner;

/**

 * Demuestra el uso de las estructuras de datos Pila y Cola.
 */
public class SistemaOperativo {
    private Pila<String> historialComandos;
    private Cola<String> colaProgramas;

    /**
     * Constructor para inicializar el sistema operativo con pilas y colas vacías.
     */
    public SistemaOperativo() {
        this.historialComandos = new Pila<>();
        this.colaProgramas = new Cola<>();
    }

    /**
     * Ejecuta un comando y lo agrega al historial.
     * @param comando El comando a ejecutar.
     */
    public void ejecutarComando(String comando) {
        if (comando != null && !comando.trim().isEmpty()) {
            historialComandos.push(comando);
        } else {
            System.out.println("Error: El comando no puede estar vacío.");
        }
    }

    /**
     * Deshace el último comando ejecutado.
     */
    public void deshacerComando() {
        System.out.println("Intentando deshacer el último comando...");
        if (historialComandos.pop() == null) {
            System.out.println("¡No se puede deshacer! El historial de comandos ya está vacío.");
        }
    }

    /**
     * Agrega un programa a la cola de ejecución.
     * @param programa El programa a agregar.
     */
    public void agregarPrograma(String programa) {
        if (programa != null && !programa.trim().isEmpty()) {
            colaProgramas.enqueue(programa);
        } else {
            System.out.println("Error: El programa no puede estar vacío.");
        }
    }

    /**
     * Procesa el siguiente programa en la cola.
     */
    public void procesarSiguientePrograma() {
        System.out.println("Intentando procesar el siguiente programa...");
        if (colaProgramas.dequeue() == null) {
            System.out.println("¡No hay programas para procesar! La cola de programas está vacía.");
        }
    }

    /**
     * Muestra el estado actual del sistema, incluyendo el historial de comandos y la cola de programas.
     */
    public void mostrarEstado() {
        System.out.println("\n===== Estado Actual del Sistema Operativo =====");
        historialComandos.mostrar();
        System.out.println();
        colaProgramas.mostrar();
        System.out.println("===============================================\n");
    }

    /**
     * Método principal para iniciar la simulación y recibir entrada del usuario.
     */
    public static void main(String[] args) {
        SistemaOperativo so = new SistemaOperativo();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 6) {
            System.out.println("--- SIMULADOR DE SISTEMA OPERATIVO ---");
            System.out.println("1. Ejecutar un comando (ej: 'mkdir')");
            System.out.println("2. Deshacer el último comando");
            System.out.println("3. Agregar un programa a la cola (ej: 'Navegador')");
            System.out.println("4. Procesar siguiente programa");
            System.out.println("5. Mostrar estado actual");
            System.out.println("6. Salir");
            System.out.println("---------------------------------------");
            System.out.print("Ingrese el número de la acción: ");
            
            try {
                opcion = scanner.nextInt();
                scanner.nextLine(); // Consume la nueva línea
                
                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese el comando a ejecutar: ");
                        String comando = scanner.nextLine();
                        so.ejecutarComando(comando);
                        break;
                    case 2:
                        so.deshacerComando();
                        break;
                    case 3:
                        System.out.print("Ingrese el nombre del programa: ");
                        String programa = scanner.nextLine();
                        so.agregarPrograma(programa);
                        break;
                    case 4:
                        so.procesarSiguientePrograma();
                        break;
                    case 5:
                        so.mostrarEstado();
                        break;
                    case 6:
                        System.out.println("Saliendo de la simulación...");
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, ingrese un número del 1 al 6.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada no válida. Por favor, ingrese un número.");
                scanner.nextLine(); // Limpia el buffer para evitar un bucle infinito
                opcion = 0; // Reinicia la opción para continuar el bucle
            }
        }

        scanner.close();
    }
}