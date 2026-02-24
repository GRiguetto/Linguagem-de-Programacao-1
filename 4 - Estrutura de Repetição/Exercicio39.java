// Repita o exercício anterior para um número indefinido de bois

import java.util.Scanner;

public class Exercicio39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroBoi = 1;
        int boiMaisGordo = 0;
        int boiMaisMagro = 0;
        double pesoMaisGordo = 0;
        double pesoMaisMagro = Double.MAX_VALUE;
        double somaPesos = 0;

        while (true) {
            System.out.print("Digite o peso do boi #" + numeroBoi + " (ou digite 0 para encerrar): ");
            double pesoBoi = scanner.nextDouble();

            if (pesoBoi == 0) {
                break;
            }

            somaPesos += pesoBoi;

            if (pesoBoi > pesoMaisGordo) {
                pesoMaisGordo = pesoBoi;
                boiMaisGordo = numeroBoi;
            }

            if (pesoBoi < pesoMaisMagro) {
                pesoMaisMagro = pesoBoi;
                boiMaisMagro = numeroBoi;
            }

            numeroBoi++;
        }

        if (numeroBoi == 1) {
            System.out.println("Nenhum boi registrado.");
        } else {
            double mediaPesos = somaPesos / (numeroBoi - 1);

            System.out.println("\nResultados para um número indefinido de bois:");
            System.out.println("Boi mais gordo: #" + boiMaisGordo + " com peso " + pesoMaisGordo);
            System.out.println("Boi mais magro: #" + boiMaisMagro + " com peso " + pesoMaisMagro);
            System.out.println("Média de pesos: " + mediaPesos);
        }

        scanner.close();
    }
}