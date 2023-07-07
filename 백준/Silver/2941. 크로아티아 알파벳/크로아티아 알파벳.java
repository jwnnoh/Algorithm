import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int len = s.length()-1;

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'c' && i < len) {
                    if (s.charAt(i + 1) == '=') {
                        i++;
                    } else if (s.charAt(i + 1) == '-') {
                        i++;
                    }
            } 
            else if (s.charAt(i) == 'd' && i < len) {
                if (s.charAt(i + 1) == 'z' && i < len - 1 && s.charAt(i + 2) == '=') {
                    i += 2;
                } else if (s.charAt(i + 1) == '-') {
                    i++;
                }
            }
            else if (s.charAt(i) == 'l' || s.charAt(i) == 'n') {
                if (i < len) {
                    if (s.charAt(i + 1) == 'j') {
                        i++;
                    }
                }
            }
            else if (s.charAt(i) == 's' || s.charAt(i) == 'z') {
                if (i < len) {
                    if (s.charAt(i + 1) == '=') {
                        i++;
                    }
                }
            }
            count++;
        }

        bw.write(count + "\n");

        bw.flush();
        br.close();
        bw.close();
    }
}