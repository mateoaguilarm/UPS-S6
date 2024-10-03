import java.util.Scanner;

public class LibretaCalificaciones {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre, asignatura;
        double[] notas = new double[10];
        double suma = 0, promedio;
        
        // Solicitar el nombre del estudiante
        System.out.print("Ingresa tu nombre: ");
        nombre = scanner.nextLine();
        
        // Solicitar el nombre de la asignatura
        System.out.print("Ingresa la asignatura: ");
        asignatura = scanner.nextLine();
        
        // Solicitar las 10 notas
        for (int i = 0; i < 10; i++) {
            double nota;
            do {
                System.out.print("Ingresa la nota " + (i + 1) + " (entre 0 y 10): ");
                nota = scanner.nextDouble();
                
                if (nota < 0 || nota > 10) {
                    System.out.println("Error: La nota debe estar entre 0 y 10.");
                }
            } while (nota < 0 || nota > 10); // Verifica que la nota esté entre 0 y 10
            
            notas[i] = nota;
            suma += nota; // Acumula las notas para calcular el promedio
        }
        
        // Calcular el promedio
        promedio = suma / 10;
        
        // Determinar el resultado
        String resultado;
        if (promedio <= 4) {
            resultado = "Reprobaste";
        } else if (promedio >= 7) {
            resultado = "Aprobaste";
        } else {
            resultado = "Suspendiste";
        }
        
        // Mostrar el mensaje final
        System.out.println(nombre + ", tú " + resultado + " la asignatura " + asignatura + ".");
    }
}