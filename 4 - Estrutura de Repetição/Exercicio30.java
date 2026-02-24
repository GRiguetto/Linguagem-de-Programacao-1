
public class Exercicio30 {
    public static void main(String[] args) {
        // Crie um algoritmo para imprimir todas as tabuadas do 1 até o 10
        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabuada do " + i + ":");

            for (int j = 1; j <= 10; j++) {
                int resultado = i * j;
                System.out.println(i + " x " + j + " = " + resultado);
            }

            System.out.println();
        }
    }
}