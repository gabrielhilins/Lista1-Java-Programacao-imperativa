public class lista1q2 {
    public static void main(String[] args) {
        int[] vetorA = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int[] vetorB = metodoRetornoVetorB(vetorA);
        int[] vetorC = metodoRetornoVetorC(vetorA, vetorB);

        exibeVetor(vetorC);
    }

    public static int[] metodoRetornoVetorB(int[] vetorA) {
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            vetorB[i] = 3 * vetorA[i];
        }
        return vetorB;
    }

    public static int[] metodoRetornoVetorC(int[] vetorA, int[] vetorB) {
        int[] vetorC = new int[vetorA.length]; 

        for (int i = 0; i < vetorA.length; i++) {
            vetorC[i] = vetorA[i] - vetorB[i];
        }
        return vetorC;
    }

    public static void exibeVetor(int[] vetor) {
        System.out.print("Os elementos do vetor C são: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
