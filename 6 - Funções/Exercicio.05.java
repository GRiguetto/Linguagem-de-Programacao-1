// 5 - Faça um programa que receba o valor a ser depositado pelo usuário e a 
// taxa de juros, crie uma função para calcular o rendimento e utilize-a para
// mostrar quanto o usuário terá depois da aplicação dos juros. 

import java.util.Scanner;

public class CalculoRendimento {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor a ser depositado:");
        double valorDepositado = scanner.nextDouble();

        System.out.println("Digite a taxa de juros (em porcentagem):");
        double taxaJuros = scanner.nextDouble();

        System.out.println("Digite o período de tempo em meses:");
        int meses = scanner.nextInt();

        double valorFinal = calcularRendimento(valorDepositado, taxaJuros, meses);

        System.out.println("Após a aplicação dos juros, o valor final será: " + valorFinal);

        scanner.close();
    }

    // Função para calcular o rendimento com base no valor depositado, taxa de juros e período
    public static double calcularRendimento(double valorDepositado, double taxaJuros, int meses) {
        double taxaDecimal = taxaJuros / 100.0;
        double valorFinal = valorDepositado * Math.pow((1 + taxaDecimal), meses);

        return valorFinal;
    }
}
