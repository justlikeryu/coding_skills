import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        
        scanner.close();
        
        if(x > 0 && y > 0){
            System.out.print(1);
        }else if(x > 0 && y < 0){
            System.out.print(4);
        }else if(x < 0 && y > 0){
            System.out.print(2);
        }else if(x < 0 && y < 0){
            System.out.print(3);
        }
    }
}