import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = (s.charAt(i)-48);
        }
        Arrays.sort(arr);
        for (int i = arr.length-1; i >= 0; i--) {
            sb.append(arr[i]);
        }
        System.out.println(sb);
    }
}