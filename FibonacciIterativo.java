public class FibonacciIterativo {
    public static long fibonacci(long n) {
        if (n < 0) {
            throw new IllegalArgumentException("El número no puede ser negativo");
        }
        if (n == 0) return 0;
        if (n == 1) return 1;
        long a = 0, b = 1;
        for (long i = 2; i <= n; i++) {
            long temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println("Fibonacci de 10 (iterativo): " + fibonacci(10)); // Salida: 55
    }
}