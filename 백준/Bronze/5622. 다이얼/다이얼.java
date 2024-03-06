import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String tel = br.readLine();//입력 문자
        int sec = tel.length();//걸리는 시간

        for (String s : tel.split("")) {
            if (s.equals("A") || s.equals("B") || s.equals("C")) {
                sec += 2;
            } else if (s.equals("D") || s.equals("E") || s.equals("F")) {
                sec += 3;
            } else if (s.equals("G") || s.equals("H") || s.equals("I")) {
                sec += 4;
            } else if (s.equals("J") || s.equals("K") || s.equals("L")) {
                sec += 5;
            } else if (s.equals("M") || s.equals("N") || s.equals("O")) {
                sec += 6;
            } else if (s.equals("P") || s.equals("Q") || s.equals("R") || s.equals("S")) {
                sec += 7;
            } else if (s.equals("T") || s.equals("U") || s.equals("V")) {
                sec += 8;
            } else if (s.equals("W") || s.equals("X") || s.equals("Y") || s.equals("Z")) {
                sec += 9;
            }
        }
        bw.write(String.valueOf(sec));

        br.close();
        bw.flush();
        bw.close();
    }
}