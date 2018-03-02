package com.company;

public class CalcReturn {
    private double total;
    private double change;

    /* get the total taxi price needed */
    public double calcFullPrice( TaxiStat taxi){
        return total = (taxi.getPass() * taxi.getUnit());
    }

    /*get change per row */
    public double getChange( TaxiStat taxi){
        change  =  taxi.getPayed() - (taxi.getSit() * (taxi.getUnit()));
        return change;
    }

    /* display */
    public void display( TaxiStat taxi) {
        System.out.println(" Change is "+getChange(taxi));
    }
}
