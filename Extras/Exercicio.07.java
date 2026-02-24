// 7. Desenvolva um programa para resolver as seguintes equações:
// • x*y
// • x2+y (para fazer x2, use: x*x ou x^2)
// • (4/r) * (w+r)

import javax.swing.JOptionPane;

public class Ex7JOptionPane
{

    public static void main(String[] args)
    {
        int x;
        int y;

        x = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de x:"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de y:"));

        JOptionPane.showMessageDialog(null, "x*y = " + (x * y)
                + "\nx²+y = " + ((x * x) + y)
                + "\n(4/x)*(x+y) = " + ((4 / (float) x) * (x + y)));
    }
}