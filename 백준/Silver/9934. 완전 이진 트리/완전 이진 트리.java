import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static int k;
    static String[] arr;
    static List<ArrayList<Integer>> list = new ArrayList<>();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        k = Integer.parseInt(br.readLine());
        arr = br.readLine().split(" ");
        for (int i = 0; i < k; i++) {
            list.add(new ArrayList<>());
        }

        go(0, arr.length - 1, 0);

        for (List<Integer> branch : list) {
            for (int i : branch) {
                sb.append(i).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    private static void go(int start, int end, int depth) {
        if (depth == k) {
            return;
        }
        
        int mid = (start + end) / 2;
        list.get(depth).add(Integer.parseInt(arr[mid]));

        go(start, mid - 1, depth + 1);
        go(mid + 1, end, depth + 1);
    }
}