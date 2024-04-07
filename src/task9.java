/**
 * Calculates the binomial coefficient C(n, k) recursively.
 * @param n The total number of items.
 * @param k The number of items to choose.
 * @return The binomial coefficient C(n, k).
 * C(n, 0) = C(n, n) = 1
 * Use the formula C(n, k) = C(n - 1, k - 1) + C(n - 1, k)
 * Calculate the binomial coefficient C(n, k)
 * Output the result
 */

import java.util.Scanner;

public class BinomialCoefficient {
    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }

        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int result = binomialCoefficient(n, k);

        System.out.println(result);

        scanner.close();
    }
}

