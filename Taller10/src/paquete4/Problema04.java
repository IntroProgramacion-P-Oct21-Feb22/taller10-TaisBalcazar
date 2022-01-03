/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema04 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double[][] datos = new double[2][2];
        String cadena = "";

        for (int fila = 0; fila < datos.length; fila++) {
            cadena = String.format("%s", cadena);
            
            for (int col = 0; col < datos[fila].length; col++) {
                System.out.println("Ingrese un valor: ");
                datos[fila][col] = entrada.nextDouble();
                cadena = String.format("%s %.2f\n", cadena, datos[fila][col]);

            }
        }
        System.out.printf("Los valores registrados son: \n%s\n", cadena);

    }
}
