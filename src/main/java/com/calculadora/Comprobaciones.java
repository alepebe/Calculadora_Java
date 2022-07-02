package com.calculadora;

import javax.swing.JOptionPane;

public class Comprobaciones {

    public static boolean isNumeric(String strNum) {

        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }

        return true;
    }

    public static void realizaOperacion(int opctionSelected) {

        String resultado;
        String a = JOptionPane.showInputDialog(null, "Ingresa un número");

        if (opctionSelected == 6) {
            boolean verificar_1 = isNumeric(a);

            if (verificar_1) {
                int num1 = Integer.parseInt(a);
                resultado = Operaciones.raizCuadrada(num1);
                JOptionPane.showMessageDialog(null, "El resultado es: " + resultado, "Resultado", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Ingresa solo valores numéricos");
            }
        } else {

            String b = JOptionPane.showInputDialog(null, "Ingresa otro número");
            boolean verificar_1 = isNumeric(a), verificar_2 = isNumeric(b);

            if (verificar_1 && verificar_2) {
                int num1 = Integer.parseInt(a);
                int num2 = Integer.parseInt(b);

                switch (opctionSelected) {
                    case 1:
                        resultado = Operaciones.suma(num1, num2);
                        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado, "Resultado", 1);
                        break;
                    case 2:
                        resultado = Operaciones.resta(num1, num2);
                        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado, "Resultado", 1);
                        break;
                    case 3:
                        resultado = Operaciones.multiplicacion(num1, num2);
                        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado, "Resultado", 1);
                        break;
                    case 4:
                        resultado = Operaciones.division(num1, num2);
                        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado, "Resultado", 1);
                        break;
                    case 5:
                        resultado = Operaciones.potenciacion(num1, num2);
                        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado, "Resultado", 1);
                        break;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ingresa solo valores numéricos");
            }

        }

    }
}
