import java.util.Scanner;

public class lista1q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidade = 15;
        int[] vetor = new int[quantidade];

        System.out.println("Digite 15 números inteiros:");

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        int[] vetorResultante = encontrarPrimos(vetor);

        System.out.println("Os números primos são:");
        exibirVetor(vetorResultante);
    }

    public static boolean verificaPrimos(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int[] encontrarPrimos(int[] vetor) {
        int countPrimos = 0;
        int tamanho = vetor.length;

        for (int i = 0; i < tamanho; i++) {
            if (verificaPrimos(vetor[i])) {
                countPrimos++;
            }
        }

        int[] vetorPrimos = new int[countPrimos];
        int index = 0;

        for (int i = 0; i < tamanho; i++) {
            if (verificaPrimos(vetor[i])) {
                vetorPrimos[index] = vetor[i];
                index++;
            }
        }

        return vetorPrimos;
    }

    public static void exibirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}
