import java.util.Scanner;

public class Left_and_Right_Sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum1 = 0;
        int sum2 = 0;
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            int number1 = Integer.parseInt(scan.nextLine());
            sum1 += number1;
        }

        for (int i = 0; i < n; i++) {
            int number2 = Integer.parseInt(scan.nextLine());
            sum2 += number2;
        }
        int diff = Math.abs(sum1 - sum2);
        if(diff == 0){
            System.out.println("Yes,sum = "+sum1);
        }
        else{
            System.out.println("No, diff = "+diff);
        }
    }
}


