package com.example;

import java.util.Scanner;

public class assessment11DebtMeasure {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        assessment11 debt1 = new assessment11();

        double totalDebt = scnr.nextDouble();
        double totalAssets = scnr.nextDouble();

        debt1.calculateDR(totalDebt, totalAssets);

        System.out.printf(
                "The Company's total debt is in the amount of $%,.2f, and total assets are in the amount of $%,.2f, which gives a debt ratio of %.2f.\n",
                totalDebt, totalAssets, debt1.getDR());

        scnr.close();
    }
}