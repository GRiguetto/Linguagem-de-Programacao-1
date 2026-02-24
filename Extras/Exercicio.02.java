    // 2. Faça um algoritmo para ler quatro notas e imprimir a média ponderada dessas notas. Considere que os pesos das são: 1, 2, 3 e 4, respectivamente.

import javax.swing.JOptionPane;

public class Ex2JOptionPane
{

    public static void main(String[] args)
    {
        float nota1, nota2, nota3, nota4, mediaPonderada;

        nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota:"));

        nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota:"));
        
        nota3 = Float.parseFloat(JOptionPane.showInputDialog("Digite a terceira nota:"));
        
        nota4 = Float.parseFloat(JOptionPane.showInputDialog("Digite a quarta nota:"));

        mediaPonderada = (1 * nota1 + 2 * nota2 + 3 * nota3 + 4 * nota4) / (1 + 2 + 3 + 4);
        
        JOptionPane.showMessageDialog(null, "Média ponderada: " + mediaPonderada);
    }
}