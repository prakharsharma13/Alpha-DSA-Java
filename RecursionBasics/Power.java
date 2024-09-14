package RecursionBasics;

public class Power {
    public static int optimizedPower(int a, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPowerSq = optimizedPower(a, n / 2) * optimizedPower(a, n / 2);

        if (n % 2 != 0) {
            halfPowerSq = a * halfPowerSq;
        }

        return halfPowerSq;
    }

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * power(x, n - 1);
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        int a = 2;
        System.out.println(power(x, n));
        System.out.println(optimizedPower(a, n));
    }
}
