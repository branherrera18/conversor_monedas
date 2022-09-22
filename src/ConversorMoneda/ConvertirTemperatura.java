package ConversorMoneda;

import javax.swing.*;

public class ConvertirTemperatura {
        //Conversion temperatura
    public void ConvertirCelciusAFahrenheit(double valor){
        double tFahrenheit = ((9*valor)/5)+32;
        tFahrenheit = Math.round(tFahrenheit * 100d)/100;
        JOptionPane.showMessageDialog(null,
                "Fahrenheit temperature is =" + tFahrenheit);
    }

    public void ConvertirFahrenheitACelcius(double valor){
        double tCelicus = (valor-32)*5/9;
        tCelicus = Math.round(tCelicus * 100d)/100;
        JOptionPane.showMessageDialog(null,
                "Celcius temperature is =" + tCelicus);
    }


}
