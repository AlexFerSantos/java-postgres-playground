package com.example;

public class Veiculo {
    private int kmAtual = 100000;
    private double consumo;

    public int getkmAtual(){
        return kmAtual;
    }
    public void setKmAtual(int kmAtual){
        this.kmAtual = kmAtual;
    }
     public double getConsumo(){
        return consumo;
    }
    public void setConsumo(Abastecimento abastecimento){
        consumo = (abastecimento.getKmNoAbastecimento()-kmAtual)/abastecimento.getLiters();
    }
}
