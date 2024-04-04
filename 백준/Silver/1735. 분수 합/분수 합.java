import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int firstA = Integer.parseInt(st.nextToken());//분자
        int firstB = Integer.parseInt(st.nextToken());//분모

        st = new StringTokenizer(br.readLine());
        int secondA = Integer.parseInt(st.nextToken());
        int secondB = Integer.parseInt(st.nextToken());
        br.close();

        int thirdB = lcm(firstB, secondB);
        int a = thirdB / firstB;
        int b = thirdB / secondB;

        int numerator = (firstA * a) + (secondA * b);
        int denominator = thirdB;

        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;

        bw.write(numerator + " " + denominator);

        bw.flush();
        bw.close();
    }

    public static int gcd(int a, int b) {//최대공약수
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static int lcm(int a, int b) {//최소공배수
        return a * b / gcd(a, b);
    }
}