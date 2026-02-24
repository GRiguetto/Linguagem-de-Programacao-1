// Dado três números digitados pelo usuário, e todos diferentes, imprima o menor número
import java.util.Scanner;

public class Exercicio21 {
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
            int menorNum = Math.min(n1, Math.min(n2, n3));

            System.out.println("O menor número é " + menorNum);
        }

        scanner.close();
    }
}