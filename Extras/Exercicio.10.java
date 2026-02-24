// 10. Faca um algoritmo que:
// •	Peca o valor a prazo do produto
// •	Peca a alíquota do desconto
// •	Calcule o preço a vista do produto

import javax.swing.JOptionPane;

public class Ex10JOptionPane
{

    public static void main(String[] args)
    {
        float valorPrazo;
        float aliquota;
        float precoVista;

        valorPrazo = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor a prazo do produto:"));

        aliquota = Float.parseFloat(JOptionPane.showInputDialog("Digite a alíquota do desconto (em %):"));

        precoVista = valorPrazo - ((aliquota / 100) * valorPrazo);

        JOptionPane.showMessageDialog(null, "O preço à vista, em R$ é de: " + precoVista);
    }
}
