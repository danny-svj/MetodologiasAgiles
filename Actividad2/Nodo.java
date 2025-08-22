/**
 * Clase que representa un nodo genérico para listas ligadas.
 * Cada nodo contiene un dato y una referencia al siguiente nodo.
 * @param <T> El tipo de dato que almacenará el nodo.
 */
public class Nodo<T> {
    private T dato;
    private Nodo<T> siguiente;

    /**
    
     * @param dato El dato a almacenar en el nodo. No puede ser nulo.
     * @throws IllegalArgumentException si el dato proporcionado es nulo.
     */
    public Nodo(T dato) {
        if (dato == null) {
            throw new IllegalArgumentException("El dato del nodo no puede ser nulo.");
        }
        this.dato = dato;
        this.siguiente = null;
    }

    /**
     * Obtiene el dato almacenado en el nodo.
     * @return El dato del nodo.
     */
    public T getDato() {
        return dato;
    }

    /**
     * Obtiene una referencia al siguiente nodo.
     * @return El siguiente nodo en la lista.
     */
    public Nodo<T> getSiguiente() {
        return siguiente;
    }

    /**
     * Establece el siguiente nodo.
     * @param siguiente El nodo a establecer como siguiente.
     */
    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }
}