package com.moneda;

public class Soles {
    public static final double tasaDolares = 0.26;
    public static final double tasaEuros = 0.25;
    public static final double tasaLibras = 0.22;
    public static final double tasaYenes = 36.15;
    public static final double tasaWones = 346.69;

    public static String toDolares(double soles) {
        return String.format("%.2f", soles*tasaDolares) + " dólares.";
    }

    public static String toEuros(double soles) {
        return String.format("%.2f", soles*tasaEuros) + " euros.";
    }

    public static String toLibras(double soles) {
        return String.format("%.2f", soles*tasaLibras) + " libras esterlinas.";
    }

    public static String toYenes(double soles) {
        return String.format("%.2f", soles*tasaYenes) + " yenes.";
    }

    public static String toWones(double soles) {
        return String.format("%.2f", soles*tasaWones) + " wones coreanos.";
    }

    public static String fromDolares(double dolares) {
        return String.format("%.2f", dolares/tasaDolares) + " soles.";
    }

    public static String fromEuros(double euros) {
        return String.format("%.2f", euros/tasaEuros) + " soles.";
    }

    public static String fromLibras(double libras) {
        return String.format("%.2f", libras/tasaLibras) + " soles.";
    }

    public static String fromYenes(double yenes) {
        return String.format("%.2f", yenes/tasaYenes) + " soles.";
    }

    public static String fromWones(double wones) {
        return String.format("%.2f", wones/tasaWones) + " soles.";
    }
}
