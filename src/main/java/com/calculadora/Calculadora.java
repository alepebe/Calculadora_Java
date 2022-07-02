package com.calculadora;

import javax.swing.JOptionPane;

public class Calculadora {
    String mensaje1 = """
        Digita una opción:

            1. Realizar una opración
            0. Salir
            """;

String mensaje2 = """
        Seleccione una operación:

        1. Súma
        2. Resta
        3. Multiplicasión
        4. División
        5. Potenciación
        6. Raíz cuadrada de un número
        7. Salir

        """;

// :::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

public void menuPrincipal() {

    int opction;
    do {
        String opctionSelected = JOptionPane.showInputDialog(null, mensaje1, "Menú pricipal", 1);

        if (Comprobaciones.isNumeric(opctionSelected)) {
            opction = Integer.parseInt(opctionSelected);

            switch (opction) {
                case 1:
                    iniciarOperaciones();
                    opction = 0;
                    break;
                case 0:
                    opction = 0;
            }

        } else {
            JOptionPane.showMessageDialog(null, "Ingrese una opción valida");
            opction = -1;
        }

    } while (opction != 0);
}

public void iniciarOperaciones() {

    int opction;
    do {
        String opctionSelected = JOptionPane.showInputDialog(null, mensaje2, "Menú Operaciones", 1);

        if (Comprobaciones.isNumeric(opctionSelected)) {
            opction = Integer.parseInt(opctionSelected);

            switch (opction) {
                case 1:
                    Comprobaciones.realizaOperacion(opction);
                    break;
                case 2:
                    Comprobaciones.realizaOperacion(opction);
                    break;
                case 3:
                    Comprobaciones.realizaOperacion(opction);
                    break;
                case 4:
                    Comprobaciones.realizaOperacion(opction);
                    break;
                case 5:
                    Comprobaciones.realizaOperacion(opction);
                    break;
                case 6:
                    Comprobaciones.realizaOperacion(opction);
                    break;
            }

        } else {
            JOptionPane.showMessageDialog(null, "Ingrese una opción valida");
            opction = -1;
        }

    } while (opction != 7);
}



}
