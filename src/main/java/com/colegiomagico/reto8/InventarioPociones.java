package com.colegiomagico.reto8;

import java.util.ArrayList;
import java.util.List;
/**
 * Filtra la lista de ingredientes devolviendo solo aquellos que empiezan con 'A'.
 */
public class InventarioPociones {

    public static java.util.List<String> filtrar(java.util.List<String> ingredientes) {
        List<String> resultado = new ArrayList<>();// TODO: Cambia esto

        for (String ingrediente : ingredientes) {
            if (ingrediente.startsWith("A") || ingrediente.startsWith("a")) {
                resultado.add(ingrediente);
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        java.util.List<String> lista = java.util.Arrays.asList("Ajenjo", "Miel");
        System.out.println("Filtrados: " + filtrar(lista));
    }
}
