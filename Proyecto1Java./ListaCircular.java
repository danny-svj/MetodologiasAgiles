// ListaCircular.java
public class ListaCircular<T> extends ListaEnlazada<T> {
    public ListaCircular() {
        super("Circular");
    }

    @Override
    public void agregar(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
            cola.siguiente = cabeza;
        } else {
            cola.siguiente = nuevoNodo;
            nuevoNodo.anterior = cola;
            cola = nuevoNodo;
            cola.siguiente = cabeza;
        }
    }

    @Override
    public void eliminar(T dato) {
        if (cabeza == null) return;
        Nodo<T> actual = cabeza;
        do {
            if (actual.dato.equals(dato)) {
                if (actual == cabeza) {
                    cabeza = cabeza.siguiente;
                    cola.siguiente = cabeza;
                    if (cabeza == actual) { // Si solo había un nodo
                        cabeza = null;
                        cola = null;
                    }
                } else {
                    actual.anterior.siguiente = actual.siguiente;
                    actual.siguiente.anterior = actual.anterior;
                    if (actual == cola) {
                        cola = actual.anterior;
                    }
                }
                return;
            }
            actual = actual.siguiente;
        } while (actual != cabeza);
    }
}