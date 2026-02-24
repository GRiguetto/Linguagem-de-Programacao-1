// 9. Desenvolva um algoritmo que:
// •	Peca o valor do produto
// •	Peca a valor da aliquota
// •	Calcule o valor em reais da porcentagem informada.

import javax.swing.JOptionPane;

public class Ex9JOptionPane
{

    public static void main(String[] args)
    {
        float valorProduto;
        float aliquota;
        float porcentagem;

        valorProduto = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do produto: "));

        aliquota = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da alíquota (em %): "));

        porcentagem = valorProduto * (aliquota / 100);

        JOptionPane.showMessageDialog(null, "O valor em reais da porcentagem informada é: " + porcentagem);
    }
}
