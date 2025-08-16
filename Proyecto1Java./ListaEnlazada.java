// ListaEnlazada.java
import java.util.Objects;

public class ListaEnlazada<T> {
    protected Nodo<T> cabeza;
    protected Nodo<T> cola;
    protected String tipo;

    public ListaEnlazada(String tipo) {
        this.cabeza = null;
        this.cola = null;
        this.tipo = tipo;
    }

    public void agregar(T dato) {
        // Método base que será sobreescrito por las subclases
    }

    public void eliminar(T dato) {
        // Método base que será sobreescrito por las subclases
    }

    public boolean buscar(T dato) {
        Nodo<T> actual = cabeza;
        if (actual == null) {
            return false;
        }

        do {
            if (Objects.equals(actual.dato, dato)) {
                return true;
            }
            actual = actual.siguiente;
        } while (actual != null && !esFin(actual));
        return false;
    }

    public void mostrar() {
        Nodo<T> actual = cabeza;
        if (actual == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        System.out.print(this.tipo + ": ");
        do {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        } while (actual != null && !esFin(actual));
        System.out.println("FIN");
    }

    // Método auxiliar para manejar la condición de fin en listas circulares
    protected boolean esFin(Nodo<T> nodo) {
        return nodo == cabeza && tipo.equals("Circular");
    }
}