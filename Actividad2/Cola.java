/**

 * Sigue el principio FIFO 
 * @param <T> El tipo de dato que almacenará la cola.
 */
public class Cola<T> {
    private Nodo<T> frente;
    private Nodo<T> finalCola;

    /**
     * Constructor para crear una cola vacía.
     */
    public Cola() {
        this.frente = null;
        this.finalCola = null;
    }

    /**
     * Verifica si la cola está vacía.
     * @return true si la cola no contiene elementos, false en caso contrario.
     */
    public boolean estaVacia() {
        return frente == null;
    }

    /**
     * Agrega un elemento al final de la cola.
     * @param dato El dato a agregar.
     */
    public void enqueue(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato); // El constructor de Nodo ya valida si el dato es nulo.
        if (estaVacia()) {
            frente = nuevoNodo;
        } else {
            finalCola.setSiguiente(nuevoNodo);
        }
        finalCola = nuevoNodo;
        System.out.println("Programa '" + dato + "' agregado a la cola.");
    }

    /**
     * Remueve y retorna el elemento al frente de la cola.
     * @return El dato al frente, o null si la cola está vacía.
     */
    public T dequeue() {
        if (estaVacia()) {
            return null;
        }
        T dato = frente.getDato();
        frente = frente.getSiguiente();
        if (frente == null) {
            finalCola = null;
        }
        System.out.println("Programa '" + dato + "' procesado.");
        return dato;
    }

    /**
     * Retorna el elemento al frente sin removerlo.
     * @return El dato al frente, o null si la cola está vacía.
     */
    public T peek() {
        return estaVacia() ? null : frente.getDato();
    }

    /**
     * Muestra todos los elementos de la cola desde el frente hasta el final.
     */
    public void mostrar() {
        if (estaVacia()) {
            System.out.println("La cola de programas está vacía.");
            return;
        }
        Nodo<T> actual = frente;
        System.out.println("--- Cola de Programas en Espera ---");
        while (actual != null) {
            System.out.println("-> " + actual.getDato());
            actual = actual.getSiguiente();
        }
    }
}