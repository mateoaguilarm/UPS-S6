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
        
        while (contadorNotas < 3) {
            System.out.print("Ingresa la nota " + (contadorNotas + 1) + " (entre 0 y 10): ");
            double nota = scanner.nextDouble();
            
            if (nota >= 0 && nota <= 10) {
                suma += nota;
                contadorNotas++;
            } else {
                System.out.println("Error, la nota debe estar entre 0 y 10");
            }
        }
        
        promedio = suma / 3;
        
        String resultado;
        if (promedio <= 4) {
            resultado = "reprobaste";
        } else if (promedio >= 7) {
            resultado = "aprobaste";
        } else {
            resultado = "suspendiste";
        }
        
        System.out.println(nombre + " tu " + resultado + asignatura);

        scanner.close();
    }
}