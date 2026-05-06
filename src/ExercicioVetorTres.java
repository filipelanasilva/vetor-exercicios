
import java.util.Scanner;

public class ExercicioVetorTres {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um nome para vê-lo invertido: ");
        String nome = scanner.next();

        scanner.close();

        char[] nomeVetor = new char[nome.length()];

        for (int i = 0; i < nomeVetor.length; i++) {

            nomeVetor[i] = nome.charAt(i);

        }

        for (int aux = 0, i = nomeVetor.length - 1; i >= 0; aux++, i--) {

            nomeVetor[i] = nome.charAt(aux);

        }

        String nomeInvertido = new String(nomeVetor);

        System.out.printf("O nome '%s' invertido fica '%s'.", nome, nomeInvertido);

    }

}
