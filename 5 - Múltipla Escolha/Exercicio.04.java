// 4 - Faça um algoritmo para calcular a conta das mesas de uma lanchonete com base no consumo de seus clientes.
// Considere que o usuário pode escolher os seguintes itens do menu: 
// 1 – lanches: 
// X-Tudo R$ 4,00 
// X-Bacon R$ 3,00 
// X-Salada R$ 2,00 
// 2 – Bebidas: 
// Refrigerante R$ 1,50 
// Cerveja R$ 1,80 
// Água Mineral R$ 0,80
// O programa deverá ler as quantidades dos itens e calcular o valor total da conta. Isso será realizado até que 
// o usuário deseja sair do programa. No entanto, é necessário saber no final do processamento do cálculo das mesas,
// os valores da maior conta, menor conta e a média dos valores das contas das mesas. 

import java.util.Scanner;

public class CalculoContaLanchonete {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double maiorConta = Double.MIN_VALUE;
        double menorConta = Double.MAX_VALUE;
        double totalContas = 0;
        int numeroMesas = 0;

        while (true) {
            System.out.println("Digite o número da mesa (ou -1 para encerrar): ");
            int numeroMesa = scanner.nextInt();

            if (numeroMesa == -1) {
                break;
            }

            double totalMesa = 0;

            while (true) {
                System.out.println("Escolha o item do menu (1 - lanches, 2 - bebidas, 0 - finalizar mesa): ");
                int escolha = scanner.nextInt();

                if (escolha == 0) {
                    break;
                }

                double precoItem = 0;

                switch (escolha) {
                    case 1:
                        System.out.println("1 - X-Tudo R$ 4,00");
                        System.out.println("2 - X-Bacon R$ 3,00");
                        System.out.println("3 - X-Salada R$ 2,00");
                        int escolhaLanche = scanner.nextInt();
                        switch (escolhaLanche) {
                            case 1:
                                precoItem = 4.00;
                                break;
                            case 2:
                                precoItem = 3.00;
                                break;
                            case 3:
                                precoItem = 2.00;
                                break;
                            default:
                                System.out.println("Opção inválida. Tente novamente.");
                                continue;
                        }
                        break;
                    case 2:
                        System.out.println("1 - Refrigerante R$ 1,50");
                        System.out.println("2 - Cerveja R$ 1,80");
                        System.out.println("3 - Água Mineral R$ 0,80");
                        int escolhaBebida = scanner.nextInt();
                        switch (escolhaBebida) {
                            case 1:
                                precoItem = 1.50;
                                break;
                            case 2:
                                precoItem = 1.80;
                                break;
                            case 3:
                                precoItem = 0.80;
                                break;
                            default:
                                System.out.println("Opção inválida. Tente novamente.");
                                continue;
                        }
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        continue;
                }

                System.out.println("Digite a quantidade: ");
                int quantidade = scanner.nextInt();

                totalMesa += precoItem * quantidade;
            }

            if (totalMesa > maiorConta) {
                maiorConta = totalMesa;
            }

            if (totalMesa < menorConta) {
                menorConta = totalMesa;
            }

            totalContas += totalMesa;
            numeroMesas++;
        }

        double mediaContas = totalContas / numeroMesas;

        
        System.out.println("Maior conta: R$ " + maiorConta);
        System.out.println("Menor conta: R$ " + menorConta);
        System.out.println("Média das contas: R$ " + mediaContas);

        scanner.close();
    }
}
