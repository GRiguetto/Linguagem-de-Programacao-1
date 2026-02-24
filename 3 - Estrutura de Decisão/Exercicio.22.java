// Dado três números digitados pelo usuário, e todos diferentes, imprima o número central
import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double n1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double n2 = scanner.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double n3 = scanner.nextDouble();

        if (n1 != n2 && n1 != n3 && n2 != n3) {
            double numeroCentral;

            if ((n1 > n2 && n1 < n3) || (n1 < n2 && n1 > n3)) {
                numeroCentral = n1;
            } else if ((n2 > n1 && n2 < n3) || (n2 < n1 && n2 > n3)) {
                numeroCentral = n2;
            } else {
                numeroCentral = n3;
            }

            System.out.println("O número central é: " + numeroCentral);
        } else {
            System.out.println("Por favor, digite três números diferentes.");
        }

        scanner.close();
    }
}