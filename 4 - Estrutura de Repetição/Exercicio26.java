public class Exercicio26 {
    public static void main(String[] args) {
        // Elabore um algoritmo para gerar uma tabela de conversão entre milhas e Km,
        // iniciando em 0 Km e finalizado em 1000 Km, e variando de 100 Km em 100 Km,
        // sabendo-se que: 1 Milha = 1852 m
        final double MILHA_PARA_METRO = 1852;

        final int INICIO_KM = 0;
        final int FINAL_KM = 1000;
        final int VARIACAO_KM = 100;

        System.out.println("Kilômetros\tMilhas");

        for (int km = INICIO_KM; km <= FINAL_KM; km += VARIACAO_KM) {
            double milhas = km / MILHA_PARA_METRO;

            System.out.printf("%d\t\t%.2f%n", km, milhas);
        }
    }
}