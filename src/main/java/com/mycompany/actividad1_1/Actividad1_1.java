package com.mycompany.actividad1_1;

/**
 *
 * @author conta
 */
public class Actividad1_1 {

    public static void main(String[] args) {
       Tienda tienda = new Tienda();

        // Ejemplo de uso
        tienda.getRadioRelojes()[0].setHoras(10);
        tienda.getRadioRelojes()[0].setMinutos(30);

        tienda.getRadioRelojes()[1].setHoras(15);
        tienda.getRadioRelojes()[1].setMinutos(45);
        tienda.getRadioRelojes()[1].setOriginal(false);

        tienda.getRadioRelojes()[2].setHoras(8);
        tienda.getRadioRelojes()[2].setMinutos(0);

        tienda.imprimirTienda();

        tienda.pintarDeColor("rojo");

        tienda.getRadioRelojes()[1].eliminarSiNoOriginal();
        tienda.imprimirTienda();
    }
    }

