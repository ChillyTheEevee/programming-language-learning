import java.util.Map;
import java.util.HashMap;

public class FibonacciSequence {

    private static Map<Long, Long> cachedSolutions = new HashMap<>();

    public static void main(String[] args) {
        if (args.length == 0) {
            System.exit(0);
        }

        StringBuilder solutions = new StringBuilder();
        solutions.append(fib(Long.parseLong(args[0])));
        for (int i = 1; i < args.length; i++) {
            solutions.append(" ").append(fib(Long.parseLong(args[i])));
        }
        System.out.println(solutions);
    }

    public static long fib(long n) {
        if (n < 0) throw new IllegalArgumentException("n cannot be negative.");
        if (n == 0) return 0;
        if (n == 1) return 1;

        if (cachedSolutions.containsKey(n)) {
            return cachedSolutions.get(n);
        }

        long solution = fib(n-2) + fib(n-1);
        cachedSolutions.put(n, solution);
        return solution;
    }

}