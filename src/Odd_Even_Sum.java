import java.util.Scanner;

public class Odd_Even_Sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int sum1 = 0;
        int sum2 = 0;
        int number1 = 0;
        int number2 = 0;

        for (int i = 0; i < n; i++) {

            number1 = Integer.parseInt(scan.nextLine());


            if (i % 2 == 0) {

                sum1 += number1;

            } else {

                sum2 += number1;
            }
        }

        if (sum1 == sum2) {

            System.out.println("Yes");
            System.out.println("Sum = " + sum1);
        } else {

            System.out.println("No");
            System.out.println("Diff = " + Math.abs(sum2 - sum1));
        }

    }
}

