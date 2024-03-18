import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input;
        while (!(input = br.readLine()).equals("0 0 0")) {
            String[] sides = input.split(" ");
            int first = Integer.parseInt(sides[0]);
            int second = Integer.parseInt(sides[1]);
            int third = Integer.parseInt(sides[2]);

            if (isValid(first, second, third)) {
                if (first == second && second == third) {
                    bw.write("Equilateral\n");
                } else if (first == second || second == third || third == first) {
                    bw.write("Isosceles\n");
                } else {
                    bw.write("Scalene\n");
                }
            } else {
                bw.write("Invalid\n");
            }
        }

        bw.flush();
        bw.close();
    }

    public static boolean isValid(int first, int second, int third) {
        int longest = Math.max(Math.max(first, second), third);
        int sum = first + second + third - longest;
        return sum > longest;
    }
}