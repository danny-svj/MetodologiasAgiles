// Contacto.java
import java.util.Objects;

public class Contacto {
    private String nombre;
    private String direccion;
    private String telefono;

    public Contacto(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s, Teléfono: %s, Dirección: %s", nombre, telefono, direccion);
    }
    
    // Este método es crucial para que la búsqueda y eliminación funcionen
    @Override
    public boolean equals(Object o) {
        // Si es el mismo objeto en memoria, son iguales
        if (this == o) return true;
        // Si el objeto es nulo o de una clase diferente, no son iguales
        if (o == null || getClass() != o.getClass()) return false;
        // Convierte el objeto a Contacto
        Contacto contacto = (Contacto) o;
        // Compara solo el nombre para determinar si los contactos son "iguales"
        return Objects.equals(nombre, contacto.nombre);
    }

    @Override
    public int hashCode() {
        // Genera un hash basado solo en el nombre
        return Objects.hash(nombre);
    }
}