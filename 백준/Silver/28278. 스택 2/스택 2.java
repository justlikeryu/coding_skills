import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            String order = br.readLine();
            char c = order.charAt(0);

            switch (c) {
                case '1':
                    stack.push(Integer.parseInt(order.split(" ")[1]));
                    break;
                case '2':
                    if (!stack.isEmpty()) {
                        bw.write(stack.pop() + "\n");
                    } else {
                        bw.write(-1 + "\n");
                    }
                    break;
                case '3':
                    bw.write(stack.size() + "\n");
                    break;
                case '4':
                    if (stack.isEmpty()) {
                        bw.write(1 + "\n");
                    } else {
                        bw.write(0 + "\n");
                    }
                    break;
                case '5':
                    if (!stack.isEmpty()) {
                        bw.write(stack.peek() + "\n");
                    } else {
                        bw.write(-1 + "\n");
                    }
                    break;
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}