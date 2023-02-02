package deneme;

public class DersTekrar01 {

    public static void main(String[] args) {

        System.out.println(dikdörtgenincevres(5, 7));
        System.out.println(daireninAlanı(3.14, 6));
        System.out.println(dikdörtgeninAlanı(5, 7));
        System.out.println(dairenınCevresi(3.14, 6));

    }

    public static double daireninAlanı(double a, double b) {
        return Math.PI * (b * b);

    }

    public static int dikdörtgeninAlanı(int a, int b) {
        return a * b;
    }

    public static int dikdörtgenincevres(int a, int b) {
        return 2 * (a + b);
    }

    public static double dairenınCevresi(Double a, double b) {
        return 2 * Math.PI * b;
    }
}