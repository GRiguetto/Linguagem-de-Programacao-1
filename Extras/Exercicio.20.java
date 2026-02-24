// 20. Durante uma viagem a Inglaterra você foi obrigado a comprar um termômetro, 
// e verificou que este estava marcando a temperatura em Fahrenheit. 
// Faça um algoritmo para calcular a conversão de graus Celcius para Fahrenheit.

import javax.swing.JOptionPane;

public class Ex20JOptionPane
{

    public static void main(String[] args)
    {
        float celsius;
        float fahrenheit;

        celsius = Float.parseFloat(JOptionPane.showInputDialog("Insira a temperatura em ºC:"));

        fahrenheit = (celsius * 1.8f) + 32;

        JOptionPane.showMessageDialog(null, celsius + "ºC equivalem a " + fahrenheit + "ºF");
    }
}