import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar;
        
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.next();

        char genero;
        while (true) {
            System.out.print("Ingrese su género (M/F): ");
            genero = scanner.next().toUpperCase().charAt(0);
            
            if (genero == 'M' || genero == 'F') {
                break;  // Salir del bucle si la entrada es válida
            } else {
                System.out.println("Género no válido. Por favor, ingrese 'M' o 'F'.");
            }
        }
        
        if (genero == 'M') {
            System.out.println("Género: Masculino");
        } else {
            System.out.println("Género: Femenino");
        }
        
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        
         if (edad >= 18 && edad <= 20) {
            System.out.println("Apto para reclutamiento militar.");
        } else if (edad >= 20 ) {
            System.out.println("No apto para reclutamiento militar.");
        } 
        System.out.print("Ingrese su cédula: ");
        String cedula = scanner.next();

        String provincia = "";
        if (cedula.length() >= 2) {
            String codigoProvincia = cedula.substring(0, 2);
            switch (codigoProvincia) {
                case "01":
                    provincia = "Azual";
                    break;
                case "02":
                    provincia = "Bolivar";
                    break;
                case "03":
                    provincia = "Cañar";
                    break;
                case "04":
                    provincia = "Carchi";
                    break;
                case "05":
                    provincia = "Cotopaxi";
                    break;
                default:
                    provincia = "Código de provincia no válido";
            }
        } 
            provincia = "Cédula no válida. Ingrese nuevamente";
            
        System.out.println("Provincia: " + provincia);

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
        
        scanner.close();
        System.out.println("Programa finalizado.");
    }
}