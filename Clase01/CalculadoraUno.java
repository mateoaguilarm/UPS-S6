import java.util.Scanner;

public class CalculadoraUno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar;

        do {
            System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        double suma = numero1 + numero2;
        double resta = numero1 - numero2;
        double multiplicacion = numero1 * numero2;
        double division = numero1 / numero2;

        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicación es: " + multiplicacion);
        System.out.println("La división es: " + division);

        if (numero1 > numero2) {
            System.out.println("El número mayor es: " + numero1);
        } else if (numero1 < numero2) {
            System.out.println("El número mayor es: " + numero2);
        } else {
            System.out.println("Los números son iguales.");
        }

        System.out.println("¿Desea realizar otro cálculo? (s/n): ");
        continuar = scanner.next();

        } while (continuar.equalsIgnoreCase("s"));
        
        scanner.close();
        System.out.println("Programa finalizado.");
    }
}