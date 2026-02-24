// Suponha que um caixa disponha apenas notas de R$100, R$10 e R$1. Considerando que alguém está pagando uma compra, faça um programa para determinar o número mínimo de notas que o caixa deve fornecer como troco. Imprima também o valor da compra, o valor do troco e a quantidade de cada tipo de nota a ser fornecido como troco. Suponha que o sistema monetário não utilize centavos.

import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        int valorCompra = scanner.nextInt();

        System.out.print("Digite o valor pago pelo cliente: ");
        int valorPago = scanner.nextInt();

        int troco = valorPago - valorCompra;

        System.out.println("Valor da compra R$ " + valorCompra);
        System.out.println("Valor pago pelo cliente R$ " + valorPago);
        System.out.println("Troco R$ " + troco);

        int nota100 = troco / 100;
        int nota10 = (troco % 100) / 10;
        int nota1 = (troco % 100) % 10;

        System.out.println("Quantidade mínima de notas utilizadas para o troco:");
        System.out.println("Notas de 100 = " + nota100);
        System.out.println("Notas de 10 = " + nota10);
        System.out.println("Notas de 1 = " + nota1);

        scanner.close();
    }
}