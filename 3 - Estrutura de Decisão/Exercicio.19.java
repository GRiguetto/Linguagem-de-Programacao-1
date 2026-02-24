//  O comerciante, ainda não satisfeito, solicitou à empresa de informática responsável pelos programas em sua loja, um programa que permite saber o lucro médio obtido quando acontece a compra por um cliente. Para isso, será necessário saber quantos produtos de cada tipo foi comprado pelo cliente, e fazer a média dos lucros em porcentagem
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> produtos = new HashMap<>();
        produtos.put("produto1", "Descrição do Produto 1");
        produtos.put("produto2", "Descrição do Produto 2");
        produtos.put("produto3", "Descrição do Produto 3");

        System.out.println(calcularLucroMedio(produtos, scanner));

        scanner.close();
    }

    private static String calcularLucroMedio(Map<String, String> produtos, Scanner scanner) {
        int totalProdutos = 0;
        double totalLucro = 0;

        for (Map.Entry<String, String> entry : produtos.entrySet()) {
            String produto = entry.getKey();
            String descricao = entry.getValue();

            System.out.print("Informe a quantidade de " + descricao + "s comprados: ");
            int quantidade = scanner.nextInt();

            System.out.print("Informe o custo unitário do " + descricao + ": ");
            double custo = scanner.nextDouble();

            System.out.print("Informe o preço de venda unitário do " + descricao + ": ");
            double precoVenda = scanner.nextDouble();

            double lucroUnitario = ((precoVenda - custo) / custo) * 100;
            double lucroTotal = lucroUnitario * quantidade;

            totalProdutos += quantidade;
            totalLucro += lucroTotal;
        }

        double lucroMedio = totalLucro / totalProdutos;

        return "O lucro médio obtido na compra é de " + String.format("%.2f", lucroMedio) + "%";
    }
}