import java.io.*;
import java.util.StringTokenizer;

public class Main {
    //선택정렬
    //1. 첫번째 원소부터 시작해 마지막 원소 이전까지 순회
    //2. 가장 작은 값 찾기
    //3. 가장 작은 값의 위치와 현재 위치의 값 교환
    //4. 정렬되지 않은 부분의 범위를 좁혀나가면서 반복
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());//응시자수
        int k = Integer.parseInt(st.nextToken());//수상자수

        int[] scores = new int[N];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < scores.length; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
        }
        br.close();

        selectionSort(scores);

        bw.write(scores[N - k] + "");

        bw.flush();
        bw.close();
    }
}