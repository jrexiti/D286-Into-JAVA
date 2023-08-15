package com.example;

public class Debt_11 {

    private double debtRatio;

    public void calculateDR(double totalDebt, double totalAssets) {
        if (totalAssets != 0) {
            debtRatio = totalDebt / totalAssets;
        } else {
            debtRatio = 0;
        }
    }

    public double getDR() {
        return debtRatio;
    }

}
