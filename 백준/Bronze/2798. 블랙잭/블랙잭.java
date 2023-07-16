import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n+1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n-2; i++) {
            for (int j = i+1; j <= n-1; j++) {
                for (int k = j+1; k <= n; k++) {
                    int sum = arr[i]+arr[j]+arr[k];
                    list.add(sum);
                }
            }
        }
        int[] arr1 = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr1[i] = list.get(i)-m;
        }

        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] >= ans && arr1[i] <= 0) {
                ans = arr1[i];
            }
        }

        bw.write(ans+m + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}