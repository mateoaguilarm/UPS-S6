package ClaseSwitch;

import java.util.Scanner;

public class EjercicioUno {
    public static void main(String[] args) {
        System.out.println("Hola, bienvenido a tus tablas de multiplicar");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el numero de su tabla de multiplicar: ");
        int num = scanner.nextInt();

        switch (num) {
            case 1:
                System.out.println("Elejiste la tabla de multiplicar del 1");
                System.out.println("Tabla de multiplicar del " + num + ":");
                for (int i = 1; i <= 10; i++) {
                    double resultado = num * i;
                    System.out.println(num + " x " + i + " = " + resultado);
                }
                break;

            case 2:
                System.out.println("Elejiste la tabla de multiplicar del 2");
                break;

            case 3:
                System.out.println("Elejiste la tabla de multiplicar del 3");
                break;

            case 4:
                System.out.println("Elejiste la tabla de multiplicar del 4");
                break;

            case 5:
                System.out.println("Elejiste la tabla de multiplicar del 5");
                break;

            case 6:
                System.out.println("Elejiste la tabla de multiplicar del 6");
                break;

            case 7:
                System.out.println("Elejiste la tabla de multiplicar del 7");
                break;

            case 8:
                System.out.println("Elejiste la tabla de multiplicar del 8");
                break;

            case 9:
                System.out.println("Elejiste la tabla de multiplicar del 9");
                break;

            case 10:
                System.out.println("Elejiste la tabla de multiplicar del 10");
                break;

            default:
                System.out.println("El numero ingresado no es válido (debe ser del 1 al 10)");
                break;
        }
    }
}