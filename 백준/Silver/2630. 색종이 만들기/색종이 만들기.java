import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int white = 0, blue = 0;
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        go(0, 0, n);

        System.out.println(white);
        System.out.println(blue);
    }

    private static void go(int y, int x, int size) {
        if (check(y, x, size)) {
            if (arr[y][x] == 1) {
                blue++;
                return;
            }
            white++;
            return;
        }

        int newSize = size / 2;
        go(y, x, newSize);
        go(y, x + newSize, newSize);
        go(y + newSize, x, newSize);
        go(y + newSize, x + newSize, newSize);
    }

    private static boolean check(int y, int x, int size) {
        int color = arr[y][x];
        for (int i = y; i < y + size; i++) {
            for (int j = x; j < x + size; j++) {
                if (arr[i][j] != color) {
                    return false;
                }
            }
        }
        return true;
    }
}