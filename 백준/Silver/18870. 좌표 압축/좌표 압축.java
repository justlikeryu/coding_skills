import java.io.*;
import java.util.*;

public class Main {
    //1. 숫자 입력
    //2. 숫자별 순위 매기기
    //3. 순위 출력
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] numbers = new int[N];

        //1
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        int[] sortedNumbers = numbers.clone();
        Arrays.sort(sortedNumbers);

        //2
        int curRank = 0;//순위
        HashMap<Integer, Integer> rank = new HashMap<Integer, Integer>();//좌표와 순위 매핑
        for (int i = 0; i < N; i++) {
            //중복되지 않는 순위면 증가
            if (i == 0 || sortedNumbers[i] != sortedNumbers[i - 1]) {
                curRank++;
            }
            rank.put(sortedNumbers[i], curRank);
        }

        //3
        for (int i = 0; i < N; i++) {
            int compressedCoord = rank.get(numbers[i]);
            bw.write((compressedCoord - 1) + " ");
        }

        bw.flush();
        bw.close();
    }
}