//   6 - Repita o exercício anterior considerando que os menus sejam de uma lanchonete, e são os seguintes: 
// - As bebidas e as quantidades vendidas 
// - Os lanches e as quantidades vendidas 
// - As porções e as quantidades consumidas 
// No final do processa // a. A maior e a menor conta 
// b. A média de gasto por mesa 
// c. A média de gasto por pessoa  . A média de lanches consumidos por mesa 
// e. A média de lanches consumidos por pessoas 
// f. A média de porções consumidas por mesa 

import java.util.Scanner;

public class Lanchonete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numMesas;
        double totalConta, maiorConta, menorConta, mediaGastoMesa, mediaGastoPessoa,
                mediaLanchesPorMesa, mediaLanchesPorPessoa, mediaPorcoesPorMesa, totalLanches, totalPorcoes;

        System.out.print("Informe o número de mesas na lanchonete: ");
        numMesas = scanner.nextInt();

        maiorConta = menorConta = totalConta = mediaGastoMesa = mediaGastoPessoa = 0;
        mediaLanchesPorMesa = mediaLanchesPorPessoa = mediaPorcoesPorMesa = totalLanches = totalPorcoes = 0;

        for (int mesa = 1; mesa <= numMesas; mesa++) {
            System.out.println("Mesa " + mesa + ":");

            // Bebidas
            System.out.print("Quantidade de bebidas vendidas: ");
            int bebidas = scanner.nextInt();

            // Lanches
            System.out.print("Quantidade de lanches vendidos: ");
            int lanches = scanner.nextInt();
            mediaLanchesPorMesa += lanches;

            // Porções
            System.out.print("Quantidade de porções consumidas: ");
            int porcoes = scanner.nextInt();
            mediaPorcoesPorMesa += porcoes;

            // Calcular conta da mesa
            double contaMesa = calcularConta(bebidas, lanches, porcoes);
            totalConta += contaMesa;

            // Atualizar maior e menor conta
            if (mesa == 1 || contaMesa > maiorConta) {
                maiorConta = contaMesa;
            }
            if (mesa == 1 || contaMesa < menorConta) {
                menorConta = contaMesa;
            }

            // Atualizar total de lanches e porções
            totalLanches += lanches;
            totalPorcoes += porcoes;
        }

        // Calcular médias
        mediaGastoMesa = totalConta / numMesas;
        mediaGastoPessoa = totalConta / (numMesas * 4); // Assumindo 4 pessoas por mesa
        mediaLanchesPorMesa /= numMesas;
        mediaLanchesPorPessoa = mediaLanchesPorMesa / (numMesas * 4);
        mediaPorcoesPorMesa /= numMesas;

        // Imprimir resultados
        System.out.println("\nResultados:");
        System.out.println("a. Maior conta: " + maiorConta);
        System.out.println("   Menor conta: " + menorConta);
        System.out.println("b. Média de gasto por mesa: " + mediaGastoMesa);
        System.out.println("c. Média de gasto por pessoa: " + mediaGastoPessoa);
        System.out.println("d. Média de lanches consumidos por mesa: " + mediaLanchesPorMesa);
        System.out.println("e. Média de lanches consumidos por pessoa: " + mediaLanchesPorPessoa);
        System.out.println("f. Média de porções consumidas por mesa: " + mediaPorcoesPorMesa);
        System.out.println("g. Total de lanches: " + totalLanches);
        System.out.println("   Total de porções: " + totalPorcoes);

        scanner.close();
    }

    // Função para calcular a conta da mesa
    private static double calcularConta(int bebidas, int lanches, int porcoes) {
        double precoBebida = 3.0; // Preço por bebida
        double precoLanche = 15.0; // Preço por lanche
        double precoPorcao = 10.0; // Preço por porção

        return (bebidas * precoBebida) + (lanches * precoLanche) + (porcoes * precoPorcao);
    }
}