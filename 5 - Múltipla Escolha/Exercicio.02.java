// 2 - Para eleição de representantes de classe de uma universidade há três candidatos.
// Os votos são informados através de código: 1,2 ou 3 (voto para os respectivos candidatos),
// 5 (voto nulo) e 6 (voto em branco). Faça um algoritmo que calcule e escreva: 
// a. A porcentagem e o total de votos para cada candidato 
// b. Total de votos nulos 
// c. Total de votos em branco 
// d. Percentual de votos em brancos e nulos 
// e. Classificação dos candidatos 
// f. Total de votos 

import java.util.Scanner;

public class EleicaoRepresentantes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int votosCandidato1 = 0;
        int votosCandidato2 = 0;
        int votosCandidato3 = 0;
        int votosNulos = 0;
        int votosBranco = 0;
        int totalVotos = 0;

        while (true) {
            System.out.println("Digite o código do voto (1, 2, 3, 5 ou 6) ou 0 para encerrar:");
            int codigoVoto = scanner.nextInt();

            if (codigoVoto == 0) {
                break;
            }

            switch (codigoVoto) {
                case 1:
                    votosCandidato1++;
                    break;
                case 2:
                    votosCandidato2++;
                    break;
                case 3:
                    votosCandidato3++;
                    break;
                case 5:
                    votosNulos++;
                    break;
                case 6:
                    votosBranco++;
                    break;
                default:
                    System.out.println("Código de voto inválido. Tente novamente.");
                    continue; 
            }

            totalVotos++;
        }

        double porcentagemCandidato1 = (double) votosCandidato1 / totalVotos * 100;
        double porcentagemCandidato2 = (double) votosCandidato2 / totalVotos * 100;
        double porcentagemCandidato3 = (double) votosCandidato3 / totalVotos * 100;
        double porcentagemNulos = (double) votosNulos / totalVotos * 100;
        double porcentagemBranco = (double) votosBranco / totalVotos * 100;

        System.out.println("a. Porcentagem de votos para cada candidato:");
        System.out.println("   Candidato 1: " + porcentagemCandidato1 + "%");
        System.out.println("   Candidato 2: " + porcentagemCandidato2 + "%");
        System.out.println("   Candidato 3: " + porcentagemCandidato3 + "%");

        System.out.println("b. Total de votos nulos: " + votosNulos);
        System.out.println("c. Total de votos em branco: " + votosBranco);

        System.out.println("d. Percentual de votos nulos e em branco: " + (porcentagemNulos + porcentagemBranco) + "%");

        System.out.println("e. Classificação dos candidatos:");
        System.out.println("   Candidato 1: " + votosCandidato1 + " votos");
        System.out.println("   Candidato 2: " + votosCandidato2 + " votos");
        System.out.println("   Candidato 3: " + votosCandidato3 + " votos");

        System.out.println("f. Total de votos: " + totalVotos);

        scanner.close();
    }
}