import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        //HashSet: 순서를 보장하지 않는다
        //TreeSet: 순서를 보장한다
        TreeSet<String> list = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String status = st.nextToken();

            if (status.equals("enter")) {
                list.add(name);
            } else {
                list.remove(name);
            }
        }
        br.close();

        for (String name : list.descendingSet()) {
            bw.write(name + "\n");
        }

        bw.flush();
        bw.close();
    }
}