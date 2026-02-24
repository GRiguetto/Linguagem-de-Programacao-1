import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Faça um algoritmo que receba duas notas de prova de um aluno
        // e a média mínima para aprovação. Imprima a média final do aluno
        // e informe se ele foi aprovado ou reprovado.

        System.out.print("Digite o valor da primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite o valor da segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite o valor da terceira nota: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("Média obtida: " + media);

        if (media >= 7) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado!");
        }
    }
}