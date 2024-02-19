import java.util.Scanner;

public class Main{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        scanner.close();
        
        String blank = "";
        
        for(int i = 0; i < N/4; i++){
            blank += "long ";
        }
        System.out.print(blank + "int");
    }
}