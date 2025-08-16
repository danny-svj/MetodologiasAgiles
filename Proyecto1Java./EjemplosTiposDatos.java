// EjemplosTiposDeDatos.java
public class EjemplosTiposDatos {

    public static void mostrarEjemplos() {
        System.out.println("\n--- Ejemplos de datos que se pueden guardar ---");

        ListaEnlazada<Object> numeros = new ListaSimple<>(); // Usa ListaSimple para este ejemplo
        numeros.agregar(123);
        numeros.agregar(45.67);
        System.out.println("Lista de números:");
        numeros.mostrar();

        ListaEnlazada<Object> palabras = new ListaSimple<>();
        palabras.agregar("Hola");
        palabras.agregar("Mundo");
        System.out.println("Lista de palabras:");
        palabras.mostrar();

        ListaEnlazada<Contacto> contactos = new ListaDoble<>();
        Contacto juan = new Contacto("Juan Perez", "Calle Falsa 123", "8112345678");
        Contacto maria = new Contacto("Maria Lopez", "Avenida Siempre Viva 742", "8187654321");
        contactos.agregar(juan);
        contactos.agregar(maria);

        System.out.println("Lista de contactos:");
        contactos.mostrar();
    }
}