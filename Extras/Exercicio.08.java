// 8. Desenvolva um algoritmo que:
// •	Peca o ano de nascimento.
// •	Calcule a idade em dias.
// •	Mostre a idade calculada.

import javax.swing.JOptionPane;

public class Ex8JOptionPane
{

    public static void main(String[] args)
    {
        int anoNasc;
        int idadeDias;
        int idade;

        anoNasc = Integer.parseInt(JOptionPane.showInputDialog("Qual o ano de nascimento?"));

        idade = 2023 - anoNasc;
        idadeDias = idade * 365;

        JOptionPane.showMessageDialog(null, "Idade: " + idade
                + "\nIdade em dias: " + idadeDias);
    }
}