package com.pe.sectorcode;
/**
 * @Created 18/03/2023
 * @Project java-core
 * @Author Josue
 */
public class ArregloDiasMes
{
    public static void main(String[] args)
    {
        int[] dias = new int[12]; // definimos un array de 12 elementos
        String [] meses = new String[12];

        dias[0]  = 31; meses[0]  = "enero";
        dias[1]  = 28; meses[1]  = "febrero";
        dias[2]  = 31; meses[2]  = "marzo";
        dias[3]  = 30; meses[3]  = "abril";
        dias[4]  = 31; meses[4]  = "mayo";
        dias[5]  = 30; meses[5]  = "junio";
        dias[6]  = 31; meses[6]  = "julio";
        dias[7]  = 31; meses[7]  = "agosto";
        dias[8]  = 30; meses[8]  = "setiembre";
        dias[9]  = 31; meses[9]  = "octubre";
        dias[10] = 30; meses[10] = "noviembre";
        dias[11] = 31; meses[11] = "diciembre";

        System.out.println("El array contiene los siguientes dias del mes:");
        for (int i = 0; i < meses.length; i++) {
            System.out.printf("Los dias para el mes de %s es [%d] %n",
                    meses[i], dias[i] );
        }
    }
}
