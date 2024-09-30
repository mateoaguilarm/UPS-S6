import java.util.Scanner;

public class CalculadoraDos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el numero de su tabla de multiplicar: ");
        double num1 = scanner.nextDouble();

        System.out.println("Tabla de multiplicar del " + num1 + ":");
        for (int i = 1; i <= 10; i ++) { // Manteniendo la secuencia de pares
            double resultado = num1 * i;
            System.out.println(num1 + " x " + i + " = " + resultado);
        }

        scanner.close(); // Cerramos el scanner al final
    }
}