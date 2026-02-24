// 3. Faça um algoritmo para ler dois números e fazer a troca dos valores digitados pelo usuário. Após a troca, imprima os novos valores obtidos.

import javax.swing.JOptionPane;

public class Ex3JOptionPane
{

    public static void main(String[] args)
    {

        int valor1, valor2, valorTemporario;

        valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor 1:"));

        valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor 2:"));

        valorTemporario = valor1;
        valor1 = valor2;
        valor2 = valorTemporario;

        JOptionPane.showMessageDialog(null,
                "Após a troca:"
                + "\nValor 1: " + valor1
                + "\nValor 2: " + valor2);
    }
}