package com.calculadora;

import java.text.DecimalFormat;

public class Operaciones {

        // :::::::::::::::::::::: Dar formatoa los decimales
        static DecimalFormat df = new DecimalFormat("#.00");

        // :::::::::::::::::::::: Súma
    
        public static String suma(int num1, int num2) {
            return df.format((double) num1 + num2);
        }
    
        // :::::::::::::::::::::: Resta
    
        public static String resta(int num1, int num2) {
            return df.format((double) num1 - num2);
            // return (double) num1 - num2;
        }
    
        // :::::::::::::::::::::: Multiplicación
    
        public static String multiplicacion(int num1, int num2) {
            return df.format((double) num1 * num2);
            // return (double) num1 * num2;
        }
    
        // :::::::::::::::::::::: División
    
        public static String division(int num1, int num2) {
            return df.format((double) num1 / num2);
        }
    
        // :::::::::::::::::::::: Potenciación
    
        public static String potenciacion(int num1, int num2) {
            return df.format((double) Math.pow(num1, num2));
        }
    
        // :::::::::::::::::::::: Raíz cuadrada
    
        public static String raizCuadrada(int num1) {
            return df.format(Math.sqrt(num1));
        }
    
        public static boolean comprobar(String opctionS) {
            return false;
        }
    
}
