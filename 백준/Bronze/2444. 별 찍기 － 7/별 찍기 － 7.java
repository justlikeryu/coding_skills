import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = num - 1; j > i; j--) {
                System.out.print(" ");
            }

            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = 0; i < num - 1; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }

            for (int k = 2 * num - 3; k > 2 * i; k--) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}