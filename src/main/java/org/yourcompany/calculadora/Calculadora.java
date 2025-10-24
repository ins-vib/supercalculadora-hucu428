package org.yourcompany.calculadora;

/**
 *
 * @author Hugo Cuadrado
 */


public class Calculadora {

    public static void main(String[] args) {

        /**
        //Exemples de crida per al mètode nombreDigits
        System.out.println("Nombre de dígits de 1234: " + nombreDigits(1234));
        System.out.println("Nombre de dígits de 56789: " + nombreDigits(56789));
        System.out.println("Nombre de dígits de -101010: " + nombreDigits(-101010));
        System.out.println("Nombre de dígits de 0: " + nombreDigits(0));

        //Exemples de crida per al mètode sumaPrimersNumeros
        System.out.println("Suma dels primers 5 números: " + sumaPrimersNumeros(5));
        System.out.println("Suma dels primers 10 números: " + sumaPrimersNumeros(10));
        System.out.println("Suma dels primers 15 números: " + sumaPrimersNumeros(15));

        //Exemples de crida per al mètode calcularFactorial
        System.out.println("Factorial de 5: " + calcularFactorial(5));
        System.out.println("Factorial de 7: " + calcularFactorial(7));
        System.out.println("Factorial de 10: " + calcularFactorial(10));
        */
        /**
        System.out.println("Número de cares en 100 llançaments: " + numeroCares(100));
        System.out.println("Número de creus en 100 llançaments: " + numeroCreus(100));
        System.out.println("Número de cares en 100 llançaments: " + numeroCares(170));
        System.out.println("Número de creus en 100 llançaments: " + numeroCreus(170));
        System.out.println("Número de cares en 100 llançaments: " + numeroCares(200));
        System.out.println("Número de creus en 100 llançaments: " + numeroCreus(200));
        System.out.println("Número de cares en 100 llançaments: " + numeroCares(270));
        System.out.println("Número de creus en 100 llançaments: " + numeroCreus(270));
        System.out.println("Número de cares en 100 llançaments: " + numeroCares(30000000));
        System.out.println("Número de creus en 100 llançaments: " + numeroCreus(30000000));
        */
        preucinema(8.0, true, false);
        preucinema(15, false, true);
        preucinema(12.5, true, true);
        preucinema(10, false, false);


        /** 
        // Exemples de crida per al mètode sumaQuadrats
        System.out.println("Suma dels quadrats dels primers 3 números: " + sumaQuadrats(3));
        System.out.println("Suma dels quadrats dels primers 5 números: " + sumaQuadrats(5));
        System.out.println("Suma dels quadrats dels primers 7 números: " + sumaQuadrats(7));

        // Exemples de crida per al mètode calcularPotencia
        System.out.println("2 elevat a la potència 3: " + calcularPotencia(2, 3));
        System.out.println("5 elevat a la potència 4: " + calcularPotencia(5, 4));
        System.out.println("3 elevat a la potència 5: " + calcularPotencia(3, 5));
        */

       
        
    }

    /**
     * Calcula el nombre de dígits d’un número enter.
     * Funciona tant per a nombres positius com negatius.
     * Si el nombre és 0, retorna 1.
     *
     * @param nombre Número del qual es vol saber el nombre de dígits
     * @return Quantitat de dígits que té {@code nombre}
     */
   /**  public static int nombreDigits(int nombre) {
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

    public static int calcularFactorial(int n) {
        // Implementa aquest mètode
        if (n < 0) {
            throw new IllegalArgumentException("El nombre ha de ser no negatiu");
        }
        int factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
    
    public static int numeroCares(int repeticions) {
        Random rand = new Random();

        int cares = 0;  // Comptador per cares
         

        
        for (int i = 0; i < repeticions; i++) {
            int resultat = rand.nextInt(2);  // 0 o 1

            if (resultat == 0) {
                cares++;   // Incrementa cares
            } 
            
        }
        return cares;
    }
    public static int numeroCreus(int repeticions) {
        Random rand = new Random();

        int creus = 0;  

        
        for (int i = 0; i < repeticions; i++) {
            int resultat = rand.nextInt(2);  // 0 o 1

            if (resultat != 0) {
                creus++;   
            } 
            
        }
        return creus;
    }
    */
    public static double preucinema(double preuL, boolean cap_de_setmana, boolean jove) {
  
       double descompteC = 0.1;
       double descompteJ = 0.15;
       double preuT;

       if (cap_de_setmana) {
           if (jove) {
               preuT = preuL - (preuL * (descompteJ + descompteC));
           } else {
               preuT = preuL - (preuL * descompteC);
           }
       } else {
           if (jove) {
               preuT = preuL - (preuL * descompteJ);
           } else {
               preuT = preuL;
           }
       }

       System.out.println("L'entrada val " + preuT + "!!!");
       return preuT;
    }
}








