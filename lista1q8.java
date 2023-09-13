import java.util.Random;

public class lista1q8 {
    public static void main(String[] args) {
        int quantidade = 10;
        int[] par = new int[quantidade];
        int[] impar = new int[quantidade];
        Random rand = new Random();

        for (int i = 0; i < quantidade; i++) {
            int numeroAleatorio = rand.nextInt(20) + 1; 

            if (numeroAleatorio % 2 == 0) {
                par[i] = numeroAleatorio;
            } else {
                impar[i] = numeroAleatorio;
            }
        }

        System.out.println("Números Pares:");
        exibirVetor(par);

        System.out.println("\nNúmeros Ímpares:");
        exibirVetor(impar);
    }

    public static void exibirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != 0) {
                System.out.print(vetor[i] + " ");
            }
        }
        System.out.println();
    }
}
