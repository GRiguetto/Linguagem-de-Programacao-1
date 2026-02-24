// 1 - Uma determinada universidade pretende desenvolver uma pesquisa através dos seus alunos matriculados.
// Para cada aluno será digitado um dos códigos 1,2 e 3 que significam: 
// · 1 indica que o aluno cursa Administração 
// · 2 indica que o aluno cursa Administração com gestão em Informática 
// · 3 indica que o aluno cursa Sistemas de Informação.
// Deseja-se saber a porcentagem e o número de alunos por curso. Considere um número indeterminado de alunos matriculados. 

import java.util.Scanner;

public class PesquisaUniversidade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigoAluno;
        int totalAlunos = 0;
        int contadorAdm = 0;
        int contadorAdmInformatica = 0;
        int contadorSistemasInformacao = 0;

        while (true) {
            System.out.print("Digite o código do aluno (1, 2 ou 3) ou 0 para encerrar: ");
            codigoAluno = scanner.nextInt();

            if (codigoAluno == 0) {
                break;
            }

            totalAlunos++;

            switch (codigoAluno) {
                case 1:
                    contadorAdm++;
                    break;
                case 2:
                    contadorAdmInformatica++;
                    break;
                case 3:
                    contadorSistemasInformacao++;
                    break;
                default:
                    System.out.println("Código inválido. Tente novamente.");
                    totalAlunos--;
            }
        }

        double porcentagemAdm = (double) contadorAdm / totalAlunos * 100;
        double porcentagemAdmInformatica = (double) contadorAdmInformatica / totalAlunos * 100;
        double porcentagemSistemasInformacao = (double) contadorSistemasInformacao / totalAlunos * 100;

        System.out.println("Total de alunos: " + totalAlunos);
        System.out.println("Porcentagem de alunos em Administração: " + porcentagemAdm + "%");
        System.out.println("Porcentagem de alunos em Administração com gestão em Informática: " + porcentagemAdmInformatica + "%");
        System.out.println("Porcentagem de alunos em Sistemas de Informação: " + porcentagemSistemasInformacao + "%");

        scanner.close();
    }
}