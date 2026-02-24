// Dado três números digitados pelo usuário, e todos diferentes, imprima o maior número
import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número 1: ");
        int n1 = scanner.nextInt();

        System.out.print("Digite o número 2: ");
        int n2 = scanner.nextInt();

        System.out.print("Digite o número 3: ");
        int n3 = scanner.nextInt();

        if (n1 == n2 || n1 == n3 || n2 == n3) {
            System.out.println("Os números são iguais. Pare de palhaçada.");
        } else {
            int maiorNum = Math.max(n1, Math.max(n2, n3));

            System.out.println("O maior número é " + maiorNum);
        }

        scanner.close();
    }
}