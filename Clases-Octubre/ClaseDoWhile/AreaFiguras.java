package ClaseDoWhile;
import java.util.Scanner;

public class AreaFiguras {
    public static void main(String[] args) {
        System.out.println("Bienvenido al caluclador de area para figuras");
        Scanner scanner = new Scanner(System.in);
        boolean continuar;

        do {
            System.out.println("Elige una Figura: (1: cuadrado; 2: rectangulo; 3: triangulo)");
            int fig = scanner.nextInt();

            switch (fig) {
                case 1:
                    System.out.println("Elegiste el Cuadrado");
                    System.out.println("Ingresa la medida de un lado: ");
                    double lado = scanner.nextDouble();
                    double areaCuadrado = lado * lado;
                    System.out.println("El área del cuadrado es: " + areaCuadrado);
                    break;
                
                case 2:
                    System.out.println("Elegiste el Rectángulo");
                    System.out.println("Ingresa la medida del largo: ");
                    double largo = scanner.nextDouble();
                    System.out.println("Ingresa la medida del ancho: ");
                    double ancho = scanner.nextDouble();
                    double areaRectangulo = largo * ancho;
                    System.out.println("El área del rectángulo es: " + areaRectangulo);
                    break;

                case 3:
                    System.out.println("Elegiste el Triángulo");
                    System.out.println("Ingresa la medida de la base: ");
                    double base = scanner.nextDouble();
                    System.out.println("Ingresa la medida de la altura: ");
                    double altura = scanner.nextDouble();
                    double areaTriangulo = (base * altura) / 2;
                    System.out.println("El área del triángulo es: " + areaTriangulo);
                    break;

                default:
                    System.out.println("Opción inválida. Por favor elige una figura válida.");
                    break;
            }

            System.out.println("¿Deseas calcular el área de otra figura? Escribe (true/false): ");
            continuar = scanner.nextBoolean();

        } while (continuar); 

        System.out.println("Calculadora de figuras terminado");
        scanner.close();
    }
}
