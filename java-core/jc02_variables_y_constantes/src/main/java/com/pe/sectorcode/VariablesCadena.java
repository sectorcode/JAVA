package com.pe.sectorcode;
/**
 * @Created 11/12/2021
 * @Project java-core
 * @Author Josue
 */
public class VariablesCadena
{
  public static void main(String[] args)
  {
    /**
     * Una variable es un elemento en memoria que contiene información de forma temporal
     * este puede cambiar durante el flujo de un programa
     */
    String cadena   = "Esto es una cadena de texto";
    char   caracter = 'A'; //Esto es una variable de tipo caracter.

    System.out.printf(" Valor de la variable cadena = \'%s\'%n", cadena);
    System.out.printf(" Valor de la variable caracter = %c%n", caracter);

    // se cambia el valor de la variable cadena;
    cadena = "Esto es una nueva cadena de texto mas un caracter";
    caracter = 'B';
    System.out.printf(" Nuevo valor de la variable cadena =\'%s\'+\'%c\'%n", cadena, caracter);
  }
}
