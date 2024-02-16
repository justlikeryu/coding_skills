import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int hour = scanner.nextInt();
        int min = scanner.nextInt();
        
        scanner.close();
        
        if(min < 45){
            if(hour == 0){
                hour = 23;
            } else {
                hour--;
            }
            System.out.print(hour + " " + (60 - (45 - min)));
        } else {
            System.out.print(hour + " " + (min - 45));
        }
    }
}