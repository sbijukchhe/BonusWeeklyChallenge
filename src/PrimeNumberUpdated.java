/*
Find a number. Check all the numbers 0 to that number and print if prime or not.
 */

import java.util.Scanner;

class PrimeNumberUpdated{

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        int i = 0;
        int j = 0;


        System.out.println("**************************");
        System.out.println(" Please enter a number");
        System.out.println("**************************");

        int num = input.nextInt();

        while (num != 0) {

            String primeNumbers = "";

            for (i = 1; i <= num; i++) {

                int counter = 0;

                for (j = i; j >= 1; j--) {

                    if (i % j == 0) {
                        counter = counter + 1;
                    }
                }
                if (counter == 2) {
                    //Append the Prime number to the String
                    primeNumbers = primeNumbers + i + " ";
                }
            }

            System.out.println("\n-----------------------------------------------------------------------------------");
            System.out.println("Prime numbers from 1 to " + num + " are :");
            System.out.println();
            System.out.println("      " + primeNumbers);
            System.out.println("-------------------------------------------------------------------------------------");
            System.out.println("\nPlease enter '0' to quit.");
            System.out.println("Or, enter a number .....");
            num = input.nextInt();
            System.out.println("*************************************************************************************");
        }
    }
}