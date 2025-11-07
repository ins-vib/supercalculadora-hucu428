package org.yourcompany.calculadora;

/**
 *
 * @author Hugo Cuadrado
 */
import java.util.Scanner;

public class Calculadora {
    private static final Scanner scanner = new Scanner(System.in);

 public static void mostrarMenuConsola() {
        System.out.println("Menú de la Calculadora:");
        System.out.println("0. Sortir");
        System.out.println("1. Nombre de dígits d'un nombre");
        System.out.println("2. Suma dels primers N números");
        System.out.println("3. Calcular factorial d'un nombre");
        System.out.println("4. Suma dels quadrats dels primers N números");
        System.out.println("5. Calcular potència");
        System.out.println("Seleccioneu una opció (0-5):");
     
 }
    public static void main(String[] args) {
        int opcio;
        do {
            mostrarMenuConsola();
            // llegir opció i validar entrada bàsica
            if (!scanner.hasNextInt()) {
                System.out.println("Entrada no vàlida. Introdueix un nombre.");
                scanner.next(); // descartar entrada no vàlida
                opcio = -1; // assignar valor per continuar el bucle
                continue;
            }
            opcio = scanner.nextInt();

            switch (opcio) {
                case 1 -> {
                    System.out.println("Has seleccionat l'opció 1: Nombre de dígits");
                    System.out.println("Introdueix un nombre enter:");
                    if (scanner.hasNextInt()) {
                        int numero = scanner.nextInt();
                        System.out.println("Nombre de dígits: " + Calculadora.nombreDigits(numero));
                    } else {
                        System.out.println("Entrada no vàlida per a un nombre enter.");
                        scanner.next();
                    }
                }
                case 2 -> {
                    System.out.println("Introdueix un nombre enter N:");
                    int n = scanner.nextInt();
                    System.out.println("Suma dels primers " + n + " números: " + Calculadora.sumaPrimersNumeros(n));
                }
                case 3 -> {
                    System.out.println("Introdueix un nombre enter:");
                    int num = scanner.nextInt();
                    System.out.println("Factorial de " + num + ": " + Calculadora.calcularFactorial(num));
                }
                case 4 -> {
                    System.out.println("Introdueix un nombre enter N:");
                    int m = scanner.nextInt();
                    System.out.println("Suma dels quadrats dels primers " + m + " números: " + Calculadora.sumaQuadrats(m));
                }
                case 5 -> {
                    System.out.println("Introdueix la base:");
                    int base = scanner.nextInt();
                    System.out.println("Introdueix l'exponent:");
                    int exponent = scanner.nextInt();
                    System.out.println(base + " elevat a la potència " + exponent + ": " + Calculadora.calcularPotencia(base, exponent));
                }
                case 0 -> System.out.println("Sortint...");
                default -> System.out.println("Opció no vàlida. Seleccioneu 0-5.");
            }
        } while (opcio != 0);
    }

    /**
     * Calcula el nombre de dígits d’un número enter.
     * Funciona tant per a nombres positius com negatius.
     * Si el nombre és 0, retorna 1.
     *
     * @param nombre Número del qual es vol saber el nombre de dígits
     * @return Quantitat de dígits que té {@code nombre}
     */
    public static int nombreDigits(int nombre) {
        if (nombre == 0) {
            return 1; // el 0 té un dígit
        }        
        int comptador = 0;
        while (nombre != 0) {
            nombre /= 10;
            comptador++;
        }
        return comptador;
    }

    public static int sumaPrimersNumeros(int n) {
        // Implementa aquest mètode
        if (n < 0) {
            throw new IllegalArgumentException("El nombre ha de ser no negatiu");
        }
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        return suma;
    }

    public static int calcularFactorial(int num) {
        // Implementa aquest mètode
        if (num < 0) {
            throw new IllegalArgumentException("El nombre ha de ser no negatiu");
        }
        int factorial = 1;
        for (int i = 2; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static int sumaQuadrats(int m) {
        // Implementa aquest mètode
        if (m < 0) {
            throw new IllegalArgumentException("El nombre ha de ser no negatiu");
        }
        int suma = 0;
        for (int i = 1; i <= m; i++) {
            suma += i * i;
        }
        return suma;
    }
    
   public static int calcularPotencia(int base, int exponent) {
        // Implementa aquest mètode
        if (exponent < 0) {
            throw new IllegalArgumentException("L'exponent ha de ser no negatiu");
        }
        int resultat = 1;
        for (int i = 0; i < exponent; i++) {
            resultat *= base;
        }
        return resultat;
    }



    
}








