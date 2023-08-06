import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(br.readLine());
        int[] arr2 = new int[m];

        st = new StringTokenizer(br.readLine());
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < m; i++) {
            int value = Integer.parseInt(st.nextToken());
            hashMap.put(value, 0);
            arr2[i] = value;
        }

        for (int i : arr) {
            if (hashMap.containsKey(i)) {
                int tmp = hashMap.get(i);
                tmp++;
                hashMap.put(i, tmp);
            }
        }

        for (int i : arr2) {
            sb.append(hashMap.get(i)).append(" ");
        }
        System.out.println(sb);
    }
}