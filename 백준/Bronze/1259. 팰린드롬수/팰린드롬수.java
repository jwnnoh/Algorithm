import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            boolean flag = true;
            String s = br.readLine();
            if (s.equals("0")) {
                break;
            }

            for (int i = 0; i < (s.length() / 2); i++) {
                if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                sb.append("yes").append("\n");
            } else {
                sb.append("no").append("\n");
            }
        }
        System.out.println(sb);
    }
}