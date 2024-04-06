import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String[] arr = br.readLine().split(" ");

            switch (arr[0]) {
                case "add":
                    set.add(Integer.parseInt(arr[1]));
                    break;
                case "remove":
                    set.remove(Integer.parseInt(arr[1]));
                    break;
                case "check":
                    if (set.contains(Integer.parseInt(arr[1]))) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                    break;
                case "toggle":
                    if (set.contains(Integer.parseInt(arr[1]))) {
                        set.remove(Integer.parseInt(arr[1]));
                    } else {
                        set.add(Integer.parseInt(arr[1]));
                    }
                    break;
                case "all":
                    set.clear();
                    for (int j = 1; j <= 20; j++) {
                        set.add(j);
                    }
                    break;
                case "empty":
                    set.clear();
            }
        }
        System.out.println(sb);
    }
}