import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String s = br.readLine();
            if (s.equals("end")) {
                System.out.println(sb);
                break;
            }

            int vCnt = 0, cCnt =0; // 모음, 자음 카운트
            boolean flag = true; // 적합성 판단
            boolean containsV = false; // 모음 포함여부
            int prev = -1;

            for (int i = 0; i < s.length(); i++) {
                int idx = s.charAt(i);

                if (isVowel(idx)) {
                    vCnt++;
                    cCnt = 0;
                    containsV = true;
                }
                else {
                    cCnt++;
                    vCnt = 0;
                }

                if (vCnt == 3 || cCnt == 3) {
                    flag = false;
                }

                if (i >= 1 && (prev == idx) && (idx != 'e' && idx != 'o')) {
                    flag = false;
                }
                prev = idx;
            }
            if (!containsV) {
                flag = false;
            }

            if (!flag) {
                sb.append("<" + s + ">").append(" is not acceptable.").append("\n");
            }
            else {
                sb.append("<" + s + ">").append(" is acceptable.").append("\n");
            }
        }

    }

    public static boolean isVowel(int i) {
        return (i == 'a' || i == 'i' || i == 'e' || i == 'o' || i == 'u');
    }

}