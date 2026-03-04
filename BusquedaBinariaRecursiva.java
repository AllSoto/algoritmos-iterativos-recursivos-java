import java.util.Arrays;

public class BusquedaBinariaRecursiva {
    public static int busquedaBinaria(int[] arreglo, int objetivo, int bajo, int alto) {
        if (bajo > alto) {
            return -1; // No encontrado
        }
        int medio = bajo + (alto - bajo) / 2;
        if (arreglo[medio] == objetivo) {
            return medio;
        } else if (arreglo[medio] < objetivo) {
            return busquedaBinaria(arreglo, objetivo, medio + 1, alto);
        } else {
            return busquedaBinaria(arreglo, objetivo, bajo, medio - 1);
        }
    }

    public static void main(String[] args) {
        int[] arreglo = {1, 3, 5, 7, 9};
        System.out.println("Índice de 5 (recursivo): " + busquedaBinaria(arreglo, 5, 0, arreglo.length - 1)); // Salida: 2
    }
}