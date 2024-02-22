package Controlador;

public class BusquedaBinaria {

    // Método de búsqueda binaria
    public static int busquedaBinaria(int[] arr, int elemento) {
        int inicio = 0;
        int fin = arr.length - 1;

        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;

            if (arr[medio] == elemento) {
                return medio;
            }
            if (arr[medio] < elemento) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }

        return -1;
    }
}