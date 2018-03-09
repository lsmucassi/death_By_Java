package com.company;

public class TaxiStat {

    private double unit;
    private int numPass;
    private int numSit = 0;
    private int totSit;
    private double payed;

    /* set and get unit price */
    public void setUnit(double uni){
        this.unit = uni;
    }
    public double getUnit(){
        return unit;
    }

    /* set and get number of passengers */
    public void setPass(int pass){
        this.numPass = pass;
    }
    public double getPass(){
        return numPass;
    }

    /* set and get number of sit per row */
    public void setSit(int sitR){
        this.numSit = sitR;
    }
    public double getSit(){
        return numSit;
    }

    /* set and get number of sit per row */
    public void setTotSit(int totSit){
        this.totSit = totSit;
    }
    public int getTotSit(){
        return totSit;
    }

    /* set and get number of sit per row */
    public void setPayed(double payed){
        this.payed = payed;
    }
    public double getPayed() {
        return payed;
    }
}
