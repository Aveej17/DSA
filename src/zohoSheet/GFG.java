package zohoSheet;
import java.util.Arrays;

public class GFG {
    public static void sieve_of_eratosthenes(int n)
    {
        boolean[] is_prime = new boolean[n + 1];
        Arrays.fill(is_prime, true);
        is_prime[0] = is_prime[1] = false;
        for (int p = 2; p * p <= n; p++) {
            if (is_prime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    is_prime[i] = false;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (is_prime[i]) {
                System.out.print(i + " ");
            }
        }
    }
 
    public static void main(String[] args)
    {
        sieve_of_eratosthenes(100);
    }
}