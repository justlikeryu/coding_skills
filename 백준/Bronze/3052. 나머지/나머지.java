import java.io.*;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] remainder = new int[10];
        HashSet<Integer> remainderSet = new HashSet<>();
        
        for(int i = 0; i < remainder.length; i++){
            int num = Integer.parseInt(br.readLine());
            remainder[i] = num % 42;
            remainderSet.add(remainder[i]);
        }
        
        bw.write(Integer.toString(remainderSet.size()));

        br.close();
        bw.flush();
        bw.close();
    }
}