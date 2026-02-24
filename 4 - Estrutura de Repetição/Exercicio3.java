import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        // Faça um algoritmo para imprimir a soma dos números entre um intervalo determinado pelo usuário, incluindo os limites inferiores e superiores.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número inferior: ");
        int n1 = scanner.nextInt();

        System.out.print("Digite o número superior: ");
        int n2 = scanner.nextInt();

        if (n1 > n2) {
            System.out.println("Não foi possível completar a sua operação, pois o primeiro número era maior que o segundo.");
        } else {
            int soma = 0;
            for (int i = n1; i <= n2; i++) {
                soma += i;
            }
            System.out.println("Resultado da soma: " + soma);
        }
    }
}