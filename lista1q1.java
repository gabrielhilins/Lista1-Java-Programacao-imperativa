public class lista1q1 
{
    public static void main(String[] args) 
    {

        int[] vetorA = { 1, 2, 3, 4, 5, 6, 7, 8 };
        
        // Armazenando um vetor de inteiros retornado
        // por um método
        int[] vetorB = metodoRetVetor(vetorA);
 
        // Exibindo os elementos do vetor
        exibeVetor(vetorB);
    }
    
    // Retornando um vetor de inteiros 
    public static int[] metodoRetVetor(int[] vetorB) 
    {
        // Multiplicando cada elemento do vetor por 3
        System.out.print("Os elementos do vetor B são: ");
        for (int i = 0; i < vetorB.length; i++)
            vetorB[i] = 3 * vetorB[i];
        return vetorB;
    }
    
    public static void exibeVetor(int[] vetorB)
    {
        
        for (int i = 0; i < vetorB.length; i++)
            System.out.print(vetorB[i] + " ");
    }
}

