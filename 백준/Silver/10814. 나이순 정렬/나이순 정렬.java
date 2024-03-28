import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[][] members = new String[N][2];

        for (int i = 0; i < N; i++) {
            String[] st = br.readLine().split(" ");
            members[i][0] = st[0];
            members[i][1] = st[1];
        }
        br.close();

        //Comparator에서 1차원 배열이면 String을, 2차원 배열이면 String[]
        Arrays.sort(members, new Comparator<String[]>() {
            @Override
            //o1은 첫번째 행을, o2는 두번째 행이다.
            //따라서 o1[0]은 members[0][0]이고, o2[0]은 members[1][0]이다.
            public int compare(String[] o1, String[] o2) {
                if (o1[0] == o2[0]) {//나이가 같으면 먼저 들어온 사람이 우선
                    return 1;//따라서 반환 값은 1이다. Compare 특성 상 양수면 앞의 o1이 먼저 정렬되고 음수면 뒤의 o2가 먼저 정렬된다.
                } else {
                    //나이가 다르면 빼기를 통해 양수와 음수 중 반환 값을 확인하고 내림차 순으로 정렬한다.
                    return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
                }
            }
        });

        for (int i = 0; i < N; i++) {
            bw.write(members[i][0] + " " + members[i][1] + "\n");
        }

        bw.flush();
        bw.close();
    }
}