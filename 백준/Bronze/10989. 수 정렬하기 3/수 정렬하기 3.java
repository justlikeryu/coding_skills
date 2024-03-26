import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] numbers = new int[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }
        br.close();

        //Colletions.sort()로 작성하면 메모리 초과가 발생한다.
        //Colletions.sort()는 퀵소트알고리즘을 사용하여 정렬을 수행하는데, 최악의 경우에는 O(n^2)의 시간 복잡도를 가진다.
        //또한 ArrayList는 동적 배열로 구현되어 메모리를 많이 사용한다.
        //그에 비해 Arrays.sort()는 고정 크기의 배열을 사용해 추가적인 메모리를 필요로 하지 않는다.
        Arrays.sort(numbers);

        for (int i = 0; i < numbers.length; i++) {
            bw.write(numbers[i] + "\n");
        }

        bw.flush();
        bw.close();
    }
}