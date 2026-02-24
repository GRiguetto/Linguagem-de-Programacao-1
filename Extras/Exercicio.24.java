// 24. A Empresa ABC produz 3 tipos de peças mecânicas: parafusos, porcas e arruelas. Sabe-se que é 
// dado desconto de: 10% por porca vendida, 20% por Arruelas vendidas, 30% por parafusos vendidos.
// Dados de Entrada: nome do cliente; preço unitário da porca, arruela, parafuso; quantidade de porcas, 
// arruelas e parafusos solicitados pelo cliente. Dados de Saída: nome do cliente; número de porcas, 
// arruelas e parafusos comprados; total pago pelas porcas, arruelas e parafusos; total de desconto 
// dado ao cliente; total a ser pago pelo cliente.

import javax.swing.JOptionPane;

public class Ex24JOptionPane
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

        nome = JOptionPane.showInputDialog("Qual o nome do cliente?");
        unitPorca = Float.parseFloat(JOptionPane.showInputDialog("Qual o preço da porca?"));
        unitArruela = Float.parseFloat(JOptionPane.showInputDialog("Qual o preço da arruela?"));
        unitParafuso = Float.parseFloat(JOptionPane.showInputDialog("Qual o preço da parafuso?"));
        qtdPorca = Integer.parseInt(JOptionPane.showInputDialog("Quantas porcas foram compradas?"));
        qtdArruela = Integer.parseInt(JOptionPane.showInputDialog("Quantas arruelas foram compradas?"));
        qtdParafuso = Integer.parseInt(JOptionPane.showInputDialog("Quantos parafusos foram compradas?"));

        precoPorca = qtdPorca * unitPorca;
        precoArruela = qtdArruela * unitArruela;
        precoParafuso = qtdParafuso * unitParafuso;

        precoTotal = precoPorca + precoArruela + precoParafuso;

        desconto = precoTotal - ((precoPorca * 0.9f) + (precoArruela * 0.8f) + (precoParafuso * 0.7f));

        JOptionPane.showMessageDialog(null, "O cliente " + nome + " comprou " + qtdPorca + " porcas por R$" + precoPorca + ", " + qtdArruela + " arruelas por R$" + precoArruela + " e " + qtdParafuso + " parafusos por R$" + precoParafuso + ", com desconto de R$" + desconto + ", totalizando R$" + precoTotal + ".");
    }
}