// 11. Desenvolva um programa para cálculo de salário liquido de um funcionário O programa deve:
// •	Pedir o salário bruto do funcionário
// •	Calcular o valor do IR com alíquota de 10%
// •	Calcular o valor do INSS com alíquota de 5%
// •	Calcular o salário liquido do funcionário

import javax.swing.JOptionPane;

public class Ex11JOptionPane
{

    public static void main(String[] args)
    {
        float salarioBruto;
        float valorIR;
        float valorINSS;
        float salarioLiquido;

        salarioBruto = Float.parseFloat(JOptionPane.showInputDialog("Digite o salário bruto:"));

        valorIR = salarioBruto * 0.1f;

        valorINSS = salarioBruto * 0.05f;

        salarioLiquido = salarioBruto - valorIR - valorINSS;

        JOptionPane.showMessageDialog(null, "O salário líquido, em R$, é de: " + salarioLiquido);
    }
}
