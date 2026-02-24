// 18. Você foi contratado por uma loja de eletrônicos para fazer um algoritmo que 
// calcule a conversão de dólares para real, sabe-se que o programa deverá ler 
// a cotação do Dólar do dia e o valor a ser convertido.

import javax.swing.JOptionPane;

public class Ex18JOptionPane
{

    public static void main(String[] args)
    {
        float dolarDiario;
        float dinheiroReal;
        float dinheiroDolar;

        dolarDiario = Float.parseFloat(JOptionPane.showInputDialog("Qual o valor do dólar hoje?"));
        dinheiroDolar = Float.parseFloat(JOptionPane.showInputDialog("Qual a quantidade em US$?"));

        dinheiroReal = dinheiroDolar * dolarDiario;

        JOptionPane.showMessageDialog(null, "US$" + dinheiroDolar + " correspondem a R$" + dinheiroReal);
    }
}