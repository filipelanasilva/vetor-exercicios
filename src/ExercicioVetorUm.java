
import java.util.Scanner;

public class ExercicioVetorUm {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número de posições totais para um vetor: ");
        int[] vetor = new int[scanner.nextInt()];

        for (int i = 0; i < vetor.length; i++) {

            System.out.printf("Digite um valor numérico para a posição %d do vetor: ", i);
            vetor[i] = scanner.nextInt();

        }

        for(int i = 0; i < vetor.length; i++) {

            for (int j = 0; j < vetor.length; j++) {

                if (vetor[i] < vetor[j]) {

                    int aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;

                }

            }

        }

        System.out.println("\nVALOR DE CADA POSIÇÃO DO VETOR EM ORDEM CRESCENTE:");
        for (int i = 0; i < vetor.length; i++) {

            System.out.println(vetor[i]);

        }

        System.out.print("\nAgora, digite um nome para saber quantas vogais ele tem: ");
        String nome = scanner.next();

        scanner.close();

        char[] vogais = {'a', 'e', 'i', 'o', 'u'};

        int quantidadeVogais = 0;

        for (int i = 0; i < nome.length(); i++) {

            for (int j = 0; j < vogais.length; j++) {

                if (vogais[j] == nome.charAt(i)) {

                    quantidadeVogais++;

                }

            }

        }

        switch (quantidadeVogais) {
            case 0:
                System.out.printf("O nome '%s' não tem vogais.", nome);
            case 1:
                System.out.printf("O nome '%s' possui %d vogal.", nome, quantidadeVogais);
            default:
                System.out.printf("O nome'%s' possui %d vogais.", nome, quantidadeVogais);
        }

    }

}
