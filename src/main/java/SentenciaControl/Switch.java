/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SentenciaControl;

/**
 *
 * @author conta
 */
public class Switch {
    public static void main(String[] args) {
        int dayOfWeek =2;
        String dayName;

        switch (dayOfWeek) {
            case 1:
                dayName = "Lunes";
                break;
            case 2:
                dayName = "Martes";
                break;
            case 3:
                dayName = "Miércoles";
                break;
            case 4:
                dayName = "Jueves";
                break;
            case 5:
                dayName = "Viernes";
                break;
            default:
                dayName = "Fin de semana";
                break;
        }

        System.out.println("Hoy es " + dayName);
    }
}
