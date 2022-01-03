/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author TaisBalcazar
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String cadena = "";
        double[][] notas = {
            {9, 10, 7, 8},
            {10, 5, 7, 9},
            {7, 9.4, 10, 9}};

        String[] nombres = {"Jerry Ponce", "Gabriela Lewis", "David Bell"};
        double[] promedios = new double[3];
        double suma;

        for (int fila = 0; fila < notas.length; fila++) {
         suma = 0;
            for (int col = 0; col < notas[fila].length; col++) {
                suma = suma + notas[fila][col];
            }
            promedios[fila] = suma / notas[0].length;

        }
        for (int fila = 0; fila < nombres.length; fila++) {
            cadena = String.format("%s\nEstudiante: %s tiene un"
                    + " promedio de %.2f",
                    cadena,
                    nombres[fila],
                    promedios[fila]);
        }
        System.out.println(cadena);

    }

}
