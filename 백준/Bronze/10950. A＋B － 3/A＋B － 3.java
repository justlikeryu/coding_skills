import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int line = scanner.nextInt();

        for(int i = 1; i <= line; i++){
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            System.out.println(A + B);
        }

        scanner.close();
    }
}