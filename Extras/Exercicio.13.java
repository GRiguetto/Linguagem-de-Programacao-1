// 13. Escreva um algoritmo que solicite ao usuário a altura e o raio de um cilindro circular, 
// e imprima o volume do cilindro. O volume do cilindro circular é calculado pela seguinte formula:  
// volume = 3.141592 * raio * raio * altura.

import javax.swing.JOptionPane;

public class Ex13JOptionPane
{

    public static void main(String[] args)
    {
        float altura;
        float raio;
        float volume;
        final float PI = 3.141592f;

        altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura do cilindro:"));

        raio = Float.parseFloat(JOptionPane.showInputDialog("Digite o raio do cilindro:"));

        volume = PI * raio * raio * altura;

        JOptionPane.showMessageDialog(null, "O volume do cilindro é de: " + volume);

    }
}
