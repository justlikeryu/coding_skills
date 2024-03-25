import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());//N번째 영화
        br.close();

        ArrayList<Integer> list = new ArrayList<>();
        int lastNumber = 666;//무조건 포함되어야 하는 종말의 수, 666

        do {
            if (String.valueOf(lastNumber).contains("666")) {
                list.add(lastNumber);//종말의 수가 포함되면 list에 해당 숫자 추가
            }
            lastNumber++;//N개의 종말의 수가 저장될 때까지 숫자 증가
        } while (list.size() < N);
        
        bw.write(String.valueOf(list.get(N - 1)));

        bw.flush();
        bw.close();
    }
}