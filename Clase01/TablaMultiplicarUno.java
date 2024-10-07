import java.util.Scanner;

public class TablaMultiplicarUno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número para mostrar su tabla de multiplicar: ");
        int numero = scanner.nextInt();

        System.out.println("Tabla de multiplicar del " + numero + ":");
        for (int i = 2; i <= 10; i+=2) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
for (int i = 2; i <= 10; i+=2) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        scanner.close();
    }
}