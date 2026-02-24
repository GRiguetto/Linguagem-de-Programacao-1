// 10 - Elaborar um programa utilizando funções que calcule a média ponderada de um
// aluno da disciplina de Algoritmo. Esta média tem pesos: 4 para a primeira prova e
// 3 para a segunda prova. Após calculada a média, uma mensagem deve ser apresentada
// informando a situação do aluno: APROVADO COM MÉDIA ou NECESSITA FAZER SUBSTITUTIVA.
// Caso o aluno necessite fazer prova substitutiva, o programa deve pedir esta nota e 
// calcular a nova média do aluno. Uma nova mensagem da situação deve informar ALUNO COM
// MÉDIA ou ALUNO REPROVADO. Obs: A prova substitutiva pode substituir a primeira prova 
// ou a segunda prova, portanto o programa deve verificar quando o aluno fica com maior média,
// isto é, quando a primeira prova é substituída pela prova substitutiva ou quando a segunda
// prova é substituída pela prova substitutiva. 

import java.util.Scanner;

public class CalculoMedia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota da primeira prova:");
        double notaProva1 = scanner.nextDouble();

        System.out.println("Digite a nota da segunda prova:");
        double notaProva2 = scanner.nextDouble();

        double mediaPonderada = calcularMediaPonderada(notaProva1, notaProva2);

        System.out.println("Média Ponderada: " + mediaPonderada);

        if (mediaPonderada >= 6.0) {
            System.out.println("APROVADO COM MÉDIA");
        } else {
            System.out.println("NECESSITA FAZER SUBSTITUTIVA");

            System.out.println("Digite a nota da prova substitutiva:");
            double notaSubstitutiva = scanner.nextDouble();

            double novaMedia = calcularNovaMedia(mediaPonderada, notaSubstitutiva);

            if (novaMedia >= 6.0) {
                System.out.println("ALUNO COM MÉDIA");
            } else {
                System.out.println("ALUNO REPROVADO");
            }
        }

        scanner.close();
    }

    // Função para calcular a média ponderada
    public static double calcularMediaPonderada(double notaProva1, double notaProva2) {
        return (4 * notaProva1 + 3 * notaProva2) / 7;
    }

    // Função para calcular a nova média considerando a substituição de uma prova
    public static double calcularNovaMedia(double mediaAtual, double notaSubstitutiva) {
        if (mediaAtual * 4 / 7 < mediaAtual * 3 / 7) {
            return (4 * notaSubstitutiva + 3 * mediaAtual) / 7;
        } else {
            return (4 * mediaAtual + 3 * notaSubstitutiva) / 7;
        }
    }
}
