import java.util.Scanner;

public class Vowels_Sum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();
        int sum =0;

        for (int i = 0; i < s.length(); i++){

            char l = s.charAt(i);

            if (l == 'a') {
                sum += 1;

            } else if (l == 'e') {
                sum += 2;

            } else if (l == 'i') {
                sum += 3;

            } else if (l == 'o') {
                sum += 4;

            } else if (l == 'u') {
                sum += 5;

            }
        }
        System.out.println(sum);
    }
}


