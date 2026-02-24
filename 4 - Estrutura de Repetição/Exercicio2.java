import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        // Faça um algoritmo para imprimir o nome da disciplina e um "beep" um número de vezes determinado pelo usuário

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome da disciplina: ");
        String disciplina = scanner.nextLine();

        System.out.print("Digite a quantidade de beeps: ");
        int quantidadeBeeps = scanner.nextInt();

        for (int i = 0; i < quantidadeBeeps; i++) {
            System.out.println(disciplina + " beep");
        }
    }
}