import java.util.Scanner;

public class trabajo {

    // Variable estática para llevar el conteo de movimientos.
    private static int contadorDeMovimientos = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el número de aros que quieres usar: ");
        int aros = scanner.nextInt();
        scanner.close();

        // Reinicia el contador para cada ejecución
        contadorDeMovimientos = 0;

        System.out.println("\nPasos para resolver las Torres de Hanói con " + aros + " aros:");
        resolverHanoi(aros, 'A', 'C', 'B');

        System.out.println("\n¡El rompecabezas fue resuelto!");
        System.out.println("Número total de movimientos: " + contadorDeMovimientos);
    }

    /**
     * Método recursivo para resolver las Torres de Hanói y contar los movimientos.
     *
     * @param n         Número de aros a mover.
     * @param origen    Torre de origen.
     * @param destino   Torre de destino.
     * @param auxiliar  Torre auxiliar.
     */
    public static void resolverHanoi(int n, char origen, char destino, char auxiliar) {
        if (n == 1) {
            System.out.println("Mover el aro 1 de la torre " + origen + " a la torre " + destino);
            contadorDeMovimientos++; // Incrementa el contador por cada movimiento
            return;
        }
        
        // Mover n-1 aros del origen al auxiliar
        resolverHanoi(n - 1, origen, auxiliar, destino);
        
        // Mover el aro más grande (n) del origen al destino
        System.out.println("Mover el aro " + n + " de la torre " + origen + " a la torre " + destino);
        contadorDeMovimientos++; // Incrementa el contador
        
        // Mover los n-1 aros restantes del auxiliar al destino
        resolverHanoi(n - 1, auxiliar, destino, origen);
    }
}