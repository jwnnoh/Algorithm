import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int n;
    static char[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        arr = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = '*';
            }
        }

        solution(0, 0, n);
        for (char[] c :
                arr) {
            System.out.println(c);
        }
    }

    public static void solution(int x, int y, int size) {
        if (size < 3) {
            return;
        }

        size /= 3;
        for (int i = x+size; i < x+(size*2); i++) {
            for (int j = y+size; j < y+(size*2); j++) {
                arr[i][j] = ' ';
            }
        }
        solution(x, y, size);
        solution(x+size, y, size);
        solution(x+(size*2), y, size);

        solution(x, y+size, size);
        solution(x+size, y+size, size);
        solution(x+(size*2), y+size, size);

        solution(x, y+(size*2), size);
        solution(x+size, y+(size*2), size);
        solution(x+(size*2), y+(size*2), size);

    }

}