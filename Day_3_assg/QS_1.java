import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] attendance = {80, 75, 90, 85, 70, 95, 88, 60, 78, 92};
        int[] prefix = new int[10];
        prefix[0] = attendance[0];

        for (int i = 1; i < 10; i++) {
            prefix[i] = prefix[i - 1] + attendance[i];
        }

        int start = 3;
        int end = 7;

        if (start < 1 || end > 10 || start > end) {
            System.out.println("Invalid range");
        } else {
            int total;
            if (start == 1) {
                total = prefix[end - 1];
            } else {
                total = prefix[end - 1] - prefix[start - 2];
            }

            System.out.println("Total attendance from day " + start + " to day " + end + ": " + total);
        }

        int max = attendance[0];
        int maxDay = 1;

        for (int i = 1; i < 10; i++) {
            if (attendance[i] > max) {
                max = attendance[i];
                maxDay = i + 1;
            }
        }

        System.out.println("Highest attendance: " + max);
        System.out.println("Day: " + maxDay);
        sc.close();
    }
}