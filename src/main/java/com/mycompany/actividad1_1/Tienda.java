package com.mycompany.actividad1_1;

/**
 *
 * @author OSCAR MONARDEZ SAGUAS
 */
public class Tienda {
    private RadioReloj[] radioRelojes;

    public Tienda() {
        radioRelojes = new RadioReloj[3];
        for (int i = 0; i < 3; i++) {
            radioRelojes[i] = new RadioReloj();
        }
    }

    // Métodos accesadores y mutadores

    public RadioReloj[] getRadioRelojes() {
        return radioRelojes;
    }

    public void setRadioRelojes(RadioReloj[] radioRelojes) {
        this.radioRelojes = radioRelojes;
    }

    // Método de impresión indicando el número de ítem
    public void imprimirTienda() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Ítem " + (i + 1) + ":");
            radioRelojes[i].imprimirRadioReloj();
        }
    }

    // Método para pintar todas las radio relojes de la tienda de un color definido por el usuario
    public void pintarDeColor(String color) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Pintando ítem " + (i + 1) + " de color " + color);
        }
    }
}
