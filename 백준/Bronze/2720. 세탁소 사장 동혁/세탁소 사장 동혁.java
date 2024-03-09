import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        int quarter = 0, dime = 0, nickel = 0, penny = 0;
        for (int i = 0; i < T; i++) {
            int C = Integer.parseInt(br.readLine());//거스름돈, 단위: 센트

            quarter = C / 25;
            dime = C % 25 / 10;
            nickel = C % 25 % 10 / 5;
            penny = C % 25 % 10 % 5 / 1;
            System.out.println(quarter + " " + dime + " " + nickel + " " + penny);
        }
        
        br.close();
    }
}