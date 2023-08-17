import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        HashSet<String> hashSet = new HashSet<>();
        int count = 0;

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            if (s.equals("ENTER")) {
                count += hashSet.size();
                hashSet.clear();
            }
            else {
                hashSet.add(s);
            }
            if (i == n-1 && !s.equals("ENTER")) {
                count += hashSet.size();
            }
        }
        System.out.println(count);
    }
}