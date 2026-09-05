package com.colegiomagico.reto3;

/**
 * Usa un ciclo for para crear una cadena que repita la palabra 'Pocion ' la cantidad de veces indicada.
 */
public class PocionCiclos {

    public static String preparar(int cantidad) {
       
       String cadena= "";
       for (int i=0; i < cantidad;  i++){
       cadena= cadena + "Pocion ";
       }
        return cadena; // TODO: Cambia esto
    }

    public static void main(String[] args) {
        System.out.println("Preparando 6 pociones: " + preparar(6));
    }
}
