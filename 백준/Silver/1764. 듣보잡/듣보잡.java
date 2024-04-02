import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());//못 들어본 사람
        int M = Integer.parseInt(st.nextToken());//못 본 사람

        HashSet<String> neverListen = new HashSet<>();
        for (int i = 0; i < N; i++) {
            neverListen.add(br.readLine());
        }

        HashSet<String> neverSee = new HashSet<>();
        for (int i = 0; i < M; i++) {
            neverSee.add(br.readLine());
        }
        br.close();

        TreeSet<String> neverListenNSee = new TreeSet<>();
        for (String name : neverListen) {
            if (neverSee.contains(name)) {
                neverListenNSee.add(name);
            }
        }

        bw.write(neverListenNSee.size() + "\n");
        for (String name : neverListenNSee) {
            bw.write(name + "\n");
        }
        
        bw.flush();
        bw.close();
    }
}