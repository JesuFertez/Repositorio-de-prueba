package com.example.calculadora;

public class Calculadora {
    public int add(String valores) {
        if (valores.isEmpty()) {
            return 0;
        }

        String[] valoresArray = valores.split(",");
        int total = 0;
        for (int indice = 0; indice < valoresArray.length; indice++) {
            total = total + Integer.parseInt(valoresArray[indice]);
        }
        return total;
    }
}
