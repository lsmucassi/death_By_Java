package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaxiStat taxi = new TaxiStat();
        CalcReturn ret = new CalcReturn();
        int numPass = 0;
        int numPassR = 0;
        double amountR;
        double totAmnt;
        double unitP;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Total number of passengers");
        numPass = sc.nextInt();
        System.out.println("Enter unit amount");
        unitP = sc.nextDouble();
        taxi.setUnit(unitP);
        totAmnt = unitP * numPass;

        while (numPass != 0){
            System.out.println("Enter number of passengers in a row");
            numPass = sc.nextInt();
            taxi.setSit(numPassR);


            System.out.println("Enter amount payed in the row");taxi.setPayed(50);
            amountR = sc.nextDouble();
            taxi.setPayed(amountR);

            ret.calcFullPrice(taxi);
            ret.getChange(taxi);
            ret.display(taxi);

            numPass -= numPassR;
        }
    }
}