package com.pe.sectorcode;

/**
 * @Created 19/12/2021
 * @Project java-core
 * @Author Josue
 */
public class ConversionCadenas
{
  public static void main(String[] args)
  {
    /**
     * La conversión a cadenas se efectua de forma automática al realizar la concatenación cualquier dato numérico o
     * lógico es convertido a cadena.
     */

    int     a = 10;
    double  b = 5.65;
    float   c = 18.4f;
    boolean d = true;

    String cadena = "Esto es un ejemplo de conversión atuomatica a="+a+" , b="+b + ", c="+c+" y d="+d;

    System.out.println( cadena );

  }
}
