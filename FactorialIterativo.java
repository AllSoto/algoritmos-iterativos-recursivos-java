/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
public class FactorialIterativo {
    public static long factorial(long n) {
        if (n < 0) {
            throw new IllegalArgumentException("El número no puede ser negativo");
        }
        long resultado = 1;
        for (long i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static void main(String[] args) {
        System.out.println("Factorial de 5 (iterativo): " + factorial(5)); // Salida: 120
    }
}