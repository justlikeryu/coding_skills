import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == -1)
                break;

            ArrayList<Integer> factors = new ArrayList<>();
            int sum = 0;

            for (int i = 1; i <= n / 2; i++) {
                if (n % i == 0) {
                    factors.add(i);
                    sum += i;
                }
            }

            if (n == sum) {
                System.out.print(n + " = ");
                for (int i = 0; i < factors.size(); i++) {
                    System.out.print(factors.get(i));
                    if (i != factors.size() - 1)
                        System.out.print(" + ");
                }
                System.out.println();
            } else {
                System.out.println(n + " is NOT perfect.");
            }
        }
    }
}