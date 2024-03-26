import java.io.*;

public class Main {
    //버블정렬이란? 인접한 두 원소를 비교하면서 필요에 따라 위치를 교환하는 방식
    //1. 인접한 두 원소 비교한다.
    //2. 왼쪽의 원소가 오른쪽 원소보다 크다면 두 원소의 위치 교환한다.
    //3. 배열이나 리스트를 마지막까지 순회하면 가장 큰 원소가 맨 오른쪽에 위치한다.
    //4. 이런 식으로 반복하면 정렬 완료.
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        br.close();

        bubbleSort(arr);

        for (int i = 0; i < arr.length; i++) {
            bw.write(arr[i] + "\n");
        }

        bw.flush();
        bw.close();
    }
}