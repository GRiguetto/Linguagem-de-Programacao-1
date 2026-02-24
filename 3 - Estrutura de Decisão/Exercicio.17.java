//Desenvolva um algoritmo para calcular quantos reais serão necessários para encher o tanque de um veículo para se realizar uma viagem. O usuário deverá informar o tipo de combustível do veículo, o número total de km a ser percorrido e o consumo médio do veículo. A tabela de preços dos combustíveis utilizada no cálculo é apresentada abaixo

// Combustível 	Preço 
// Gasolina 	R$ 22,25 
// Álcool 	R$ 11,50 
// Diesel 	R$ 11,65
import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o tipo de combustível (gasolina, álcool ou diesel): ");
        String tipoCombustivel = scanner.nextLine().toLowerCase();

        System.out.print("Informe o número total de km a ser percorrido: ");
        double kmPercorridos = scanner.nextDouble();

        System.out.print("Informe o consumo médio do veículo em km por litro: ");
        double consumoMedio = scanner.nextDouble();

        System.out.println(calcularCustoCombustivel(tipoCombustivel, kmPercorridos, consumoMedio));

        scanner.close();
    }

    private static String calcularCustoCombustivel(String tipoCombustivel, double kmPercorridos, double consumoMedio) {
        final double PRECO_GASOLINA = 22.25;
        final double PRECO_ALCOOL = 11.50;
        final double PRECO_DIESEL = 11.65;

        double precoPorLitro = 0.0;

        switch (tipoCombustivel) {
            case "gasolina":
                precoPorLitro = PRECO_GASOLINA;
                break;
            case "álcool":
                precoPorLitro = PRECO_ALCOOL;
                break;
            case "diesel":
                precoPorLitro = PRECO_DIESEL;
                break;
            default:
                return "Tipo de combustível inválido. Por favor, escolha entre gasolina, álcool ou diesel.";
        }

        double litrosNecessarios = kmPercorridos / consumoMedio;
        double custoTotal = litrosNecessarios * precoPorLitro;

        return String.format("Para percorrer %.2f km, o custo de combustível será de R$ %.2f.", kmPercorridos, custoTotal);
    }
}