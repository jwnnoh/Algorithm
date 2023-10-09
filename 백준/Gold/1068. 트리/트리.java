import java.io.*;
import java.util.*;

public class Main {

    static int n, delete, child = 0, leaf = 0;
    static int[] tree;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        tree = new int[n];
        int root = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            tree[i] = Integer.parseInt(st.nextToken());
            if (tree[i] == -1) {
                root = i;
            }
        }
        delete = Integer.parseInt(br.readLine());
        if (delete == root) {
            System.out.println(0);
        }
        else {
            dfs(root);
            System.out.println(leaf);
        }


    }

    public static void dfs(int index) {
        child = 0;
        for (int i = 0; i < tree.length; i++) {
            if (tree[i] == index) {
                if (i == delete) {
                    continue;
                }
                dfs(i);
                child++;
            }
        }
        if (child == 0) {
            leaf++;
        }
    }
}