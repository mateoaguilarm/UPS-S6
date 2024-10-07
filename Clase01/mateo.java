import java.util.Scanner;

public class Mateo {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número para mostrar su tabla de multiplicar: ");
        int numero = scanner.nextInt();

        System.out.println("Tabla de multiplicar del " + numero + ":");
        for (int i = 1; i <= 100; i++) {
            int resultado = numero * i;
            System.out.println(numero + " * " + i + " = " + resultado);
        }
        
        scanner.close();
    }
}