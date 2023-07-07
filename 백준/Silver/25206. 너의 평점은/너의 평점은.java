import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = 0;
        double total = 0;
        double credit = 0;

        for (int i = 0; i < 20; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            credit = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            switch (grade) {
                case "A+":
                    total += (credit * 4.5);
                    n += credit;
                    break;
                case "A0":
                    total += (credit * 4.0);
                    n += credit;
                    break;
                case "B+":
                    total += (credit * 3.5);
                    n += credit;
                    break;
                case "B0":
                    total += (credit * 3.0);
                    n += credit;
                    break;
                case "C+":
                    total += (credit * 2.5);
                    n += credit;
                    break;
                case "C0":
                    total += (credit * 2.0);
                    n += credit;
                    break;
                case "D+":
                    total += (credit * 1.5);
                    n += credit;
                    break;
                case "D0":
                    total += (credit);
                    n += credit;
                    break;
                case "F":
                    total += (credit * 0.0);
                    n += credit;
                    break;
                case "P":
                    break;
            }
        }

        bw.write((total/n) + "\n");

        bw.flush();
        br.close();
        bw.close();
    }
}