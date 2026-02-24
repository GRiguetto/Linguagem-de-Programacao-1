// 16. Você foi encarregado de desenvolver o modulo de cálculo da folha de pagamento de uma empresa. O funcionamento do programa deve ser o seguinte:
// •	Peca o nome do empregado.
// •	Peca o salário bruto
// •	Peca o valor do Imposto de Renda em reais que será descontado
// •	Peca o valor da previdencia (INSS) em reais que será descontado.
// •	Calcule o valor do salário liquido do empregado
// •	Informe o salário liquido com a seguinte frase:
//       Fulano, seu salário liquido é: ......

import javax.swing.JOptionPane;

public class Ex16JOptionPane
{

    public static void main(String[] args)
    {
        String nome;
        float salarioBruto;
        float ir;
        float inss;
        float salarioLiquido;

        nome = JOptionPane.showInputDialog("Digite o nome do empregado:");
        salarioBruto = Float.parseFloat(JOptionPane.showInputDialog("Digite seu salário bruto:"));
        ir = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do Imposto de Renda:"));
        inss = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do INSS:"));

        salarioLiquido = salarioBruto - ir - inss;

        JOptionPane.showMessageDialog(null, nome + ", seu salário líquido é de R$" + salarioLiquido);
    }
}