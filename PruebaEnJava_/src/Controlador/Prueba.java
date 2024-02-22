package Controlador;

import java.util.List;

import Vista.Vista;

public class Prueba {
    
    public static void ordenarYBuscar(List<Integer> lista, int valorBuscado) {
    	
        int[] arr = lista.stream().mapToInt(Integer::intValue).toArray();
        
        Ordenamiento.selectionSort(arr);
        
        int indice = BusquedaBinaria.busquedaBinaria(arr, valorBuscado);
        
        Vista.mostrarMensaje("Arreglo ordenado:");
        Vista.mostrarArreglo(arr);
        Vista.mostrarResultadoBusqueda(indice, valorBuscado);
    }

    public static void main(String[] args) {
        List<Integer> lista = List.of(64, 34, 25, 12, 22, 11, 90);
        int valorBuscado = 25;
        
        ordenarYBuscar(lista, valorBuscado);
        
        // Otros casos de prueba
        List<Integer> lista2 = List.of(5, 10, 15, 20, 25, 30);
        int valorBuscado2 = 20;
        ordenarYBuscar(lista2, valorBuscado2);
        
        List<Integer> lista3 = List.of(100, 90, 80, 70, 60, 50);
        int valorBuscado3 = 95;
        ordenarYBuscar(lista3, valorBuscado3);
    }
}