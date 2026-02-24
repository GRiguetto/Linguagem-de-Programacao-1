//26 - O proprietário de um restaurante deseja informatizar o seu estabelecimento, e para isso você foi contratado com o seguinte propósito:
// elabore um algoritmo que leia o número da mesa e qual a quantidade dos itens consumidos de um determinado cardápio
// para que se possa saber o valor total desta mesa (conta). O algoritmo deverá receber a entrada do número de pessoas
// // existentes na mesa para que seja feita a divisão da conta entre os seus ocupantes. 
// Cardápio: 
// - Refrigerante R$1,20 
// - Cerveja R$1,50 
// - Almoço R$6,30 
// - Porção R$4,50 
// - Lanche R$4,00 

import java.util.Scanner;

public class Ex23Scanner
{

    public static void main(String[] args)
    {
        int numMesa;
        int[] itens = new int[5];
        float[] preco =
        {
            1.20f, 1.50f, 6.30f, 4.50f, 4.00f
        };
        float precoTotal;
        float precoIndividual;
        int numPessoas;

        Scanner input = new Scanner(System.in);

        System.out.println("Qual o número da mesa?");
        numMesa = input.nextInt();
        System.out.println("Quantos refrigerantes foram consumidos?");
        itens[0] = input.nextInt();
        System.out.println("Quantas cervejas foram consumidos?");
        itens[1] = input.nextInt();
        System.out.println("Quantos almoços foram consumidos?");
        itens[2] = input.nextInt();
        System.out.println("Quantas porções foram consumidos?");
        itens[3] = input.nextInt();
        System.out.println("Quantos lanches foram consumidos?");
        itens[4] = input.nextInt();
        System.out.println("Quantas pessoas estão na mesa?");
        numPessoas = input.nextInt();

        precoTotal = (itens[0] * preco[0]) + (itens[1] * preco[1]) + (itens[2] * preco[2]) + (itens[3] * preco[3]) + (itens[4] * preco[4]);

        precoIndividual = precoTotal / numPessoas;

        System.out.printf("O total de R$%.2f, da mesa %d, dividido entre %d pessoas, totaliza R$%.2f para cada.", precoTotal, numMesa, numPessoas, precoIndividual);

    }
}