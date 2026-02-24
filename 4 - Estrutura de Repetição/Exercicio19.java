import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        // Construir um programa que calcule a soma dos N primeiros números inteiros, onde N será digitado pelo usuário.
        // Por exemplo, soma = 1 + 2 + 3 + 4 + ..... + N

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int n = scanner.nextInt();

        int soma = 0;

        if (n < 1) {
            System.out.println("Por favor, digite um número inteiro positivo.");
        } else {
            for (int i = 1; i <= n; i++) {
                soma += i;
            }
            System.out.println("A soma dos " + n + " primeiros números inteiros é " + soma);
        }
    }
}