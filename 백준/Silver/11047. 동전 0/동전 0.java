import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        int count = 0;
        for (int i = list.size()-1; i >= 0; i--) {
            if (k < list.get(i)) {
                continue;
            }
            else {
                count += k / list.get(i);
                k %= list.get(i);
            }
        }
        System.out.println(count);
    }
}