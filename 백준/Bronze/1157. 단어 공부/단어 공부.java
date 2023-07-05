import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[26];

        String s = (br.readLine()).toLowerCase();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < s.length(); j++) {
                if ((char)(97+i) == s.charAt(j)) {
                    arr[i]++;
                }
            }
        }

        int max = arr[0];
        int max1 = 65;
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                max1 = i+65;
            }
        }


        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max == arr[i]) {
                count++;
            }
        }

        if (count > 1) {
            bw.write("?" + "\n");
        } else bw.write((char)(max1) + "\n");

        bw.flush();
        br.close();
        bw.close();
    }
}