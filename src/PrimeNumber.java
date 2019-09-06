
import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        int numToCheck;
        boolean isPrime;

        System.out.println("*************************************************************");
        System.out.println("\nPlease enter a number to check if it is a Prime number....");
        System.out.println("\n*************************************************************");

        Scanner input = new Scanner(System.in);
        numToCheck = input.nextInt();
        isPrime = false;


        while (numToCheck != 0) {

            isPrime = false;

            for (int i = 2; i <= numToCheck / 2; ++i) {

                if (numToCheck % i == 0) {
                    isPrime = true;
                    break;
                }
            }

            if (!isPrime)
                System.out.println("       " + numToCheck + " is a prime number.");
            else
                System.out.println("       " + numToCheck + " is not a prime number.");

            System.out.println("---------------------------------------------------------");
            System.out.println("\nPlease enter '0' to quit.");
            System.out.println("Or, enter a number to check if it is a Prime number....");
            numToCheck = input.nextInt();
            System.out.println("---------------------------------------------------------");

        }
    }
}

