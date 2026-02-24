import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // O total de R$ 780.000,00 será dividido entre os três primeiros colocados de um concurso,
        // em partes diretamente proporcionais aos pontos conseguidos por eles.
        // Construa um programa que leia o número de pontos dos três primeiros colocados e
        // imprima o valor recebido por cada um deles.

        System.out.print("Digite a quantidade de pontos do 1° colocado: ");
        double ponto1 = scanner.nextDouble();

        System.out.print("Digite a quantidade de pontos do 2° colocado: ");
        double ponto2 = scanner.nextDouble();

        System.out.print("Digite a quantidade de pontos do 3° colocado: ");
        double ponto3 = scanner.nextDouble();

        double total = ponto1 + ponto2 + ponto3;
        double valor1 = (ponto1 / total) * 780000;
        double valor2 = (ponto2 / total) * 780000;
        double valor3 = (ponto3 / total) * 780000;

        System.out.println("Primeiro colocado: R$" + valor1);
        System.out.println("Segundo colocado: R$" + valor2);
        System.out.println("Terceiro colocado: R$" + valor3);
    }
}