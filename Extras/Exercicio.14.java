// 14. Faça o cálculo da área de um retângulo. 

import javax.swing.JOptionPane;

public class Ex14JOptionPane
{

    public static void main(String[] args)
    {
        float base;
        float altura;
        float area;

        base = Float.parseFloat(JOptionPane.showInputDialog("Digite a base do retângulo:"));

        altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura do retângulo:"));

        area = base * altura;

        JOptionPane.showMessageDialog(null, "A área do retângulo é de " + area);

    }
}