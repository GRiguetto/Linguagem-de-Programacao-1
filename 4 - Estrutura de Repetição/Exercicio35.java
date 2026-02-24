
// Escrever um algoritmo que um número indefinido de valores, para cada entrada de dados a entrada de 2 valores, o primeiro representando o número de um aluno, e o segundo representando a sua altura em centímetros. Encontre o aluno mais alto e o mais baixo. Mostre o número do aluno mais alto e do mais baixo, junto com suas alturas

import java.util.Scanner;

public class Exercicio35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroAlunoMaisAlto = 0;
        int numeroAlunoMaisBaixo = 0;
        int alturaMaisAlta = Integer.MIN_VALUE;
        int alturaMaisBaixa = Integer.MAX_VALUE;

        while (true) {
            System.out.print("Digite o número do aluno (ou -1 para encerrar): ");
            int numeroAluno = scanner.nextInt();

            if (numeroAluno == -1) {
                break;
            }

            System.out.print("Digite a altura do aluno em centímetros: ");
            int altura = scanner.nextInt();

            if (altura > alturaMaisAlta) {
                alturaMaisAlta = altura;
                numeroAlunoMaisAlto = numeroAluno;
            }

            if (altura < alturaMaisBaixa) {
                alturaMaisBaixa = altura;
                numeroAlunoMaisBaixo = numeroAluno;
            }
        }

        scanner.close();

        if (numeroAlunoMaisAlto != 0 && numeroAlunoMaisBaixo != 0) {
            System.out.println("\nAluno mais alto:");
            System.out.println("Número do aluno: " + numeroAlunoMaisAlto);
            System.out.println("Altura: " + alturaMaisAlta + " cm");

            System.out.println("\nAluno mais baixo:");
            System.out.println("Número do aluno: " + numeroAlunoMaisBaixo);
            System.out.println("Altura: " + alturaMaisBaixa + " cm");
        } else {
            System.out.println("\nNenhuma entrada válida foi fornecida.");
        }
    }
}