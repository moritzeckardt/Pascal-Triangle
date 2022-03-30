import java.util.Arrays;

public class Binomial implements BinomialInterface {
    // Constants
    private static final int UNKNOWN = -1;
    private static final int MAX_N = 60;

    // Properties
    private final long[][] pascalTriangle;

    // Constructors
    public Binomial() {
        // Init and fill array
        pascalTriangle = new long[MAX_N + 1][MAX_N + 1];
        for (long[] entry : pascalTriangle) {
            Arrays.fill(entry, UNKNOWN);
        }
    }

    // Methods
    @Override
    public long binomial(int k, int n) {
        // Calculate binomial step-by-step
        double result = 1;
        for (int i = 0; i < k; i++) {
            result *= (double) (n - i) / (k - i);
        }

        // Round and return result
        return Math.round(result);
    }

    @Override
    public long binomialRec(int k, int n) {
        // First base case
        if (k < 0 || k > n) {
            return 0;
        }

        // Second base case
        if (k == 0 || k == n) {
            return 1;
        }

        // Calculate recursive
        return binomialRec(k, n - 1) + binomialRec(k - 1, n - 1);
    }

    @Override
    public long binomialRecPascal(int k, int n) {
        // First base case
        if (k < 0 || k > n) {
            return 0;
        }

        // Second base case
        if (k == 0 || k == n) {
            return 1;
        }

        // Use pascal triangle -> Save results in array
        if (n <= MAX_N) {
            if (pascalTriangle[k][n] == UNKNOWN) {
                pascalTriangle[k][n] = binomialRecPascal(k, n - 1) + binomialRecPascal(k - 1, n - 1);
            }

            return pascalTriangle[k][n];
        }

        // Calculate recursive
        return binomialRecPascal(k, n - 1) + binomialRecPascal(k - 1, n - 1);
    }

    // Main
    public static void main(String[] args) {

    }
}
