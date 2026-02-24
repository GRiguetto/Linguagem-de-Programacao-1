// // 21 – Você foi encarregado de desenvolver o modulo de cálculo de passagens de uma empresa de ônibus. O funcionamento do algoritmo deve ser o seguinte: 
// - Peça o destino do passageiro; 
// - Peça a distância ao destino (em quilômetros); 
// - Peça o número de pedágios no caminho; 
// - Calcule o acréscimo de R$ 2,00 de tarifa de embarque; 
// - Calcule acréscimo de R$ 0,45 por quilometro rodado; 
// - Calcule acréscimo de R$ 9,00 por pedágio no caminho; 
// - Calcule um acréscimo de 80% sobre o resultado até agora calculado (este será 		o preço da passagem); 
// - Informe o valor da passagem para o passageiro com a seguinte frase: 
// “Passageiro, a passagem custa: ......”. 

import java.util.Scanner;

public class Ex19Scanner
{

    public static void main(String[] args)
    {
        String destino;
        float distancia;
        int pedagios;
        float precoBruto;
        float passagem;

        Scanner input = new Scanner(System.in);

        System.out.println("Qual o seu destino?");
        destino = input.nextLine();
        System.out.println("Qual a distância em km para o destino?");
        distancia = input.nextFloat();
        System.out.println("Quantos pedágios encontram-se no caminho?");
        pedagios = input.nextInt();

        precoBruto = 2 + (distancia * 0.45f) + (pedagios * 9);
        passagem = precoBruto * 1.8f;

        System.out.printf("\n\nPassageiro, a passagem custa: R$%.2f", passagem);
    }
}