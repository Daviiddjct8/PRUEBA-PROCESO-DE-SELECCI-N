package Vista;

public class Vista {
    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public static void mostrarArreglo(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void mostrarResultadoBusqueda(int indice, int valorBuscado) {
        if (indice != -1) {
            System.out.println("El valor " + valorBuscado + " está presente en el índice: " + indice);
        } else {
            System.out.println("El valor " + valorBuscado + " no está presente en el arreglo.");
        }
    }
}