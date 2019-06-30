import java.util.Scanner;

public class Half_Sum_Element {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            int number = Integer.parseInt(scan.nextLine());
            sum += number;

            if (number > max) {
                max = number;


            }

        }
        sum = sum - max;

        if (sum == max) {
            System.out.println("Yes");
            System.out.println("Sum = " + sum);
        }

        else {

            System.out.println("No");
            System.out.println("Diff = " + + Math.abs(max - sum));
        }
    }
}

