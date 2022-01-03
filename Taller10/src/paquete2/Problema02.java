/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Scanner;

/**
 *
 * @author TaisBalcazar
 */
public class Problema02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String[] vendedores = {"Jessica Cole", "Robert Wallace"};
        double[][] ventas = new double[2][5];
        double suma = 0;
        double valor;

        for (int fila = 0; fila < ventas.length; fila++) {
            System.out.printf("Ingrese las ventas diarias %s\n",
                    vendedores[fila]);
            
            for (int col = 1; col < ventas[fila].length; col++) {
                System.out.printf("Dia %s\n", col);
                double venta = entrada.nextDouble();
                ventas[fila][col] = venta;

            }
        }
        for (int fila = 0; fila < ventas.length; fila++) {
            for (int col = 0; col < ventas[fila].length; col++) {
                valor = ventas[fila][col];
                suma = suma + valor;
            }
        }
        System.out.printf("Vendedor(a) %s\nVendedor(a) %s\n"
                + "Ha realizado un total de %.2f en ventas",
                vendedores[0], vendedores[1], suma);
    }

}
