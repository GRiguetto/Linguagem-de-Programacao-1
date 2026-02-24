import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        // Faça um algoritmo que imprima todos os números de 1 até um número especificado pelo usuário e a soma deles

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número maior que 1: ");
        int numero = scanner.nextInt();

        if (numero <= 1) {
            System.out.println("Por favor, insira um número válido, maior que 1.");
        } else {
            int soma = 0;

            for (int i = 1; i <= numero; i++) {
                System.out.println(i);
                soma += i;
            }

            System.out.println("A soma dos números de 1 até " + numero + " é: " + soma);
        }
    }
}