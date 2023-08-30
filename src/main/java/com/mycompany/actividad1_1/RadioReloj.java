
package com.mycompany.actividad1_1;

/**
 *
 * @author OSCAR MONARDEZ SAGUAS
 */
class RadioReloj extends Reloj {
       private boolean original;

    public RadioReloj(int horas, int minutos, boolean original) {
        super(horas, minutos);
        this.original = original;
    }

    public RadioReloj() {
        super();
        this.original = true;
    }

    // Métodos accesadores y mutadores

    public boolean isOriginal() {
        return original;
    }

    public void setOriginal(boolean original) {
        this.original = original;
    }

    // Método de impresión
    public void imprimirRadioReloj() {
        System.out.print("Radio Reloj - ");
        imprimirHora();
        System.out.println("Original: " + original);
    }

    // Método para eliminar el reloj si la radio no es original
    public void eliminarSiNoOriginal() {
        if (!original) {
            setHoras(0);
            setMinutos(0);
        }
    }
}
