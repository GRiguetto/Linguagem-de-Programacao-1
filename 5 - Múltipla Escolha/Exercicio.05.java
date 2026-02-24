// 5 - Faça um algoritmo para calcular a conta de um número indefinidos de mesas de uma pizzaria.
// Considere que o usuário possa informar através de um menu os seguintes itens: 
// - As bebidas e as quantidades vendidas 
// - As pizzas e as quantidades vendidas 
// - As sobremesas e as quantidades vendidas 
// No final do processamento (no final do cálculo de todas as contas das mesas) as seguintes informações devem ser impressas: 
// a. A maior e a menor conta 
// b. A média de gasto por mesa 
// c. A média de gasto por pessoa 
// d. A média de pizzas consumida por mesa 
// e. A média de pedaços de pizzas consumidas por pessoas 
// f. A média de cervejas consumidas por mesas 

import java.util.Scanner;

public class Pizzaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numMesas;
        double totalConta, maiorConta, menorConta, mediaGastoMesa, mediaGastoPessoa,
                mediaPizzasPorMesa, mediaPedaçosPorPessoa, mediaCervejasPorMesa;

        System.out.print("Informe o número de mesas na pizzaria: ");
        numMesas = scanner.nextInt();

        maiorConta = menorConta = totalConta = mediaGastoMesa = mediaGastoPessoa = 0;
        mediaPizzasPorMesa = mediaPedaçosPorPessoa = mediaCervejasPorMesa = 0;

        for (int mesa = 1; mesa <= numMesas; mesa++) {
            System.out.println("Mesa " + mesa + ":");
            
            // Bebidas
            System.out.print("Quantidade de cervejas vendidas: ");
            int cervejas = scanner.nextInt();
            mediaCervejasPorMesa += cervejas;

            // Pizzas
            System.out.print("Quantidade de pizzas vendidas: ");
            int pizzas = scanner.nextInt();
            mediaPizzasPorMesa += pizzas;
            
            // Sobremesas
            System.out.print("Quantidade de sobremesas vendidas: ");
            int sobremesas = scanner.nextInt();

            // Calcular conta da mesa
            double contaMesa = calcularConta(cervejas, pizzas, sobremesas);
            totalConta += contaMesa;

            // Atualizar maior e menor conta
            if (mesa == 1 || contaMesa > maiorConta) {
                maiorConta = contaMesa;
            }
            if (mesa == 1 || contaMesa < menorConta) {
                menorConta = contaMesa;
            }
        }

        // Calcular médias
        mediaGastoMesa = totalConta / numMesas;
        mediaGastoPessoa = totalConta / (numMesas * 4); // Assumindo 4 pessoas por mesa
        mediaPizzasPorMesa /= numMesas;
        mediaPedaçosPorPessoa = (mediaPizzasPorMesa * 8) / (numMesas * 4); // Assumindo 8 pedaços por pizza

        // Imprimir resultados
        System.out.println("\nResultados:");
        System.out.println("a. Maior conta: " + maiorConta);
        System.out.println("   Menor conta: " + menorConta);
        System.out.println("b. Média de gasto por mesa: " + mediaGastoMesa);
        System.out.println("c. Média de gasto por pessoa: " + mediaGastoPessoa);
        System.out.println("d. Média de pizzas consumida por mesa: " + mediaPizzasPorMesa);
        System.out.println("e. Média de pedaços de pizzas consumidos por pessoa: " + mediaPedaçosPorPessoa);
        System.out.println("f. Média de cervejas consumidas por mesa: " + (mediaCervejasPorMesa / numMesas));

        scanner.close();
    }

    // Função para calcular a conta da mesa
    private static double calcularConta(int cervejas, int pizzas, int sobremesas) {
        double precoCerveja = 5.0; // Preço por cerveja
        double precoPizza = 20.0; // Preço por pizza
        double precoSobremesa = 10.0; // Preço por sobremesa

        return (cervejas * precoCerveja) + (pizzas * precoPizza) + (sobremesas * precoSobremesa);
    }
}