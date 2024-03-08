import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] grade = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F", "P"};
        double[] score = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0, 0.0};
        double sumGpa = 0;
        double GpaXResult = 0;
        double avg = 0;

        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String subject = st.nextToken();  // 과목
            double gpa = Double.parseDouble(st.nextToken());  // 학점
            String result = st.nextToken();  // 평점

            //전공 평점: (학점 * 평점) / 학점의 총합
            for(int j = 0; j < grade.length; j++){
                if(j != 9&& result.equals(grade[j])){
                    GpaXResult += gpa * score[j];
                    sumGpa += gpa;
                }
            }
        }
        avg = GpaXResult / sumGpa;

        bw.write(String.format("%.6f", avg));

        bw.flush();
        bw.close();
        br.close();
    }
}