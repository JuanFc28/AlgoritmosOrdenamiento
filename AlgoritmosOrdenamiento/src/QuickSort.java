public class QuickSort {
    public static void main(String[] args) throws Exception {
        long tiempoInicio = System.currentTimeMillis(); //Inicia a contar el tiempo de ejecucion
        // Aquí colocamos los 100 números aleatorios dentro de un array.
        int[] numerosAleatorios = {
            587, 254, 503, 818, 237, 215, 122, 653, 774, 202, 890, 657, 109, 859, 305, 789, 141, 788, 147, 598, 
            227, 133, 423, 947, 969, 27, 792, 572, 908, 339, 746, 243, 181, 279, 428, 96, 647, 545, 872, 174, 
            479, 934, 25, 931, 922, 678, 110, 292, 617, 104, 741, 726, 823, 503, 736, 581, 63, 852, 470, 121, 
            419, 866, 283, 328, 336, 454, 196, 461, 473, 77, 764, 612, 468, 855, 962, 798, 287, 25, 394, 204, 
            989, 293, 305, 361, 307, 154, 319, 803, 108, 538, 396, 227, 262, 949, 69, 123, 18, 255, 979, 493, 
            657, 581, 71
        };
 
 
        // Imprimir los números aleatorios para verificar
        System.out.println("Números aleatorios:");
        for (int i = 0; i < numerosAleatorios.length; i++) {
            System.out.print(numerosAleatorios[i] + ", ");
        }
        quickSort(numerosAleatorios, 0, numerosAleatorios.length -1);
        System.out.println("\nLista ordenada por quick sort:");
        for (int num : numerosAleatorios) {
            System.out.print(num + " ");
        }
        //Contador de tiempo
        long tiempoFinal = System.currentTimeMillis();
        long tiempoEjecucion = tiempoFinal - tiempoInicio;
        double segundos = tiempoEjecucion / 1000.0;
        System.out.println("\nTiempo de ejecución: " + segundos +" segundos");
    }

    public static void quickSort(int[] array, int izquierda, int derecha) {
        if (izquierda < derecha) {
            int indicePivote = particion(array, izquierda, derecha);
            quickSort(array, izquierda, indicePivote - 1);
            quickSort(array, indicePivote + 1, derecha);
        }
    }

    public static int particion(int[] array, int izquierda, int derecha) {
        int pivote = array[derecha];
        int i = izquierda - 1;
        for (int j = izquierda; j < derecha; j++) {
            if (array[j] <= pivote) {
                i++;
                // Intercambiar array[i] y array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        // Intercambiar array[i+1] y el pivote (array[derecha])
        int temp = array[i + 1];
        array[i + 1] = array[derecha];
        array[derecha] = temp;
        return i + 1;
    }
}
