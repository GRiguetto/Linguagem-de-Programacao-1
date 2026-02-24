// 12. Desenvolva um algoritmo para calcular o montante resultante de um capital aplicado a juros compostos.
// Você deve pedir o capital (C), a taxa de juros (I) e o tempo (N). Com essas variáveis, você deve calcular o montante (M) pela fórmula:
// M < - C * (1+(I/100)) ^N

import javax.swing.JOptionPane;

public class Ex12JOptionPane
{

    public static void main(String[] args)
    {
        float capital;
        float taxaJuros;
        float tempo;
        float montante;

        capital = Float.parseFloat(JOptionPane.showInputDialog("Digite o capital:"));

        taxaJuros = Float.parseFloat(JOptionPane.showInputDialog("Digite a taxa de juros (em %):"));

        tempo = Float.parseFloat(JOptionPane.showInputDialog("Digite o tempo:"));

        montante = capital * (float) Math.pow((1 + (taxaJuros / 100)), tempo);

        JOptionPane.showMessageDialog(null, "O montante final é, em R$, de: " + montante);
    }
}
