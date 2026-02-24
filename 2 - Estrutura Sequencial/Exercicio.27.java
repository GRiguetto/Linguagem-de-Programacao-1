// 27 - A Empresa ABC produz 3 tipos de peças mecânicas: parafusos, porcas e arruelas. 
// Sabe-se que é dado desconto de 10% sobre as porcas vendidas, de 20% sobre as arruelas
// // vendidas e de 30% sobre os parafusos vendidos. (L1 – ex.24) 
// O algoritmo deve receber os seguintes dados: 
// - nome do cliente; 
// - preço unitário da porca, arruela e parafuso; 
// - quantidade de porcas, arruelas e parafusos solicitados pelo cliente. 
// Por fim, deve-se imprimir os seguintes dados: 
// - nome do cliente; 
// - número de porcas, arruelas e parafusos comprados; 
// - total pago pelas porcas, arruelas e parafusos; 
// - total de desconto dado ao cliente; 
// - total a ser pago pelo cliente. 

import java.util.Scanner;

public class Ex24Scanner
{

    public static void main(String[] args)
    {
        String nome;
        float unitPorca;
        float unitArruela;
        float unitParafuso;
        int qtdPorca;
        int qtdArruela;
        int qtdParafuso;
        float precoPorca;
        float precoArruela;
        float precoParafuso;
        float desconto;
        float precoTotal;

        Scanner input = new Scanner(System.in);

        System.out.println("Qual o nome do cliente?");
        nome = input.nextLine();
        System.out.println("Qual o preço da porca?");
        unitPorca = input.nextFloat();
        System.out.println("Qual o preço da arruela?");
        unitArruela = input.nextFloat();
        System.out.println("Qual o preço da parafuso?");
        unitParafuso = input.nextFloat();
        System.out.println("Quantas porcas foram compradas?");
        qtdPorca = input.nextInt();
        System.out.println("Quantas arruelas foram compradas?");
        qtdArruela = input.nextInt();
        System.out.println("Quantos parafusos foram compradas?");
        qtdParafuso = input.nextInt();

        precoPorca = qtdPorca * unitPorca;
        precoArruela = qtdArruela * unitArruela;
        precoParafuso = qtdParafuso * unitParafuso;

        precoTotal = precoPorca + precoArruela + precoParafuso;

        desconto = precoTotal - ((precoPorca * 0.9f) + (precoArruela * 0.8f) + (precoParafuso * 0.7f));

        System.out.printf("O cliente %s comprou %d porcas por R$%.2f, %d arruelas por R$%.2f e %d parafusos por R$%.2f, com desconto de R$%.2f, totalizando R$%.2f.",
                nome, qtdPorca, precoPorca, qtdArruela, precoArruela, qtdParafuso, precoParafuso, desconto, precoTotal);
    }
}