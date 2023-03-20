package com.pe.sectorcode;
/**
 * @Created 18/03/2023
 * @Project java-core
 * @Author Josue
 */
public class MatrizEnteros01
{
  public static void main(String[] args)
  {
    /**
     * Las matrices se definen como una colección o conjunto de datos de un
     * mismo tipo, a los que se accede por medio de un índice y en
     * todas las situaciones inicia en CERO '0'.
     * Por ejemplo si declaramos un array de 10 elementos tenemos de 0 a 9.
     */

    int[][] matriz = new int[3][2]; // se declaran 3x2 filas

    matriz[0][0] = 100;
    matriz[1][0] = 540;
    matriz[2][0] = 50;
    matriz[0][1] = 985;
    matriz[1][1] = 741;
    matriz[2][1] = 43;

    //----|----------------|-
    //    |  0        1    |
    //----|----------------|-
    // 0  |  100     985   |
    // 1  |  540     741   |
    // 2  |   50      43   |
    //----|----------------|-

    for (int i = 0; i < 3; i++)
    {
      System.out.println();
      for (int j = 0; j < 2; j++) {
        System.out.printf("%10d ", matriz[i][j]);
      }
    }
  }
}
