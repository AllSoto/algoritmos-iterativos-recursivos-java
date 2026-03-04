public class BusquedaBinariaIterativa {
    public static int busquedaBinaria(int[] arreglo, int objetivo) {
        int bajo = 0;
        int alto = arreglo.length - 1;
        while (bajo <= alto) {
            int medio = bajo + (alto - bajo) / 2;
            if (arreglo[medio] == objetivo) {
                return medio;
            } else if (arreglo[medio] < objetivo) {
                bajo = medio + 1;
            } else {
                alto = medio - 1;
            }
        }
        return -1; // No encontrado
    }

    public static void main(String[] args) {
        int[] arreglo = {1, 3, 5, 7, 9};
        System.out.println("Índice de 5 (iterativo): " + busquedaBinaria(arreglo, 5)); // Salida: 2
    }
}