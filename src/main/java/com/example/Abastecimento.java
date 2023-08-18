package com.example;


public class Abastecimento {
    private int kmNoAbastecimento;
    private double price;
    private double liters;

    public int getKmNoAbastecimento(){
        return kmNoAbastecimento;
    }
    
    public void setKmNoAbastecimento(int km){
        this.kmNoAbastecimento =km;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getLiters(){
        return liters;
    }

    public void setLiters(double litros){
        this.liters = litros;
    }

    public double CalculateValueAmountPaid(){
        return this.price * this.liters;
    }
}