// 3 - Você foi contratado pelo melhor time de futebol do mundo, para fazer um programa que: 
// // durante um jogo de futebol, leia um fato ocorrido no jogo, este fato pode ser : 
// 0- Fim da partida 
// 1- Faltas cometidas 
// 2- Faltas recebidas 
// 3- Escanteios a Favor 
// 4- Passes Errados 
// 5- Chutes a gol 
// Ao final da partida o programa deverá imprimir os totais de cada fato. 

import java.util.Scanner;

public class EstatisticasJogo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variáveis para contar os totais de cada fato
        int faltasCometidas = 0;
        int faltasRecebidas = 0;
        int escanteiosAFavor = 0;
        int passesErrados = 0;
        int chutesAGol = 0;

        while (true) {
            System.out.println("Digite o código do fato (0 a 5) ou 9 para encerrar o jogo:");
            int codigoFato = scanner.nextInt();

            if (codigoFato == 9) {
                break;
            }

            switch (codigoFato) {
                case 1:
                    faltasCometidas++;
                    break;
                case 2:
                    faltasRecebidas++;
                    break;
                case 3:
                    escanteiosAFavor++;
                    break;
                case 4:
                    passesErrados++;
                    break;
                case 5:
                    chutesAGol++;
                    break;
                default:
                    System.out.println("Código de fato inválido. Tente novamente.");
                    continue; 
            }
        }

        System.out.println("Totais de fatos ao final da partida:");
        System.out.println("Faltas Cometidas: " + faltasCometidas);
        System.out.println("Faltas Recebidas: " + faltasRecebidas);
        System.out.println("Escanteios a Favor: " + escanteiosAFavor);
        System.out.println("Passes Errados: " + passesErrados);
        System.out.println("Chutes a Gol: " + chutesAGol);

        scanner.close();
    }
}