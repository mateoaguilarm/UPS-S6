public class TablaMultiplicarParesUno {
    public static void main(String[] args) {
        // Iterar a traves de los multiplicadores pares del 2 al 10
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("Tabla del " + i + ":");
            // Generar la tabla de multiplicar para el multiplicador actual
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "x" + j + "=" + (i * j));
            }
            System.out.println(); // Espacio entre tablas
        }
    }
}
