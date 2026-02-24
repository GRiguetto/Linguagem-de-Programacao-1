//5. Faça um algoritmo que leia um número inteiro e imprima seu dobro e sua metade.

import javax.swing.JOptionPane;

public class Ex5JOptionPane
{

    public static void main(String[] args)
    {

        int num1, dobro, metade;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));

        dobro = num1 * 2;
        metade = num1 / 2;
        // metade = (float) num1 / 2;

        JOptionPane.showMessageDialog(null,
                "Dobro: " + dobro
                + "\nMetade: " + metade);
    }
}