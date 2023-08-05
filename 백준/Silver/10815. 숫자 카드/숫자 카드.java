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


        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(br.readLine());
        int[] need = new int[m];
        HashMap<Integer, Integer> resultMap = new HashMap<Integer, Integer>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int value = Integer.parseInt(st.nextToken());
            resultMap.put(value, 0);
            need[i] = value;
        }

        for (int i = 0; i < arr.length; i++) {
            if (resultMap.containsKey(arr[i])) {
                resultMap.put(arr[i], 1);
            }
        }

        for (int i :
                need) {
            sb.append(resultMap.get(i)).append(" ");
        }

        System.out.println(sb);
    }
}