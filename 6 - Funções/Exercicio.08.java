// 8 - Escreva um programa para calcular o reajuste salarial dos empregados de uma empresa, de acordo com os seguintes critérios: 
// a. Os funcionários com salário inferior a 1.000,00 devem ter um reajuste de 55%; 
// b. Funcionários com salário de 1.000,00 (inclusive) a 2.500,00 (inclusive) devem ter um reajuste de 33%; 
// c. Os funcionários com salário superior a 2.500,00 devem ter um reajuste de 20%; 
// Crie uma função que receba o salário do funcionário e mostre o valor do reajuste. 

import java.util.Scanner;

public class ReajusteSalarial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o salário do funcionário:");
        double salario = scanner.nextDouble();

        double reajuste = calcularReajuste(salario);

        System.out.println("O reajuste para o salário de R$" + salario + " é de R$" + reajuste);

        scanner.close();
    }

    // Função para calcular o reajuste salarial 
    public static double calcularReajuste(double salario) {
        if (salario < 1000) {
            return salario * 0.55;
        } else if (salario >= 1000 && salario <= 2500) {
            return salario * 0.33;
        } else {
            return salario * 0.20;
        }
    }
}