public class CalculoVariaveis {

    public static void main(String[] args) {
        // Bloco 1
        int X = 10;
        int Y = 15;
        int Z = 32;
        int A;
        int K;

        X = X + Y;
        Y = Z - X;
        A = 25;
        Z = A + 14 % 3;
        K = 0;
        K = K + 1;
        K = K + 1;
        K = K + 1;
        K = K + A;

        // Bloco 2
        double X2 = 12.0;
        X2 = X2 + 2.0 * 3.0;
        double Y2 = 5.0;
        double Z2 = 6.3;
        double A2 = 12.98;
        A2 = A2 + Y2;
        Z2 = X2 * 2 - (Z2 + Y2);
        double K2 = 2.6 + A2;
        K2 = K2 * K2;
        Z2 = Z2 + 2.5 * A2;
        X2 = X2 / 2.0 * 3.5 + ((A2 * 3.0) - Y2 * 2);
        double Y3 = X2 + Y2 + Z2 + A2;
    }
}