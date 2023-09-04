public class lista1q5 {
    public static void main(String[] args) 
    {
        int[] vetorA = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        
        int[] vetorB = inverterElementos(vetorA);
        
        System.out.println("Elementos do vetor A:");
        exibirVetor(vetorA);

        System.out.println("\nElementos do vetor B (invertido):");
        exibirVetor(vetorB);
    }

    public static int[] inverterElementos(int[] vetorA) 
    {
        int tamanho = vetorA.length;
        int[] vetorB = new int[tamanho];
        
        for (int i = 0; i < tamanho; i++) {
            vetorB[i] = vetorA[tamanho - 1 - i];
        }
        
        return vetorB;
    }

    public static void exibirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + ", ");
        }
    }
}
