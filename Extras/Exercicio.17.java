// 17. Você foi contratado por uma empresa de construção para fazer um programa que calcule o 
// salário liquido dos operários no fim de cada mês, sabe-se que cada operário recebe R$ 3,00 
// por cada hora trabalhada, e que se desconta 8% do salário bruto para INSS. 

import javax.swing.JOptionPane;

public class Ex17JOptionPane
{

    public static void main(String[] args)
    {
        int horasTrabalhadas;
        float salarioBruto;
        float salarioFinal;

        horasTrabalhadas = Integer.parseInt(JOptionPane.showInputDialog("Quantas horas o funcionário trabalhou no mês?"));

        salarioBruto = horasTrabalhadas * 3;
        salarioFinal = salarioBruto * 0.92f;

        JOptionPane.showMessageDialog(null, "O salário final é de R$" + salarioFinal);
    }
}