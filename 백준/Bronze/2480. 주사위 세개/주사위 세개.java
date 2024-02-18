import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();

        scanner.close();

        if (first == second && second == third) {
            System.out.print(10000 + first * 1000);
        } else if (first != second && second != third && third != first) {
            int max = 0;
            if (first > second && first > third) {
                max = first;
            } else if (second > first && second > third) {
                max = second;
            } else if (third > first && third > second) {
                max = third;
            }
            System.out.print(max * 100);
        } else if (first == second || second == third || third == first) {
            if (first == second) {
                System.out.print(1000 + first * 100);
            } else if (second == third) {
                System.out.print(1000 + second * 100);
            } else if (third == first) {
                System.out.print(1000 + third * 100);
            }
        }
    }
}