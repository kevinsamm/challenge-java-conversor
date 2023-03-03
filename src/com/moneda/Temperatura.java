package com.moneda;

public class Temperatura {

    public static String celToFah(double valor) {
        return String.format("%.2f", valor*1.8 + 32) + " °F.";
    }

    public static String fahToCel(double valor) {
        return String.format("%.2f", (valor - 32)/1.8) + " °C.";
    }

    public static String celToKel(double valor) {
        return String.format("%.2f", valor + 273.15) + " K.";
    }

    public static String fahToKel(double valor) {
        return String.format("%.2f", (valor*5)/9 + 273.15) + " K.";
    }
}
