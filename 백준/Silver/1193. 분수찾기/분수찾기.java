import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int X = Integer.parseInt(br.readLine());
        br.close();

        int numerator, denominator;

        if (X == 1) {
            numerator = 1;//분자
            denominator = 1;//분모
        } else {
            int sum = 1;
            int row = 1;

            while (X > sum) {
                row++;
                sum += row;
            }

            int diff = sum - X;
            if (row % 2 == 0) {//짝수일 때 분모가 증가
                numerator = row - diff;
                denominator = 1 + diff;
            } else {//홀수일 때 분자가 증가
                numerator = 1 + diff;
                denominator = row - diff;
            }
        }

        bw.write(numerator + "/" + denominator);

        bw.flush();
        bw.close();
    }
}