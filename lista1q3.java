public class lista1q3 {
    public static void main(String[] args) {
        int[] vetorA = {1, 2, 3, 4, 5};
        int[] vetorB = {6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int[] vetorC = metodoRetornoVetorC(vetorA, vetorB);

        exibeVetorC(vetorC);
    }

    public static int[] metodoRetornoVetorC(int[] vetorA, int[] vetorB) {
        int tamanhoC = vetorA.length + vetorB.length;
        int[] vetorC = new int[tamanhoC];

        for (int i = 0; i < vetorA.length; i++) {
            vetorC[i] = vetorA[i];
        }

        for (int i = 0; i < vetorB.length; i++) {
            vetorC[i + vetorA.length] = vetorB[i];
        }

        return vetorC;
    }

    public static void exibeVetorC(int[] vetor) {
        System.out.println("O vetor C (junção de A e B) é:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("C[" + i + "]: " + vetor[i]);
        }
    }
}
