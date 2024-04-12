import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String str = br.readLine();

            if (isValid(str)) {
                bw.write("YES\n");
            } else {
                bw.write("NO\n");
            }
        }

        bw.flush();
        bw.close();
    }

    public static boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.empty()) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.empty();//스택이 비어있으면 YES
    }
}