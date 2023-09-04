import java.util.Scanner;

public class lista1q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamanho = 10;
        double[] vetor = new double[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            vetor[i] = scanner.nextDouble();
        }

        int quantidadeNegativos = contarNegativos(vetor);
        double somaPositivos = somarPositivos(vetor);

        System.out.println("Quantidade de números negativos: " + quantidadeNegativos);
        System.out.println("Soma dos números positivos: " + somaPositivos);

        scanner.close();
    }

    public static int contarNegativos(double[] vetor) {
        int quantidadeNegativos = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < 0) {
                quantidadeNegativos++;
            }
        }
        return quantidadeNegativos;
    }

    public static double somarPositivos(double[] vetor) {
        double somaPositivos = 0.0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] >= 0) {
                somaPositivos += vetor[i];
            }
        }
        return somaPositivos;
    }
}
