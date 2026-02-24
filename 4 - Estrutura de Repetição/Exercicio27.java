public class Exercicio27 {
    public static void main(String[] args) {
        // Crie uma tabela de conversão de polegada para centímetros. A tabela deve conter valores de 1 a 100 polegadas. Cada polegada equivale a 2,54 cm

        final double POLEGADA_PARA_CM = 2.54;

        System.out.println("Polegadas\tCentímetros");

        for (int polegadas = 1; polegadas <= 100; polegadas++) {
            double centimetros = polegadas * POLEGADA_PARA_CM;

            System.out.printf("%d\t\t%.2f%n", polegadas, centimetros);
        }
    }
}