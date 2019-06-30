import java.util.Scanner;

public class Equal_Pairs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int previousSum = 0;
        int currentSum = 0;
        int differnece = 0;
        int biggestDifference = 0;
        for (int i = 0; i < n; i++) {

            int number1 = Integer.parseInt(scan.nextLine());
            int number2 = Integer.parseInt(scan.nextLine());

            if (i == 0) {

                previousSum = number1 + number2;


            } else {

                currentSum = number1 + number2;
                differnece = Math.abs(currentSum - previousSum);
                if (differnece > biggestDifference) {
                    biggestDifference = differnece;
                }

                previousSum = currentSum;
            }

        }
        if (biggestDifference == 0) {
            System.out.println("Yes, value=" + previousSum);
        } else {

            System.out.println("No, maxdiff=" + differnece);
        }
    }
}

