package com.example;

import java.util.Scanner;

public class DebtMeasure_11 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        Debt_11 debt1 = new Debt_11();

        double totalDebt = scnr.nextDouble();
        double totalAssets = scnr.nextDouble();

        debt1.calculateDR(totalDebt, totalAssets);

        System.out.printf(
                "The Company's total debt is in the amount of $%,.2f, and total assets are in the amount of $%,.2f, which gives a debt ratio of %.2f.\n",
                totalDebt, totalAssets, debt1.getDR());
    }

}
