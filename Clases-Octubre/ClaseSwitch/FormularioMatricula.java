package ClaseSwitch;
import java.util.Scanner;

public class FormularioMatricula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre;

        System.out.print("Ingrese su nombre: ");
        nombre = scanner.nextLine();

        System.out.println("Elige el grado en el que te matricularás: ");
        int grado = scanner.nextInt();

        switch (grado) {
            case 1:
                System.out.println("Te has matriculado en el primer grado.");
                break;
        
            case 2:
                System.out.println("Te has matriculado en el segundo grado.");
                break;

            case 3:
                System.out.println("Te has matriculado en el tercer grado.");
                break;

            case 4:
                System.out.println("Te has matriculado en el cuarto grado.");
                break;

            case 5:
                System.out.println("Te has matriculado en el quinto grado.");
                break;

            case 6:
                System.out.println("Te has matriculado en el sexto grado.");
                break;

            case 7:
                System.out.println("Te has matriculado en el septimo grado.");
                break;

            case 8:
                System.out.println("Te has matriculado en el octavo grado.");
                break;

            case 9:
                System.out.println("Te has matriculado en el noveno grado.");
                break;

            case 10:
                System.out.println("Te has matriculado en el decimo grado.");
                break;
            
            default:
                System.out.println("El grado ingresado no es válido.");
                break;
        }

        System.out.println("Elige el paralelo: ");
        String paralelo = scanner.next().toUpperCase();

        switch (paralelo) {
            case "A":
                System.out.println("Has elegido el paralelo A.");
                break;
        
            case "B":
                System.out.println("Has elegido el paralelo B.");
                break;

            case "C":
                System.out.println("Has elegido el paralelo C.");
                break;

            case "D":
                System.out.println("Has elegido el paralelo D.");
                break;
            
            default:
                System.out.println("El paralelo ingresado no es válido.");
                break;
        }

        scanner.close();
    }
}