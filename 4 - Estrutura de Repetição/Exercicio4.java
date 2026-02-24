import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        // Faça um algoritmo para imprimir os múltiplos de 5 em um intervalo informado pelo usuário.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número inferior: ");
        int n1 = scanner.nextInt();

        System.out.print("Digite o número superior: ");
        int n2 = scanner.nextInt();

        if (n1 > n2) {
            System.out.println("Não foi possível completar a sua operação, pois o primeiro número era maior que o segundo.");
        } else {
            System.out.println("Múltiplos de 5\n");

            for (int i = n1; i <= n2; i++) {
                if (i % 5 == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}