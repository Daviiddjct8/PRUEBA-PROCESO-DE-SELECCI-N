class Ordenamiento:
    @staticmethod
    def selection_sort(arr):
        n = len(arr)
        for i in range(n):
            min_index = i
            for j in range(i+1, n):
                if arr[j] < arr[min_index]:
                    min_index = j
            arr[i], arr[min_index] = arr[min_index], arr[i]


class BusquedaBinaria:
    @staticmethod
    def busqueda_binaria(arr, elemento):
        inicio = 0
        fin = len(arr) - 1
        while inicio <= fin:
            medio = inicio + (fin - inicio) // 2
            if arr[medio] == elemento:
                return medio
            elif arr[medio] < elemento:
                inicio = medio + 1
            else:
                fin = medio - 1
        return -1


class Vista:
    @staticmethod
    def mostrar_arreglo(arr):
        print("[", end="")
        for i in range(len(arr)):
            print(arr[i], end="")
            if i < len(arr) - 1:
                print(", ", end="")
        print("]")

    @staticmethod
    def mostrar_resultado_busqueda(indice, valor_buscado):
        if indice != -1:
            print(f"El valor {valor_buscado} está presente en el índice: {indice}")
        else:
            print(f"El valor {valor_buscado} no está presente en el arreglo.")


class Prueba:
    @staticmethod
    def ordenar_y_buscar(lista, valor_buscado):
        arr = sorted(lista)
        Ordenamiento.selection_sort(arr)
        indice = BusquedaBinaria.busqueda_binaria(arr, valor_buscado)
        Vista.mostrar_arreglo(arr)
        Vista.mostrar_resultado_busqueda(indice, valor_buscado)

    @staticmethod
    def main():
        lista = [64, 34, 25, 12, 22, 11, 90]
        valor_buscado = 25
        Prueba.ordenar_y_buscar(lista, valor_buscado)

        lista2 = [5, 10, 15, 20, 25, 30]
        valor_buscado2 = 20
        Prueba.ordenar_y_buscar(lista2, valor_buscado2)

        lista3 = [100, 90, 80, 70, 60, 50]
        valor_buscado3 = 95
        Prueba.ordenar_y_buscar(lista3, valor_buscado3)


if __name__ == "__main__":
    Prueba.main()
