import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split(" ");
        int answer = 0;

        for (String s : arr) {
            int i = Integer.parseInt(String.valueOf(s.charAt(s.length() - 1)));
            answer += (i * i);
        }
        System.out.println(answer % 10);
    }
}