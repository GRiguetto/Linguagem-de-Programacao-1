// 7 - Agora desenvolva o algoritmo para informatizar o cálculo de uma churrascaria, considerando os menus: 
// - Bebidas 
// - Sobremesas 
// No final do processamento (no final do cálculo de todas as contas das mesas) as seguintes informações devem ser impressas: 
// a. A maior e a menor conta 
// b. A média de gasto por mesa 
// c. A média de gasto por pessoa 
// d. A média de rodízios por mesa 

import java.util.Scanner;

public class CalculoContaChurrascaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double maiorConta = Double.MIN_VALUE;
        double menorConta = Double.MAX_VALUE;
        double totalContas = 0;
        int totalMesas = 0;
        int totalPessoas = 0;
        int totalRodizios = 0;

        while (true) {
            System.out.println("Digite o número da mesa (ou -1 para encerrar): ");
            int numeroMesa = scanner.nextInt();

            if (numeroMesa == -1) {
                break;
            }

            double totalMesa = 0;
            int totalPessoasMesa = 0;
            int totalRodiziosMesa = 0;

            while (true) {
                System.out.println("Escolha o item do menu:");
                System.out.println("1 - Bebidas");
                System.out.println("2 - Sobremesas");
                System.out.println("3 - Rodízio de Carnes");
                System.out.println("0 - Finalizar mesa");
                int escolhaMenu = scanner.nextInt();

                if (escolhaMenu == 0) {
                    break;
                }

                switch (escolhaMenu) {
                    case 1:
                        System.out.println("Bebidas: ");
                        System.out.println("1 - Refrigerante R$ 4,00");
                        System.out.println("2 - Água R$ 2,50");
                        int escolhaBebida = scanner.nextInt();
                        double precoBebida = 0;
                        switch (escolhaBebida) {
                            case 1:
                                precoBebida = 4.00;
                                break;
                            case 2:
                                precoBebida = 2.50;
                                break;
                            default:
                                System.out.println("Opção inválida. Tente novamente.");
                                continue;
                        }
                        System.out.println("Digite a quantidade: ");
                        int quantidadeBebida = scanner.nextInt();
                        totalMesa += precoBebida * quantidadeBebida;
                        break;
                    case 2:
                        System.out.println("Sobremesas: ");
                        System.out.println("1 - Sorvete R$ 5,00");
                        System.out.println("2 - Pudim R$ 6,00");
                        int escolhaSobremesa = scanner.nextInt();
                        double precoSobremesa = 0;
                        switch (escolhaSobremesa) {
                            case 1:
                                precoSobremesa = 5.00;
                                break;
                            case 2:
                                precoSobremesa = 6.00;
                                break;
                            default:
                                System.out.println("Opção inválida. Tente novamente.");
                                continue;
                        }
                        System.out.println("Digite a quantidade: ");
                        int quantidadeSobremesa = scanner.nextInt();
                        totalMesa += precoSobremesa * quantidadeSobremesa;
                        break;
                    case 3:
                        System.out.println("Rodízio de Carnes: ");
                        System.out.println("Valor por pessoa: R$ 35,00");
                        System.out.println("Digite o número de pessoas: ");
                        int numeroPessoas = scanner.nextInt();
                        totalMesa += 35.00 * numeroPessoas;
                        totalRodiziosMesa += numeroPessoas;
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        continue;
                }

                totalPessoasMesa++;
            }

            if (totalMesa > maiorConta) {
                maiorConta = totalMesa;
            }

            if (totalMesa < menorConta) {
                menorConta = totalMesa;
            }

            totalContas += totalMesa;
            totalMesas++;
            totalPessoas += totalPessoasMesa;
            totalRodizios += totalRodiziosMesa;
        }

        double mediaGastoPorMesa = totalContas / totalMesas;
        double mediaGastoPorPessoa = totalContas / totalPessoas;
        double mediaRodiziosPorMesa = (double) totalRodizios / totalMesas;

        System.out.println("a. Maior conta: R$ " + maiorConta);
        System.out.println("   Menor conta: R$ " + menorConta);
        System.out.println("b. Média de gasto por mesa: R$ " + mediaGastoPorMesa);
        System.out.println("c. Média de gasto por pessoa: R$ " + mediaGastoPorPessoa);
        System.out.println("d. Média de rodízios por mesa: " + mediaRodiziosPorMesa);

        scanner.close();
    }
}
