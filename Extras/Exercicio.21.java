// 21. Um sistema de equações lineares do tipo:
// ax+by=c
// dx+ey=f
// pode ser resolvido segundo mostrado abaixo:
// Faça um programa que leia os coeficientes a,b,c,d,e,f e calcule e escreva os valores de x e y.

import javax.swing.JOptionPane;

public class Ex21JOptionPane
{

    public static void main(String[] args)
    {
        int a, b, c, d, e, f, x, y;

        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o coeficiente a:"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o coeficiente b:"));
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite o coeficiente c:"));
        d = Integer.parseInt(JOptionPane.showInputDialog("Digite o coeficiente d:"));
        e = Integer.parseInt(JOptionPane.showInputDialog("Digite o coeficiente e:"));
        f = Integer.parseInt(JOptionPane.showInputDialog("Digite o coeficiente f:"));

        y = ((a * f) - (c * d)) / ((a * e) - (b * d));
        x = ((c * e) - (b * f)) / ((a * e) - (b * d));

        JOptionPane.showMessageDialog(null, "x = " + x + "\ny = " + y);
    }
}