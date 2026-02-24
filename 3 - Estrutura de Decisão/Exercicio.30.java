//Calcule a média aritmética de três valores A, B e C, escrevendo o valor e a mensagem apropriada

// Média 	         Mensagens 
// média > 9 	“Aluno excelente!” 
// 8 < média <= 9 	“Bom aluno!” 
// 7 < média <= 8 	“Aluno regular.” 
// 6 < média <= 7 	“Aluno aprovado.” 
// 5 < média <= 6 	“Aluno de exame.” 
// média <= 5 	“Aluno reprovado.” 

import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da nota A: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o valor da nota B: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o valor da nota C: ");
        double c = scanner.nextDouble();

        double media = (a + b + c) / 3;

        System.out.println("Média: " + media);

        if (media > 9) {
            System.out.println("Aluno Excelente!");
        } else if (media <= 9 && media > 8) {
            System.out.println("Bom aluno!");
        } else if (media <= 8 && media > 7) {
            System.out.println("Aluno regular");
        } else if (media <= 7 && media > 6) {
            System.out.println("Aluno aprovado");
        } else if (media <= 6 && media > 5) {
            System.out.println("Aluno de exame");
        } else if (media <= 5) {
            System.out.println("Aluno reprovado");
        }

        scanner.close();
    }
}