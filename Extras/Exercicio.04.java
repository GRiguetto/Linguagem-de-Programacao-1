// 4. Faça um algoritmo para ler dois números e realizar as operações aritméticas: adição, subtração e multiplicação. Para cada operação o resultado deve ser impresso no vídeo.

import javax.swing.JOptionPane;

public class Ex4JOptionPane
{

    public static void main(String[] args)
    {

        float num1, num2, numsAdicao, numsSubtracao, numsMultiplicacao;

        num1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro número:"));

        num2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo número:"));

        numsAdicao = num1 + num2;
        numsSubtracao = num1 - num2;
        numsMultiplicacao = num1 * num2;

        JOptionPane.showMessageDialog(null,
                "Adição: " + numsAdicao
                + "\nSubtração: " + numsSubtracao
                + "\nMultiplicação: " + numsMultiplicacao);
    }
}