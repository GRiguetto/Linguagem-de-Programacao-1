// 23. O proprietário de um restaurante deseja informatizar o seu estabelecimento, 
// para tanto você foi contratado com o seguinte propósito. Elabore um algoritmo que 
// leia o número da mesa e qual a quantidade dos itens consumidos de um determinado cardápio, 
// para que se possa saber o valor total desta mesa (conta), o algoritmo deverá prever a entrada 
// do número de pessoas existentes na mesa para que seja feita a divisão da mesma, entre os seus ocupantes.

// Cardápio:
// Refrigerante	1.20
// Cerveja	1.50
// Almoço	6.30
// Porção		4.50
// Lanche		4.00

import javax.swing.JOptionPane;

public class Ex23JOptionPane
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

        numMesa = Integer.parseInt(JOptionPane.showInputDialog("Qual o número da mesa?"));
        itens[0] = Integer.parseInt(JOptionPane.showInputDialog("Quantos refrigerantes foram consumidos?"));
        itens[1] = Integer.parseInt(JOptionPane.showInputDialog("Quantas cervejas foram consumidos?"));
        itens[2] = Integer.parseInt(JOptionPane.showInputDialog("Quantos almoços foram consumidos?"));
        itens[3] = Integer.parseInt(JOptionPane.showInputDialog("Quantas porções foram consumidos?"));
        itens[4] = Integer.parseInt(JOptionPane.showInputDialog("Quantos lanches foram consumidos?"));
        numPessoas = Integer.parseInt(JOptionPane.showInputDialog("Quantas pessoas estão na mesa?"));

        precoTotal = (itens[0] * preco[0]) + (itens[1] * preco[1]) + (itens[2] * preco[2]) + (itens[3] * preco[3]) + (itens[4] * preco[4]);

        precoIndividual = precoTotal / numPessoas;

        JOptionPane.showMessageDialog(null, "O total de R$" + precoTotal + ", da mesa " + numMesa + ", dividido entre " + numPessoas + " pessoas, totaliza R$" + precoIndividual + " para cada.");

    }
}