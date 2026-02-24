    // Dado três números digitados pelo usuário, e todos diferentes, imprima o maior número, o menor e o central. (Utilizando While)

    import java.util.Scanner;

public class ExercicioExtra {
    public static boolean ehDiferenteDosOutros(double numero, double outro1, double outro2) {
        return numero != outro1 && numero != outro2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1, num2, num3;

        System.out.print("Digite o primeiro número: ");
        num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número (diferente do primeiro): ");
        num2 = scanner.nextDouble();
        while (!ehDiferenteDosOutros(num2, num1, num1)) {
            System.out.print("Digite o segundo número (diferente do primeiro): ");
            num2 = scanner.nextDouble();
        }

        System.out.print("Digite o terceiro número (diferente dos dois anteriores): ");
        num3 = scanner.nextDouble();
        while (!ehDiferenteDosOutros(num3, num1, num2) || !ehDiferenteDosOutros(num3, num2, num1)) {
            System.out.print("Digite o terceiro número (diferente dos dois anteriores): ");
            num3 = scanner.nextDouble();
        }

        double maior = Math.max(num1, Math.max(num2, num3));
        double menor = Math.min(num1, Math.min(num2, num3));
        double central = num1 + num2 + num3 - maior - menor;

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
        System.out.println("Número central: " + central);

        scanner.close();
    }
}
