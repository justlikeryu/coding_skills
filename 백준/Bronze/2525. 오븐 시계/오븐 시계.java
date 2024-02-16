import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int hour = scanner.nextInt();
        int min = scanner.nextInt();
        int time = scanner.nextInt();
        
        scanner.close();
        
        if(min + time >= 60){
            hour += (min + time) / 60;
            if(hour >= 24){
                hour -= 24;
            }
            System.out.print(hour + " " + ((min + time) % 60));
        }else{
            System.out.print(hour + " " + (min + time));
        }
    }
}