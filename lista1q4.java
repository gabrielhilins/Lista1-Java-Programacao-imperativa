public class lista1q4 {
    public static void main(String[] args) {
        int[] vetorA = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int[] vetorB = new int[vetorA.length];

        calcularQuadrados(vetorA, vetorB);

        mostrarVetores(vetorA, vetorB);
    }

    public static void calcularQuadrados(int[] vetorA, int[] vetorB) {
        for (int i = 0; i < vetorA.length; i++) {
            vetorB[i] = vetorA[i] * vetorA[i];
        }
    }

    public static void mostrarVetores(int[] vetorA, int[] vetorB) {
        System.out.println("Elementos dos vetores A e B lado a lado:");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("A[" + i + "]: " + vetorA[i] + "   B[" + i + "]: " + vetorB[i]);
        }
    }
}
