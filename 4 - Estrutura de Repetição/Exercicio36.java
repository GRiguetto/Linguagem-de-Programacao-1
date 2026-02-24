//Faça um algoritmo que leia o nome, salário e número de filhos de 100 pessoas, e calcule: 
//O salário médio das pessoas que possuam 2 filhos 
//O salário médio das que não possuem filhos 
//Qual a média salarial maior, entre os que têm um e dois filhos 
//O salário médio geral

import java.util.Scanner;

public class Exercicio36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalPessoas = 100;
        int pessoasComDoisFilhos = 0;
        int pessoasSemFilhos = 0;
        int pessoasComUmFilho = 0;

        double salarioTotal = 0;
        double salarioComDoisFilhos = 0;
        double salarioSemFilhos = 0;
        double salarioComUmFilho = 0;

        for (int i = 1; i <= totalPessoas; i++) {
            System.out.println("Pessoa " + i);
            System.out.print("Nome: ");
            String nome = scanner.next();

            System.out.print("Salário: ");
            double salario = scanner.nextDouble();
            salarioTotal += salario;

            System.out.print("Número de filhos: ");
            int numeroFilhos = scanner.nextInt();

            if (numeroFilhos == 2) {
                pessoasComDoisFilhos++;
                salarioComDoisFilhos += salario;
            } else if (numeroFilhos == 0) {
                pessoasSemFilhos++;
                salarioSemFilhos += salario;
            } else if (numeroFilhos == 1) {
                pessoasComUmFilho++;
                salarioComUmFilho += salario;
            }
        }

        scanner.close();

        double mediaSalarioComDoisFilhos = pessoasComDoisFilhos > 0 ? salarioComDoisFilhos / pessoasComDoisFilhos : 0;
        double mediaSalarioSemFilhos = pessoasSemFilhos > 0 ? salarioSemFilhos / pessoasSemFilhos : 0;
        double mediaSalarioComUmFilho = pessoasComUmFilho > 0 ? salarioComUmFilho / pessoasComUmFilho : 0;
        double mediaSalarioGeral = salarioTotal / totalPessoas;

        System.out.println("\nResultados:");
        System.out.println("Média salarial das pessoas com 2 filhos: " + mediaSalarioComDoisFilhos);
        System.out.println("Média salarial das pessoas sem filhos: " + mediaSalarioSemFilhos);
        System.out.println("Média salarial maior entre os que têm um e dois filhos: " + Math.max(mediaSalarioComUmFilho, mediaSalarioComDoisFilhos));
        System.out.println("Média salarial geral: " + mediaSalarioGeral);
    }
}