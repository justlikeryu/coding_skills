import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String N = st.nextToken(); // B진법 수 N
        int B = Integer.parseInt(st.nextToken()); // B진법

        char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        int[] number = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35};

        int sum = 0;
        int length = N.length();

        for (int i = 0; i < length; i++) {
            char currentChar = N.charAt(i);
            int currentNum;

            if (Character.isDigit(currentChar)) {
                currentNum = Character.getNumericValue(currentChar);
            } else {
                currentNum = number[findIndex(alphabet, currentChar)];
            }

            sum = sum * B + currentNum;
        }

        bw.write(String.valueOf(sum));

        br.close();
        bw.flush();
        bw.close();
    }

    private static int findIndex(char[] array, char target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }
}