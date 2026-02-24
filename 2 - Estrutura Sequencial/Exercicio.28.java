// 28 - Um funcionário recebe um salário fixo mais 4,0% de comissão sobre as vendas.
// Faça um algoritmo que receba o salário fixo e o valor das vendas,
// calcule e mostre a comissão e o salário final do funcionário.

import java.util.Scanner;

public class CalculoComissaoSalario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário fixo do funcionário: ");
        double salarioFixo = scanner.nextDouble();

        System.out.print("Digite o valor das vendas do funcionário: ");
        double valorVendas = scanner.nextDouble();

        double comissao = 0.04 * valorVendas;

        double salarioFinal = salarioFixo + comissao;

        System.out.println("A comissão do funcionário é: " + comissao);
        System.out.println("O salário final do funcionário é: " + salarioFinal);

        scanner.close();
    }
}