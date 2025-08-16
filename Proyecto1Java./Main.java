// Main.java
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static ListaEnlazada<Object> listaActual = null;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n--- Menú Principal ---");
            System.out.println("1. Seleccionar tipo de lista");
            System.out.println("2. Operaciones con la lista actual");
            System.out.println("3. Ver ejemplos de tipos de datos");
            System.out.println("4. Gestión de contactos");
            System.out.println("5. Salir");
            System.out.print("Opción: ");

            try {
                int opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1:
                        seleccionarTipoDeLista(scanner);
                        break;
                    case 2:
                        realizarOperaciones(scanner, listaActual);
                        break;
                    case 3:
                        EjemplosTiposDatos.mostrarEjemplos();
                        break;
                    case 4:
                        gestionarContactos(scanner);
                        break;
                    case 5:
                        System.out.println("¡Adiós!");
                        return;
                    default:
                        System.out.println("Opción no válida. Inténtelo de nuevo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número.");
                scanner.nextLine();
            }
        }
    }

    private static void seleccionarTipoDeLista(Scanner scanner) {
        System.out.println("\n--- Tipos de Lista ---");
        System.out.println("1. Simple");
        System.out.println("2. Doble");
        System.out.println("3. Circular");
        System.out.print("Elija un tipo de lista: ");
        int eleccion = scanner.nextInt();
        scanner.nextLine();

        switch (eleccion) {
            case 1:
                listaActual = new ListaSimple<>();
                System.out.println("Lista simple creada.");
                break;
            case 2:
                listaActual = new ListaDoble<>();
                System.out.println("Lista doble creada.");
                break;
            case 3:
                listaActual = new ListaCircular<>();
                System.out.println("Lista circular creada.");
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

    private static void realizarOperaciones(Scanner scanner, ListaEnlazada<Object> lista) {
        if (lista == null) {
            System.out.println("Primero debe seleccionar un tipo de lista.");
            return;
        }

        while (true) {
            System.out.println("\n--- Operaciones con la Lista ---");
            System.out.println("1. Agregar elemento");
            System.out.println("2. Eliminar elemento");
            System.out.println("3. Buscar elemento");
            System.out.println("4. Mostrar lista");
            System.out.println("5. Volver al menú principal");
            System.out.print("Opción: ");

            int op = scanner.nextInt();
            scanner.nextLine();

            switch (op) {
                case 1:
                    System.out.print("Elemento a agregar: ");
                    String datoAgregar = scanner.nextLine();
                    lista.agregar(datoAgregar);
                    System.out.println("Elemento agregado.");
                    break;
                case 2:
                    System.out.print("Elemento a eliminar: ");
                    String datoEliminar = scanner.nextLine();
                    lista.eliminar(datoEliminar);
                    System.out.println("Elemento eliminado.");
                    break;
                case 3:
                    System.out.print("Elemento a buscar: ");
                    String datoBuscar = scanner.nextLine();
                    if (lista.buscar(datoBuscar)) {
                        System.out.println("¡El elemento fue encontrado!");
                    } else {
                        System.out.println("El elemento no se encontró.");
                    }
                    break;
                case 4:
                    lista.mostrar();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    private static void gestionarContactos(Scanner scanner) {
        ListaEnlazada<Contacto> listaContactos = new ListaDoble<>();
        
        while (true) {
            System.out.println("\n--- Gestión de Contactos ---");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Eliminar contacto");
            System.out.println("3. Buscar contacto");
            System.out.println("4. Mostrar todos los contactos");
            System.out.println("5. Volver al menú principal");
            System.out.print("Opción: ");

            try {
                int op = scanner.nextInt();
                scanner.nextLine();
                
                switch (op) {
                    case 1:
                        System.out.print("Nombre: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Teléfono: ");
                        String telefono = scanner.nextLine();
                        System.out.print("Dirección: ");
                        String direccion = scanner.nextLine();
                        listaContactos.agregar(new Contacto(nombre, direccion, telefono));
                        System.out.println("Contacto agregado.");
                        break;
                    case 2:
                        System.out.print("Nombre del contacto a eliminar: ");
                        String nombreEliminar = scanner.nextLine();
                        Contacto contactoFantasma = new Contacto(nombreEliminar, null, null); 
                        listaContactos.eliminar(contactoFantasma);
                        System.out.println("Contacto eliminado si existía.");
                        break;
                    case 3:
                        System.out.print("Nombre del contacto a buscar: ");
                        String nombreBuscar = scanner.nextLine();
                        Contacto contactoBuscar = new Contacto(nombreBuscar, null, null);
                        if (listaContactos.buscar(contactoBuscar)) {
                            System.out.println("¡El contacto fue encontrado!");
                        } else {
                            System.out.println("El contacto no se encontró.");
                        }
                        break;
                    case 4:
                        listaContactos.mostrar();
                        break;
                    case 5:
                        return;
                    default:
                        System.out.println("Opción no válida.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número.");
                scanner.nextLine();
            }
        }
    }
}