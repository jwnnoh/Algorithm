import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        
        double sum = 0;
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }
        
        Arrays.sort(arr);

        int count = 0;
        int max = -1;
        int mod = arr[0];
        boolean b = false;

        for(int i = 0; i < n - 1; i++) {
            if(arr[i] == arr[i + 1]) {
                count++;
            }else {
                count = 0;
            }

            if(max < count) {
                max = count;
                mod = arr[i];
                b = true;
            }else if(max == count && b == true) {
                mod = arr[i];
                b = false;
            }
        }
        System.out.println(Math.round(sum / n));
        System.out.println(arr[(n - 1) / 2]);
        System.out.println(mod);
        System.out.println(arr[n - 1] - arr[0]);
    }

}