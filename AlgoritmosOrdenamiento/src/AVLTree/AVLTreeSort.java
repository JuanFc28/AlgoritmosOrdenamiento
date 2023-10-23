package AVLTree;
public class AVLTreeSort {
    public static void main(String[] args) {
        long tiempoInicio = System.currentTimeMillis(); //Inicia a contar el tiempo de ejecucion
        AVLTree avlTree = new AVLTree();

        int[] numerosAleatorios = {
            587, 254, 503, 818, 237, 215, 122, 653, 774, 202, 890, 657, 109, 859, 305, 789, 141, 788, 147, 598, 
            227, 133, 423, 947, 969, 27, 792, 572, 908, 339, 746, 243, 181, 279, 428, 96, 647, 545, 872, 174, 
            479, 934, 25, 931, 922, 678, 110, 292, 617, 104, 741, 726, 823, 503, 736, 581, 63, 852, 470, 121, 
            419, 866, 283, 328, 336, 454, 196, 461, 473, 77, 764, 612, 468, 855, 962, 798, 287, 25, 394, 204, 
            989, 293, 305, 361, 307, 154, 319, 803, 108, 538, 396, 227, 262, 949, 69, 123, 18, 255, 979, 493, 
            657, 581, 71};

        // Imprimir los números aleatorios para verificar
        System.out.println("Números aleatorios:");
        for (int i = 0; i < numerosAleatorios.length; i++) {
            System.out.print(numerosAleatorios[i] + ", ");
        }

        for (int value : numerosAleatorios) {
            avlTree.root = avlTree.insert(avlTree.root, value);
        }

        System.out.println("\nLista ordenada por AVLTree Sort:");
        avlTree.inOrderTraversal(avlTree.root);
        //Contador de tiempo
        long tiempoFinal = System.currentTimeMillis();
        long tiempoEjecucion = tiempoFinal - tiempoInicio;
        double segundos = tiempoEjecucion / 1000.0;
        System.out.println("\nTiempo de ejecución: " + segundos +" segundos");
    }
}
