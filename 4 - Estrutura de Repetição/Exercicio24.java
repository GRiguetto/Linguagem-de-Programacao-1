import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        // Será digitado uma série de números inteiros. Faça um algoritmo para calcular
        // e imprimir o produto desses valores, isto é, o resultado da multiplicação
        // de todos os números. Número de entrada desconhecido.

        Scanner scanner = new Scanner(System.in);
        int produto = 1;

        while (true) {
            System.out.print("Digite um número inteiro (ou pressione 0 para encerrar): ");
            int entrada = scanner.nextInt();

            if (entrada == 0) {
                break;
            }

            produto *= entrada;
            System.out.println("Resultado: " + produto);
        }
    }
}