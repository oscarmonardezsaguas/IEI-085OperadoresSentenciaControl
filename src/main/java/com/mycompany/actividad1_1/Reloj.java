
package com.mycompany.actividad1_1;

/**
 *
 * @author OSCAR MONARDEZ SAGUAS
 */
public class Reloj {
    private int horas;
    private int minutos;

    public Reloj(int horas, int minutos) {
        this.horas = horas;
        this.minutos = minutos;
    }

    public Reloj() {
        this.horas = 0;
        this.minutos = 0;
    }

    // Métodos accesadores y mutadores
    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    // Método de impresión en formato hh:mm
    public void imprimirHora() {
        System.out.printf("%02d:%02d\n", horas, minutos);
    }

    // Método para aumentar en un minuto la hora
    public void aumentarMinuto() {
        minutos++;
        if (minutos >= 60) {
            minutos = 0;
            horas++;
            if (horas >= 24) {
                horas = 0;
            }
        }
    }

    // Método para imprimir la hora en formato am/pm
    public void imprimirHoraAmPm() {
        String amPm = (horas < 12) ? "AM" : "PM";
        int horas12 = (horas == 0 || horas == 12) ? 12 : horas % 12;
        System.out.printf("%02d:%02d %s\n", horas12, minutos, amPm);
    }
}
