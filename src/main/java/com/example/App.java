package com.example;

import com.example.model.Abastecimento;
import com.example.model.Veiculo;

public class App {
    public static void main (String[] args){

        Abastecimento abastecimento = new Abastecimento();
        abastecimento.setKmNoAbastecimento(100500);
        abastecimento.setPrice(5.79);
        abastecimento.setLiters(40.00);

        Veiculo corolla = new Veiculo();
        corolla.setConsumo(abastecimento);       

        System.out.println("Km do abastecimento: "+ abastecimento.getKmNoAbastecimento());
        System.out.println("Km Atual: "+ corolla.getkmAtual());
        System.out.printf("Preço: %.2f \n", abastecimento.getPrice());
        System.out.printf("Litros: %.2f \n", abastecimento.getLiters());
        System.out.printf("Valor Total: R$ %.2f \n", abastecimento.CalculateValueAmountPaid());
        System.out.printf("Consumo: %.2f \n", corolla.getConsumo());
        
        corolla.setKmAtual(abastecimento.getKmNoAbastecimento());

        Abastecimento abastecimento2 = new Abastecimento();
        abastecimento2.setKmNoAbastecimento(100800);
        abastecimento2.setPrice(5.79);
        abastecimento2.setLiters(40.00);

        corolla.setConsumo(abastecimento2);       

        System.out.println("Km do abastecimento 2: "+ abastecimento2.getKmNoAbastecimento());
        System.out.println("Km Atual: "+ corolla.getkmAtual());
        System.out.printf("Preço: %.2f \n", abastecimento2.getPrice());
        System.out.printf("Litros: %.2f \n", abastecimento2.getLiters());
        System.out.printf("Valor Total: R$ %.2f \n", abastecimento2.CalculateValueAmountPaid());
        System.out.printf("Consumo: %.2f \n", corolla.getConsumo());

        corolla.setKmAtual(abastecimento2.getKmNoAbastecimento());

    }
}
