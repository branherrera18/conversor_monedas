package ConversorMoneda;

import javax.swing.*;

public class ConvertirMonedas {

    //CONVERSIONES
    public void ConvertirColonADolares(double valor){
        double monedaColon = valor / 648;
        monedaColon = Math.round(monedaColon * 100d)/100d;
        JOptionPane.showMessageDialog(null,
                "You have $ " + monedaColon + " Dollars");
    }

    public void ConvertirDolarAColon(double valor){
        double monedaDolar = valor / 0.0016;
        monedaDolar = monedaDolar * 100/100;
        JOptionPane.showMessageDialog(null,
                "You have ₡ " + monedaDolar + " Colones");
    }

    public void ConvertirEurosAColones(double valor){
        double monedaEuro = valor / 650;
        monedaEuro = Math.round(monedaEuro * 100d)/100d;
        JOptionPane.showMessageDialog(null,
                "You have ₡ " + monedaEuro + " Euros");
    }

    public void ConvertirColonAEuros(double valor){
        double monedaColon = valor / 0.0016;
        monedaColon = Math.round(monedaColon * 100d)/100d;
        JOptionPane.showMessageDialog(null,
                "You have € " + monedaColon + " Colones");
    }
    public void ConvertirYenAColones(double valor){
        double monedaYen = valor / 4;
        monedaYen = Math.round(monedaYen * 100d)/100d;
        JOptionPane.showMessageDialog(null,
                "You have ₡ " + monedaYen + " Japanese Yen");
    }
    public void ConvertirColonAYen(double valor){
        double monedaColon = valor / 0.2;
        monedaColon = Math.round(monedaColon * 100d)/100d;
        JOptionPane.showMessageDialog(null,
                "You have ¥ " + monedaColon + " Colones");
    }

}
