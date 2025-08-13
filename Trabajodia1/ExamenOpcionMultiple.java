import java.util.Scanner;

public class ExamenOpcionMultiple {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int respuestasCorrectas = 0; // Contador para las respuestas correctas

        // --- Pregunta 1 ---
        System.out.println("Pregunta 1: ¿Cuál de los siguientes es un tipo de dato primitivo en Java?");
        System.out.println("a) String");
        System.out.println("b) int");
        System.out.println("c) ArrayList");
        System.out.println("d) Object");
        System.out.print("Tu respuesta (a, b, c o d): ");
        String respuesta1 = scanner.nextLine();
        if (respuesta1.equalsIgnoreCase("b")) {
            System.out.println("¡Correcto!");
            respuestasCorrectas++; // Incrementa el contador si la respuesta es correcta
        } else {
            System.out.println("Incorrecto. La respuesta correcta es la b) int.");
        }

        // --- Pregunta 2 ---
        System.out.println("\nPregunta 2: ¿Qué palabra clave se usa para declarar una constante en Java?");
        System.out.println("a) static");
        System.out.println("b) final");
        System.out.println("c) const");
        System.out.println("d) var");
        System.out.print("Tu respuesta (a, b, c o d): ");
        String respuesta2 = scanner.nextLine();
        if (respuesta2.equalsIgnoreCase("b")) {
            System.out.println("¡Correcto!");
            respuestasCorrectas++;
        } else {
            System.out.println("Incorrecto. La respuesta correcta es la b) final.");
        }

        // --- Pregunta 3 ---
        System.out.println("\nPregunta 3: ¿Cuál es el operador lógico 'Y' en Java?");
        System.out.println("a) ||");
        System.out.println("b) !");
        System.out.println("c) &&");
        System.out.println("d) ===");
        System.out.print("Tu respuesta (a, b, c o d): ");
        String respuesta3 = scanner.nextLine();
        if (respuesta3.equalsIgnoreCase("c")) {
            System.out.println("¡Correcto!");
            respuestasCorrectas++;
        } else {
            System.out.println("Incorrecto. La respuesta correcta es la c) &&.");
        }

        scanner.close(); // Cierra el objeto Scanner
        System.out.println("\n--------------------");
        System.out.println("Puntaje final: " + respuestasCorrectas + " de 3 respuestas correctas.");
        System.out.println("¡Gracias por completar el examen!");
    }
}