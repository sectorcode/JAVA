package com.pe.sectorcode;

import java.util.Scanner;

/**
 * @Created 19/01/2022
 * @Project java-core
 * @Author Josue
 */
public class MatrizEnteros02
{

  public static void main(String[] args)
  {

    final int FILAS = 5, COLUMNAS = 4;
    Scanner   scanner    = new Scanner(System.in);
    int       i, j ;


    int[][] matriz = new int[FILAS][COLUMNAS];

    //Se introducen por teclado
    System.out.println("Lectura de elementos de la matriz: ");
    for (i = 0; i < FILAS; i++) {
      for (j = 0; j < COLUMNAS; j++) {
        System.out.print("matriz [" + i + "][" + j + "]= ");
        matriz[i][j] = scanner.nextInt();
      }
    }

    //Mostrar por pantalla los valores que contiene la matriz
    System.out.println("valores introducidos:");
    for (i = 0; i < matriz.length; i++) {
      for (j = 0; j < matriz[i].length; j++) {
        System.out.print(matriz[i][j] + " ");
      }
      System.out.println();
    }
  }
}
