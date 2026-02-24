// 10 - Faça um algoritmo que receba o valor do salário mínimo, o salário do funcionário, calcule e mostre a quantidade de salários mínimos que esse funcionário recebe. 

import java.util.Scanner;

public class SalariosMinimos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do salário mínimo: ");
        double salarioMinimo = scanner.nextDouble();

        System.out.print("Digite o salário do funcionário: ");
        double salarioFuncionario = scanner.nextDouble();

        double quantidadeSalariosMinimos = salarioFuncionario / salarioMinimo;

        System.out.println("O funcionário recebe " + quantidadeSalariosMinimos + " salários mínimos.");

        scanner.close();
    }
}