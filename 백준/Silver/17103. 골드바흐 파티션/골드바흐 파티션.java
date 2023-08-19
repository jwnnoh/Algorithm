import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static boolean[] arr = new boolean[1000001];
    static HashSet<Integer> primeSet = new HashSet<>();
    static void prime() {
        arr[0] = arr[1] = true;

        for (int i = 2; i < Math.sqrt(1000001); i++) {
            if (arr[i]) {
                continue;
            }
            for (int j = i * i; j < 1000001; j += i) {
                arr[j] = true;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        prime();

        for (int i = 0; i < arr.length; i++) {
            if (!arr[i]) {
                primeSet.add(i);
            }
        }

        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            HashSet<Integer> hashSet = new HashSet<>();
            int count = 0;
            int value = Integer.parseInt(br.readLine());
            for (int j :
                    primeSet) {
                if (!hashSet.contains(j)) {
                    if (primeSet.contains(value - j)) {
                        hashSet.add(j);
                        hashSet.add(value -j);
                        count++;
                    }
                }
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }
}