package com.moneda;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        String cantidad = "";
        String opcionSeleccionada = "";
        double cantidadConversion = 0;
        String valorFinal = "";
        String[] opcionesConversor = {"Conversor de monedas", "Conversor de temperatura"};
        String[] opcionesMonedas = {"Soles a Dólares", "Soles a Euros", "Soles a Libras", "Soles a Yenes", "Soles a Wones coreanos", "Dólares a Soles", "Euros a Soles", "Libras a Soles", "Yenes a Soles", "Wones coreanos a Soles"};
        String[] opcionesTemperatura = {"Celsius a Fahrenheit", "Fahrenheit a Celsius", "Celsius a Kelvin", "Fahrenheit a Kelvin"};

        try {
            String conversorOpcion = (String) JOptionPane.showInputDialog(null, "Elige una opción", "Menú", JOptionPane.PLAIN_MESSAGE, null, opcionesConversor, opcionesConversor[0]);
            if (conversorOpcion.contains("monedas")) {
                cantidad = (String) JOptionPane.showInputDialog(null,"Ingrese la cantidad de dinero que desea convertir");
                if (cantidad.matches("[^0-9]+")) {
                    JOptionPane.showMessageDialog(null, "Valor no válido");
                    main(args);
                }
                opcionSeleccionada = (String) JOptionPane.showInputDialog(null, "Elige una opción de conversión", "Selección de moneda", JOptionPane.PLAIN_MESSAGE, null, opcionesMonedas, opcionesMonedas[0]);
                cantidadConversion = Double.parseDouble(cantidad);
                switch (opcionSeleccionada) {
                    case "Soles a Dólares" -> valorFinal = Soles.toDolares(cantidadConversion);
                    case "Soles a Euros" -> valorFinal = Soles.toEuros(cantidadConversion);
                    case "Soles a Libras" -> valorFinal = Soles.toLibras(cantidadConversion);
                    case "Soles a Yenes" -> valorFinal = Soles.toYenes(cantidadConversion);
                    case "Soles a Wones coreanos" -> valorFinal = Soles.toWones(cantidadConversion);
                    case "Dólares a Soles" -> valorFinal = Soles.fromDolares(cantidadConversion);
                    case "Euros a Soles" -> valorFinal = Soles.fromEuros(cantidadConversion);
                    case "Libras a Soles" -> valorFinal = Soles.fromLibras(cantidadConversion);
                    case "Yenes a Soles" -> valorFinal = Soles.fromYenes(cantidadConversion);
                    case "Wones coreanos a Soles" -> valorFinal = Soles.fromWones(cantidadConversion);
                    default -> {}
                }
                JOptionPane.showMessageDialog(null, "Tienes " + valorFinal);
            } else {
                cantidad = (String) JOptionPane.showInputDialog(null,"Ingrese el valor de temperatura que desea convertir");
                if (cantidad.matches("[^0-9]+")) {
                    JOptionPane.showMessageDialog(null, "Valor no válido");
                    main(args);
                }
                opcionSeleccionada = (String) JOptionPane.showInputDialog(null, "Elige una opción de conversión", "Selección de cambio de temperatura", JOptionPane.PLAIN_MESSAGE, null, opcionesTemperatura, opcionesTemperatura[0]);
                cantidadConversion = Double.parseDouble(cantidad);
                switch (opcionSeleccionada) {
                    case "Celsius a Fahrenheit" -> valorFinal = Temperatura.celToFah(cantidadConversion);
                    case "Fahrenheit a Celsius" -> valorFinal = Temperatura.fahToCel(cantidadConversion);
                    case "Celsius a Kelvin" -> valorFinal = Temperatura.celToKel(cantidadConversion);
                    case "Fahrenheit a Kelvin" -> valorFinal = Temperatura.fahToKel(cantidadConversion);
                    default -> {}
                }
                JOptionPane.showMessageDialog(null, "Es equivalente a " + valorFinal);
            }
            int n = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Cuadro de confirmación", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (n == 0) {
                main(args);
            } else {
                JOptionPane.showMessageDialog(null, "Programa finalizado");
                System.exit(0);
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Programa finalizado");
            System.exit(0);
        }
    }

}
