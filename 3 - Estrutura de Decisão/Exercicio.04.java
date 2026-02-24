import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Faça um algoritmo para ler dois números e imprimir se eles são iguais,
        // caso contrário, imprimir a mensagem: “os números são diferentes"

        System.out.print("Digite o valor do primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o valor do segundo número: ");
        int num2 = scanner.nextInt();

        if (num1 == num2) {
            System.out.println("Os números são iguais");
        } else {
            System.out.println("Os números são diferentes");
        }
    }
}