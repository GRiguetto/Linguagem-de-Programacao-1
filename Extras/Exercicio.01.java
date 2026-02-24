// 1. Faça um algoritmo para ler um número, somá-lo com o valor 10 e mostrar a média entre o número lido e o valor 10.

import javax.swing.JOptionPane;

public class Ex1JOptionPane
{

    public static void main(String[] args)
    {
        float numero, media;

        numero = Float.parseFloat(JOptionPane.showInputDialog("Escreva um número inteiro:"));

        numero += 10;

        media = (numero + 10) / 2;

        JOptionPane.showMessageDialog(null, "O valor final é " + media);
    }
}