package ConversorMoneda;

import javax.swing.*;

public class OpcionesConversion {
    ConvertirMonedas monedas = new ConvertirMonedas();
    ConvertirTemperatura temperatura = new ConvertirTemperatura();

    public void ConvertirMonedas(double valor) {

        String opciones = (JOptionPane.showInputDialog(null,
                "Elije la moneda a la que deseas convertir tu dinero",
                "Monedas", JOptionPane.PLAIN_MESSAGE, null, new Object[]
                        {"Colon to Dollar", "Dollar to Colon", "Colon to Euro", "Euro to Colon", "Colon to Japanese Yen", "Japanese Yen to Colon"}, "Seleccion").toString());

        switch (opciones) {
            case "Colon to Dollar":
                monedas.ConvertirColonADolares(valor);
                break;
            case "Dollar to Colon":
                monedas.ConvertirDolarAColon(valor);
                break;
            case "Colon to Euro":
                monedas.ConvertirColonAEuros(valor);
                break;
            case "Euro to Colon":
                monedas.ConvertirEurosAColones(valor);
                break;
            case "Colon to Japanese Yen":
                monedas.ConvertirColonAYen(valor);
                break;
            case "Japanese Yen to Colon":
                monedas.ConvertirYenAColones(valor);
                break;
        }
    }

    public void ConvertirTemperatura(double valor) {
        String opciones = (JOptionPane.showInputDialog(null,
                "Elije la temperatura a la que deseas convertir ",
                "Temperaturas", JOptionPane.PLAIN_MESSAGE, null, new Object[]
                        {"Celcius to Fahrenheit", "Fahrenheit to Celcius"}, "Seleccion").toString());

        switch (opciones) {
            case "Celcius to Fahrenheit":
                temperatura.ConvertirCelciusAFahrenheit(valor);
                break;
            case "Fahrenheit to Celcius":
                temperatura.ConvertirFahrenheitACelcius(valor);
                break;

        }
    }
}


