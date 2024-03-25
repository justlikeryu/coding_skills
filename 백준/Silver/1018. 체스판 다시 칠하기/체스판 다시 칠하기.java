import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static int getMinimum(int startRow, int startCol, String[] board) {
        //화이트 체스판, 블랙 체스판
        String[] orgBoard = {"WBWBWBWB", "BWBWBWBW"};
        int white = 0;

        for (int i = 0; i < 8; i++) {
            int row = startRow + i;
            for (int j = 0; j < 8; j++) {
                int col = startCol + j;
                if (board[row].charAt(col) != orgBoard[row % 2].charAt(j)) {
                    white++;
                }
            }
        }
        return Math.min(white, 64 - white);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());//행
        int M = Integer.parseInt(st.nextToken());//열

        String[] board = new String[N];
        for (int i = 0; i < N; i++) {
            board[i] = br.readLine();
        }
        br.close();

        //1. 8x8크기로 체스판 자르기
        int answer = Integer.MAX_VALUE;

        //체스판을 만들 수 있는 마지막 행과 열의 index를 i와 j에 담음
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                //2. 현재 체스판의 최소 비용
                //i번째와 j번째로 시작하는 하나의 체스판을 칠하는 최소 비용
                int boardCurrent = getMinimum(i, j, board);
                //3. 최적의 answer 값
                if (answer > boardCurrent) {
                    answer = boardCurrent;
                }
            }
        }
        bw.write(String.valueOf(answer));

        bw.flush();
        bw.close();
    }
}