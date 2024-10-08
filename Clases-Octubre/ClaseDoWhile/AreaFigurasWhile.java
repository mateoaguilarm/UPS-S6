package ClaseDoWhile;
import java.util.Scanner;

public class AreaFigurasWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al Calculo de Aread de Figuras Geometricas");
        System.out.println("1. Area del Cuadrado");
        System.out.println("2. Area del Rectangulo");
        System.out.println("3. Area del Triangulo");
        System.out.print("Ingrese la opcion deseada: ");
        int seleccion = scanner.nextInt();

        switch (seleccion) { 
            case 1:
                System.out.println("Ingresa el valor del lado del cuadrado");
                double lado = scanner.nextDouble();
                while (lado != 0) {
                    double resultado = lado*lado;
                    System.out.println("El area del cuadrado es: " + resultado);
                    lado = 0;
                }
                break;

            case 2:
                System.out.println("Ingresa los valores de los lados del rectangulo");
                double largo = scanner.nextDouble();
                double ancho = scanner.nextDouble();
                while (largo!= 0 && ancho!= 0) {
                    double resultado = largo*ancho;
                    System.out.println("El area del rectangulo es: " + resultado);
                    largo = 0;
                    ancho = 0;
                }
                break;

            case 3:
                System.out.println("Ingresa los valores de la base y la altura del triangulo");
                double base = scanner.nextDouble();
                double altura = scanner.nextDouble();
                while (base!= 0 && altura!= 0) {
                    double resultado = (base*altura)/2;
                    System.out.println("El area del triangulo es: " + resultado);
                    base = 0;
                    altura = 0;
                }
                break;

            default:
                System.out.println("La opcion ingresada no es valida. Por favor ingrese una opcion del 1 al 3.");
                break;
        }
    }
}
