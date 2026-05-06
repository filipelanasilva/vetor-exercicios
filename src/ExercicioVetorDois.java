
import java.util.Scanner;

public class ExercicioVetorDois {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número de posições totais para um vetor: ");
        int tamanhoVetor = scanner.nextInt();

        int[] vetor = new int[tamanhoVetor];

        for (int i = 0; i < vetor.length; i++) {

            System.out.printf("Digite um valor numérico para a posição %d do vetor: ", i);
            vetor[i] = scanner.nextInt();

        }

        scanner.close();

        for (int i = 0; i < vetor.length; i++) {

            if (vetor[i] % 2 == 0) {

                vetor[i] *= 2;

            } else {

                vetor[i] = (int) Math.pow(vetor[i], 2);

            }

        }

        for (int i = 0; i < vetor.length; i++) {

            System.out.println(vetor[i]);

        }


    }

}
