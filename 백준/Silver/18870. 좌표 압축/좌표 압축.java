import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] sorted = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());;
        for (int i = 0; i < n; i++) {
            int value = Integer.parseInt(st.nextToken());
            sorted[i] = arr[i] = value;
        }
        Arrays.sort(sorted);

        HashMap<Integer, Integer> counting = new HashMap<Integer, Integer>();
        int count = 0;
        for (int i : sorted) {
            if (!counting.containsKey(i)) {
                counting.put(i, count);
                count++;
            }
        }

        for (int i : arr) {
            sb.append(counting.get(i)).append(" ");
        }
        System.out.println(sb);
    }
}