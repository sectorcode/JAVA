package com.pe.sectorcode;

/**
 * @Created 11/12/2021
 * @Project java-core
 * @Author Josue
 */
public class Constantes
{
  public static int    CONSTANTE_NUM_INTEGER = 10;
  public static float  CONSTANTE_NUM_FLOAT   = 10.12368f;
  public static double CONSTANTE_NUM_DOUBLE  = 10.12368;
  public static String CONSTANTE_CADENA      = "Esto es una cadena";

  /**
   * Una constante es un espacio en memoria que una vez almacenado no varia durante
   * todo el flujo de ejecución del programa.
   * Se accede por medio de un identificador al igual que las variables.
   */
  public static void main(String[] args)
  {
    System.out.printf(" Valor Constantes.CONSTANTE_NUM_INTEGER : %d%n",Constantes.CONSTANTE_NUM_INTEGER );
    System.out.printf(" Valor Constantes.CONSTANTE_NUM_DOUBLE  : %f%n",Constantes.CONSTANTE_NUM_DOUBLE);
    System.out.printf(" Valor Constantes.CONSTANTE_NUM_FLOAT   : %f%n",Constantes.CONSTANTE_NUM_FLOAT);
    System.out.printf(" Valor Constantes.CONSTANTE_CADENA      : %s%n",Constantes.CONSTANTE_CADENA);
  }
}
