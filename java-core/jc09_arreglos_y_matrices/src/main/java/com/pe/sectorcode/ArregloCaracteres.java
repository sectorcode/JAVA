package com.pe.sectorcode;

/**
 * @Created 19/12/2021
 * @Project java-core
 * @Author Josue
 */
public class ArregloCaracteres
{
  public static void main(String[] args)
  {
    char[] caracter = new char[4]; // definimos un array de 4 elementos

    caracter[0] = 'J';
    caracter[1] = 'A';
    caracter[2] = 'V';
    caracter[3] = 'A';

    System.out.println("El array contiene los siguientes caracteres:");
    for (int i = 0; i < caracter.length; i++) {
      System.out.printf("El valor del caracter [%d] es %c %n",i,caracter[i]);
    }

    System.out.printf("Las cadenas de caracteres se pueden representar como 'String' -> new String (caracter) = %s %n", new String (caracter));
  }
}
