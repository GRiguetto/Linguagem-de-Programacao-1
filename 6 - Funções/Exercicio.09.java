// 9 - Os salários dos empregados de uma empresa sofreram um aumento.
// Técnicos tiveram um aumento de 50%, gerentes de 30% e os demais de 10%. 
// Faça um programa que calcule o salário reajustado para cada profissão. 

import java.util.Scanner;

public class ReajusteSalario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o cargo do empregado (Técnico, Gerente ou Outros):");
        String cargo = scanner.nextLine();

        System.out.println("Digite o salário atual do empregado:");
        double salarioAtual = scanner.nextDouble();

        double salarioReajustado = calcularSalarioReajustado(cargo, salarioAtual);

        System.out.println("O novo salário para o cargo de " + cargo + " é de R$" + salarioReajustado);

        scanner.close();
    }

    // Função para calcular o salário reajustado de acordo com a profissão
    public static double calcularSalarioReajustado(String cargo, double salarioAtual) {
        switch (cargo.toLowerCase()) {
            case "técnico":
                return salarioAtual * 1.5;
            case "gerente":
                return salarioAtual * 1.3;
            case "outros":
                return salarioAtual * 1.1;
            default:
                System.out.println("Cargo inválido. Não foi possível calcular o reajuste.");
                return salarioAtual;
        }
    }
}