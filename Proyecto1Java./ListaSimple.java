// ListaSimple.java
public class ListaSimple<T> extends ListaEnlazada<T> {
    public ListaSimple() {
        super("Simplemente Enlazada");
    }

    @Override
    public void agregar(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            cola.siguiente = nuevoNodo;
            cola = nuevoNodo;
        }
    }

    @Override
    public void eliminar(T dato) {
        if (cabeza == null) return;
        if (cabeza.dato.equals(dato)) {
            cabeza = cabeza.siguiente;
            return;
        }
        Nodo<T> actual = cabeza;
        while (actual.siguiente != null && !actual.siguiente.dato.equals(dato)) {
            actual = actual.siguiente;
        }
        if (actual.siguiente != null) {
            actual.siguiente = actual.siguiente.siguiente;
        }
    }
}