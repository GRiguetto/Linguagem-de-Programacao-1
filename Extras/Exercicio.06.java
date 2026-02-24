//6. Faça um programa para calcular o cubo de um número informado pelo usuário. Em seguida, faça a diferença desse resultado com o número lido.

import javax.swing.JOptionPane;

public class Ex6JOptionPane
{

    public static void main(String[] args)
    {
        int num;
        int cuboNum;
        int diferenca;

        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));

        cuboNum = num * num * num;

        diferenca = cuboNum - num;

        JOptionPane.showMessageDialog(null, "Número lido: " + num
                + "\nCubo do número: " + cuboNum
                + "\nDiferença: " + diferenca);
    }
}