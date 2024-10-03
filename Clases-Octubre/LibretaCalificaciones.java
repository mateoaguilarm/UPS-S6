import java.util.Scanner;

public class LibretaCalificaciones {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre, asignatura;
        double suma = 0, promedio;
        int contadorNotas = 0;
        
        System.out.print("Ingresa tu nombre: ");
        nombre = scanner.nextLine();
        
        System.out.print("Ingresa la asignatura: ");
        asignatura = scanner.nextLine();
        
        while (contadorNotas < 10) {
            System.out.print("Ingresa la nota " + (contadorNotas + 1) + " (entre 0 y 10): ");
            double nota = scanner.nextDouble();
            
            if (nota >= 0 && nota <= 10) { // Para que la nota esté entre 0 y 10
                suma += nota; // Suma la nota al total
                contadorNotas++; // Incrementa el contador solo si la nota es válida
            } else {
                System.out.println("Error: La nota debe estar entre 0 y 10.");
            }
        }
        
        promedio = suma / 10;
        
        String resultado;
        if (promedio <= 4) {
            resultado = "Reprobaste";
        } else if (promedio >= 7) {
            resultado = "Aprobaste";
        } else {
            resultado = "Suspendiste";
        }
        
        System.out.println(nombre + "tu" + resultado + asignatura);

        scanner.close();
    }
}