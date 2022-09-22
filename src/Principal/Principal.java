package Principal;

import ConversorMoneda.OpcionesConversion;


import javax.swing.*;

public class Principal {
    public static void main(String[] args) {

        OpcionesConversion conversion = new OpcionesConversion();
        String opciones;
        int valorRecibido;
        boolean estado = false;

        while (true) {
            opciones = JOptionPane.showInputDialog(null, "Seleccione una opcion de conversion",
                    "Menu", JOptionPane.PLAIN_MESSAGE, null,
                    new Object[]{"Conversor de monedas", "Conversor de temperatura"}, "Elegir").toString();


            switch (opciones) {
                case "Conversor de monedas":
                    while (!estado) {
                        try {
                            valorRecibido = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor:"));

                            if (valorRecibido != 0) {
                                conversion.ConvertirMonedas(valorRecibido);
                                estado = true;

                            }

                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(null, "Digite un valor numerico");
                            estado = false;


                        }

                    }
                case "Conversor de temperatura":
                    while (!estado) {
                        try {
                            valorRecibido = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una temperatura:"));

                            if (valorRecibido != 0) {
                                conversion.ConvertirTemperatura(valorRecibido);
                                estado = true;

                            }

                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(null, "Digite un valor numerico");
                            estado = false;


                        }

                    }

                    int respuesta = JOptionPane.showConfirmDialog(null, "Desea continuar?");
                    if (JOptionPane.OK_OPTION == respuesta) {
                        System.out.println("Selecciona opcion afirmativa");
                        estado = false;
                    } else {
                        JOptionPane.showMessageDialog(null, "Programa Finalizado");

                        System.exit(0);
                    }


            }


        }

    }
}

