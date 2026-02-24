// 22. Faça um programa que leia os valores A,B, C, D, E, F e encontre o valor de X.

import javax.swing.JOptionPane;

public class Ex22JOptionPane
{

    public static void main(String[] args)
    {
        float a, b, c, d, e, f, x;

        a = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor de a:"));
        b = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor de a:"));
        c = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor de a:"));
        d = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor de a:"));
        e = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor de a:"));
        f = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor de a:"));

        x = ((a + (b / c)) / (d - (2 * (e / f)))) + (4 * a);

        JOptionPane.showMessageDialog(null, "O valor de x é " + x);
    }
}