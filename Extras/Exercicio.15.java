// 15. A importância de R$ 780.000,00 será dividida entre os três primeiros colocados de um concurso, 
// em partes diretamente proporcional aos pontos conseguidos por eles. Construa um programa que leia
// o numero de pontos dos três primeiros colocados e imprima a importância que caberá a cada um deles.

import javax.swing.JOptionPane;

public class Ex15JOptionPane
{

    public static void main(String[] args)
    {
        float ponto1;
        float ponto2;
        float ponto3;
        float pontosTotais;
        float dinheiroTotal = 780000;
        float total1;
        float total2;
        float total3;

        ponto1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a pontuação do primeiro colocado:"));
        ponto2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a pontuação do segundo colocado:"));
        ponto3 = Float.parseFloat(JOptionPane.showInputDialog("Digite a pontuação do terceiro colocado:"));

        pontosTotais = ponto1 + ponto2 + ponto3;
        total1 = (ponto1 / pontosTotais) * dinheiroTotal;
        total2 = (ponto2 / pontosTotais) * dinheiroTotal;
        total3 = (ponto3 / pontosTotais) * dinheiroTotal;

        JOptionPane.showMessageDialog(null, "1º lugar: R$" + total1 + "\n2º lugar: R$" + total2 + "\n3º lugar: R$" + total3);
    }
}