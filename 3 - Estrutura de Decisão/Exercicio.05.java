import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Repita o exercício anterior, sabendo que os números são diferentes,
        // imprimindo qual é o maior e o menor dos números.

        System.out.print("Digite o valor do primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o valor do segundo número: ");
        int num2 = scanner.nextInt();

        if (num1 == num2) {
            System.out.println("Os números são iguais");
        } else {
            System.out.println("Os números são diferentes");

            if (num1 < num2) {
                System.out.println(num1 + " é menor que " + num2);
            } else {
                System.out.println(num1 + " é maior que " + num2);
            }
        }
    }
}