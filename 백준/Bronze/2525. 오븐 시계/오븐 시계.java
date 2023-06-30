import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int Sum = (B+C);
        int SumHour = (Sum / 60);
        int SumMin = (Sum % 60);

        // 필요한 시간이 1시간 이내
        if (C < 60) {
            if (Sum < 60) {
                System.out.println(A + " " + Sum);
            } else if (A == 23) {
                System.out.println((SumHour-1) + " " + SumMin);
            } else {
                System.out.println((A+SumHour) + " " + SumMin);
            }
        }
        //필요한 시간이 1시간 이상
        if (C >= 60) {
            if ((A + SumHour) > 23) {
                System.out.println(((A + SumHour) %24) + " " + SumMin);
            }
            else {
                System.out.println((A + SumHour) + " " + SumMin);
            }
        }
    }
}