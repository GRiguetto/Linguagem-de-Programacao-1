// Elaborar um programa que calcule a média ponderada de um aluno da disciplina de Algoritmo. Esta média tem pesos: 4 para a primeira prova e 3 para a segunda prova. Após calculada a média, uma mensagem deve ser apresentada informando a situação do aluno: APROVADO COM MÉDIA ou NECESSITA FAZER SUBSTITUTIVA. Caso o aluno necessite fazer prova substitutiva, o programa deve pedir esta nota e calcular a nova média do aluno. Uma nova mensagem da situação deve informar ALUNO COM MÉDIA ou ALUNO REPROVADO (leve em conta que a prova substitutiva pode substituir a primeira prova ou a segunda prova, portanto o programa deve verificar quando o aluno fica com maior média, isto é, quando a primeira prova é substituída pela prova substitutiva ou quando a segunda prova é substituída pela prova substitutiva)

import java.util.Scanner;

public class Exercicio31 {
    public static double calcularMedia(double notaProva1, double notaProva2) {
        double pesoProva1 = 4;
        double pesoProva2 = 3;
        return (notaProva1 * pesoProva1 + notaProva2 * pesoProva2) / (pesoProva1 + pesoProva2);
    }

    public static String verificarSituacao(double media) {
        if (media >= 7) {
            return "APROVADO COM MÉDIA";
        } else {
            return "NECESSITA FAZER SUBSTITUTIVA";
        }
    }

    public static String verificarSituacaoSub(double novaMedia) {
        if (novaMedia >= 7) {
            return "APROVADO COM SUBSTITUTIVA";
        } else {
            return "REPROVADO";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota da primeira prova: ");
        double notaProva1 = scanner.nextDouble();

        System.out.print("Digite a nota da segunda prova: ");
        double notaProva2 = scanner.nextDouble();

        double mediaInicial = calcularMedia(notaProva1, notaProva2);
        System.out.println("Média inicial: " + mediaInicial);

        String situacaoInicial = verificarSituacao(mediaInicial);
        System.out.println("Situação inicial: " + situacaoInicial);

        if (situacaoInicial.equals("NECESSITA FAZER SUBSTITUTIVA")) {
            System.out.print("Digite a nota da prova substitutiva: ");
            double notaSubstitutiva = scanner.nextDouble();

            double novaMedia = calcularMedia(notaSubstitutiva, notaProva2);

            String situacaoFinal = verificarSituacaoSub(novaMedia);
            System.out.println("Nova média: " + novaMedia);
            System.out.println("Situação final: " + situacaoFinal);
        }

        scanner.close();
    }
}