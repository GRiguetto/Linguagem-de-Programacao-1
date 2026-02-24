import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        // Elabore um algoritmo para ler os números N e P, e calcule a exponenciação de NP

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de N: ");
        double n = scanner.nextDouble();

        System.out.print("Digite o valor de P: ");
        double p = scanner.nextDouble();

        double exp = Math.pow(n, p);

        System.out.println("O resultado da exponenciação NP é " + exp);
    }
}