import java.util.Scanner;

public class Sum_Numbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int sum = 0;
        for(int i=0; i<n; i++){

            int number = Integer.parseInt(scan.nextLine());
            sum = sum + number;
        }

        System.out.println(sum);
    }
}


