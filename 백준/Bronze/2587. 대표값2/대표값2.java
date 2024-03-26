import java.io.*;

public class Main {
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

    public static int getAvg(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        br.close();

        bubbleSort(arr);

        bw.write(getAvg(arr) + "\n");
        bw.write(String.valueOf(arr[Math.round(arr.length / 2)]));

        bw.flush();
        bw.close();
    }
}