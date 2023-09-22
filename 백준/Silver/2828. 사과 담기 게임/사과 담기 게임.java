import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int j = Integer.parseInt(br.readLine());

        int l = 1;
        int r = 0, count = 0;
        for (int i = 0; i < j; i++) {
            r = l + m - 1;
            int tmp = Integer.parseInt(br.readLine());
            if (tmp >= l && tmp <= r) {
                continue;
            }
            else {
                if (tmp < l) {
                    count += l - tmp;
                    l = tmp;
                }

                else {
                    count += tmp - r;
                    l += tmp - r;
                }
            }
        }

        System.out.println(count);

    }


}