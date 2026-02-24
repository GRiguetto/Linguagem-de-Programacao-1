// 19. Você foi encarregado de desenvolver o modulo de calculo de passagens de uma empresa de ônibus. O funcionamento do algoritmo deve ser o seguinte:
// •	Peca o destino do passageiro.
// •	Peca a distancia em Quilometro do destino.
// •	Peca quantos pedágios tem no caminho.
// •	Calcule o acréscimo de R$ 2,00 de tarifa de embarque.
// •	Calcule acréscimo de R$ 0,45 por quilometro rodado
// •	Calcule acréscimo de R$ 9,00 por pedágio no caminho.
// •	Calcule um acréscimo de 80% sobre o resultado ate agora calculado. Este será o preço da passagem
// •	Informe o valor da passagem para o passageiro com a seguinte frase:
// Passageiro, a passagem custa: ......

import javax.swing.JOptionPane;

public class Ex19JOptionPane
{

    public static void main(String[] args)
    {
        String destino;
        float distancia;
        int pedagios;
        float precoBruto;
        float passagem;

        destino = JOptionPane.showInputDialog("Qual o seu destino?");
        distancia = Float.parseFloat(JOptionPane.showInputDialog("Qual a distância em km para o destino?"));
        pedagios = Integer.parseInt(JOptionPane.showInputDialog("Quantos pedágios encontram-se no caminho?"));

        precoBruto = 2 + (distancia * 0.45f) + (pedagios * 9);
        passagem = precoBruto * 1.8f;

        JOptionPane.showMessageDialog(null, "Passageiro, a passagem custa R$" + passagem);
    }
}