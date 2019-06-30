import java.text.DecimalFormat;
import java.util.Scanner;

public class Odd_Even_Position {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int n = Integer.parseInt(scan.nextLine());
            double evenMin = 1000000000;
            double evenMax = -1000000000;
            double evenSum = 0;
            double oddMin = 1000000000.0;
            double oddMax = -1000000000.0;
            double oddSum = 0;
            DecimalFormat df = new DecimalFormat("#.##");

            for (int i = 1; i <= n; i++) {

                double number = Double.parseDouble(scan.nextLine());

                if (i % 2 == 0) {

                    evenSum += number;
                    if (number < evenMin) {
                        evenMin = number;

                    }

                    if (number > evenMax) {
                        evenMax = number;

                    }

                } else {

                    oddSum += number;


                    if (number < oddMin) {
                        oddMin = number;

                    }
                    if (number > oddMax) {
                        oddMax = number;

                    }

                }

            }

            if (n == 0) {
                System.out.printf("OddSum=0,%nOddMin=No,%nOddMax=No,%nEvenSum=0,%nEvenMin=No,%nEvenMax=No");
            } else if (n == 1) {

                System.out.println("OddSum="+ df.format(oddSum)+",");
                System.out.println("OddMin="+ df.format(oddSum)+",");
                System.out.println("OddMax="+ df.format(oddSum)+",");
                System.out.printf("EvenSum=0,%nEvenMin=No, %nEvenMax=No");

            } else {

                System.out.println("OddSum="+ df.format(oddSum)+",");
                System.out.println("OddMin="+ df.format(oddMin)+",");
                System.out.println("OddMax="+ df.format(oddMax)+",");
                System.out.println("EvenSum="+ df.format(evenSum)+",");
                System.out.println("EvenMin="+ df.format(evenMin)+",");
                System.out.println("EvenMax="+ df.format(evenMax)+"," );


            }
        }
    }


