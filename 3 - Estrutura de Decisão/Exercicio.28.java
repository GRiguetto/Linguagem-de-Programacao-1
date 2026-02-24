// Os salários dos empregados de uma empresa sofreram um aumento. Técnicos tiveram um aumento de 50%, gerentes de 30% e os demais de 10%. Faça um programa que calcule o salário reajustado para cada profissão

import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a profissão do empregado (Técnico, Gerente ou Outros): ");
        String profissao = scanner.nextLine();

        System.out.print("Digite o salário do empregado: ");
        double salario = scanner.nextDouble();

        double aumento = 0.0;

        if (profissao.equalsIgnoreCase("Técnico")) {
            aumento = salario * 0.5;
        } else if (profissao.equalsIgnoreCase("Gerente")) {
            aumento = salario * 0.3;
        } else if (profissao.equalsIgnoreCase("Outros")) {
            aumento = salario * 0.1;
        } else {
            System.out.println("Digite uma profissão válida (Técnico, Gerente ou Outros)");
            System.exit(0);
        }

        double novoSalario = salario + aumento;

        System.out.println("O novo salário do empregado é R$ " + novoSalario);

        scanner.close();
    }
}