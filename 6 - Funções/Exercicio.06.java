//6 - Crie uma tabela de conversão de polegada para centímetros. A tabela deve 
// conter valores de 1 a 100 polegadas. Crie uma função para calcular o valor
// sabendo-se que cada polegada equivale a 2,54 cm. 

public class TabelaConversao {

    public static void main(String[] args) {
        System.out.println("Tabela de Conversão de Polegadas para Centímetros:");

        System.out.printf("%-10s %-15s\n", "Polegadas", "Centímetros");

        for (int i = 1; i <= 100; i++) {
            double centimetros = converterPolegadasParaCentimetros(i);
            System.out.printf("%-10d %-15.2f\n", i, centimetros);
        }
    }

    // Função para converter polegadas para centímetros
    public static double converterPolegadasParaCentimetros(int polegadas) {
        final double POLEGADAS_PARA_CM = 2.54;
        return polegadas * POLEGADAS_PARA_CM;
    }
}