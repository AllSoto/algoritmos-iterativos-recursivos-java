public class MCDIterativo {
    public static long mcd(long a, long b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println("MCD de 48 y 18 (iterativo): " + mcd(48, 18)); // Salida: 6
    }
}