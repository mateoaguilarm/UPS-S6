import java.util.Scanner;

public class CalculadoraDos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el numero de su tabla de multiplicar: ");
        double num = scanner.nextDouble();

        System.out.println("Tabla de multiplicar del " + num + ":");
        for (int i = 1; i <= 10; i ++) { 
            double resultado = num * i;
            System.out.println(num + " x " + i + " = " + resultado);
        }

        scanner.close(); 
    }
}