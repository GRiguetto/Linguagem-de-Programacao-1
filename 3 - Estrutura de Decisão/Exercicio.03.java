import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Faça um algoritmo que leia os valores A, B, C e diga se a soma de A + B é menor que C.

        System.out.print("Digite o valor de A: ");
        int a = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        int b = scanner.nextInt();

        System.out.print("Digite o valor de C: ");
        int c = scanner.nextInt();

        int acomb = a + b;

        if (acomb == c) {
            System.out.println("A + B é igual a C");
        } else if (acomb < c) {
            System.out.println("A + B é menor que C");
        } else {
            System.out.println("A + B é maior que C");
        }
    }
}