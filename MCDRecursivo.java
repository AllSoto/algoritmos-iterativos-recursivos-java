public class MCDRecursivo {
    public static long mcd(long a, long b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (b == 0) {
            return a;
        }
        return mcd(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println("MCD de 48 y 18 (recursivo): " + mcd(48, 18)); // Salida: 6
    }
}