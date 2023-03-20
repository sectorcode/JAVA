package com.pe.sectorcode;

/**
 * @Created 19/12/2021
 * @Project java-core
 * @Author Josue
 */
public class ArreglosCadenas
{

  public static void main(String[] args)
  {
    /**
     * Los arreglos de cadena nos permite tener una lista de elementos de tipo String que pueden ser manipulados tambien
     * con estructuras de tipo objeto.
     */

    String[] cadenas_1 = new String[6];
    cadenas_1[0] = "Manzana";
    cadenas_1[1] = "Pera";
    cadenas_1[2] = "Piña";
    cadenas_1[3] = "Melón";
    cadenas_1[4] = "Mango";
    cadenas_1[5] = "Sandía";

    // Se puede inicializar los vectores de la siguiente manera : Sin tener en cuenta la
    // longitud.
    String[] cadenas_2 = {"Pie", "Pastel", "Jugo", "Granizado", "Helado", "Licuado"};
    for (int i=0; i<cadenas_1.length; i++)
    {
      System.out.printf ("%s - %s %n", cadenas_2[i], cadenas_1[i]);
    }

  }
}
