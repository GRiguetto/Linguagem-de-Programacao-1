import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Desenvolva um programa para resolver as seguintes equações
        // 1) x*y
        // 2) x2+y
        // 3)(4/r) * (w+r)

        System.out.print("Digite o valor de x: ");
        int x = scanner.nextInt();

        System.out.print("Digite o valor de y: ");
        int y = scanner.nextInt();

        System.out.print("Digite o valor de r: ");
        int r = scanner.nextInt();

        System.out.print("Digite o valor de w: ");
        int w = scanner.nextInt();

        int conta1 = x * y;
        int conta2 = x * x + y;
        int conta3 = (4 / r) * (w + r);

        System.out.println("Resultado da 1° equação - x * y = " + conta1);
        System.out.println("Resultado da 2° equação - x^2 + y = " + conta2);
        System.out.println("Resultado da 3° equação - (4/r) * (w + r) = " + conta3);
    }
}