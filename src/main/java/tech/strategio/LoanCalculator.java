package tech.strategio;

import java.util.Scanner;

public class LoanCalculator {

    /**
     This method calculates how much will be owed of a loan after 3 months. The borrower will repay 10% of the remaining amount
     each month, so will make 3 payments of 10% of the remaining balance 3 times.
     */
    static int getRemainingAmountIn3Months(int amount) {
        int remaining = amount;
        for(int i = 1; i <= 3; i++)
        {
            remaining -= (remaining/10);
        }
        return remaining;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int amount = scanner.nextInt();
            System.out.println(getRemainingAmountIn3Months(amount));
        }
    }
}
