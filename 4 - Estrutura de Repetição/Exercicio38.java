// Um Frigorífico possui 500 bois, e deseja saber o número de boi que possui o peso mais gordo e do boi que possui o peso mais magro e média de pesos dos bois. Cada boi possui um número de identificação. Faça o mesmo programa utilizando while, for e do...while. Observação: se houver dois bois ou mais bois com o peso maior ou menor peso, o programa deverá informar o usuário no final da execução. 

import java.util.Scanner;

public class Exercicio38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroBoi = 1;
        int boiMaisGordo = 0;
        int boiMaisMagro = 0;
        double pesoMaisGordo = 0;
        double pesoMaisMagro = Double.MAX_VALUE;
        double somaPesos = 0;
        int quantidadeBois = 500;

        do {
            System.out.print("Digite o peso do boi #" + numeroBoi + ": ");
            double pesoBoi = scanner.nextDouble();

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
        } while (numeroBoi <= quantidadeBois);

        double mediaPesos = somaPesos / quantidadeBois;

        System.out.println("\nResultados usando do...while:");
        System.out.println("Boi mais gordo: #" + boiMaisGordo + " com peso " + pesoMaisGordo);
        System.out.println("Boi mais magro: #" + boiMaisMagro + " com peso " + pesoMaisMagro);
        System.out.println("Média de pesos: " + mediaPesos);

        scanner.close();
    }
}