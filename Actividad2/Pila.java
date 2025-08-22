/**

 * Sigue el principio LIFO 
 * @param <T> El tipo de dato que almacenará la pila.
 */
public class Pila<T> {
    private Nodo<T> tope;

    /**
     * Constructor para crear una pila vacía.
     */
    public Pila() {
        this.tope = null;
    }

    /**
     * Verifica si la pila está vacía.
     * @return true si la pila no contiene elementos, false en caso contrario.
     */
    public boolean estaVacia() {
        return tope == null;
    }

    /**
     
     * @param dato El dato a agregar.
     */
    public void push(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato); // El constructor de Nodo ya valida si el dato es nulo.
        nuevoNodo.setSiguiente(tope);
        tope = nuevoNodo;
        System.out.println("Comando '" + dato + "' agregado al historial.");
    }

    /**
     * @return El dato en la parte superior, o null si la pila está vacía.
     */
    public T pop() {
        if (estaVacia()) {
            return null;
        }
        T dato = tope.getDato();
        tope = tope.getSiguiente();
        System.out.println("Comando '" + dato + "' deshecho.");
        return dato;
    }

    /**
    
     * @return El dato en la parte superior, o null si la pila está vacía.
     */
    public T peek() {
        return estaVacia() ? null : tope.getDato();
    }

    /**
     * Muestra todos los elementos de la pila desde el tope hasta el final.
     */
    public void mostrar() {
        if (estaVacia()) {
            System.out.println("El historial de comandos está vacío.");
            return;
        }
        Nodo<T> actual = tope;
        System.out.println("--- Historial de Comandos ---");
        while (actual != null) {
            System.out.println("-> " + actual.getDato());
            actual = actual.getSiguiente();
        }
    }
}