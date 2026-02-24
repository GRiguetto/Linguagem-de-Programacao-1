//O Palmeiras deseja aumentar o salário de seus jogadores e de sua comissão técnica para motivá-los na tentativa de subir para a primeira divisão. O ajuste salarial deve obedecer à seguinte tabela
 
//  Categoria 		    Salário atual 	    	Ação 
//  Equipe técnica 			- 	                Aumento de 15% 
//  Jogadores 		    R$0 a R$9.000 		    Aumento de 20% 
//                      R$9.001 a R$13.000 	    Aumento de 10% 
//                      R$13.001 a R$18.000 	Aumento de 5% 
//                      Acima de R$18.000	    Sem aumento 
 
//  Preparar um algoritmo para ler o nome e o salário atual de cada jogador ou técnico e imprimir seu nome, salário atual e salário reajustado.

import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do jogador ou membro da equipe técnica: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o salário atual: ");
        double salarioAtual = scanner.nextDouble();

        double salarioNovo = 0.0;

        if (salarioAtual <= 9000) {
            salarioNovo = salarioAtual * 1.2;
        } else if (salarioAtual <= 13000) {
            salarioNovo = salarioAtual * 1.1;
        } else if (salarioAtual <= 18000) {
            salarioNovo = salarioAtual * 1.05;
        } else {
            salarioNovo = salarioAtual;
        }

        System.out.println("Nome: " + nome);
        System.out.println("Salário atual R$ " + salarioAtual);
        System.out.println("Salário novo R$ " + salarioNovo);

        scanner.close();
    }
}