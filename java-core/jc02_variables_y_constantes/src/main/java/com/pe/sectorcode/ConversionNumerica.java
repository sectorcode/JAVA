package com.pe.sectorcode;

/**
 * @Created 18/12/2021
 * @Project java-core
 * @Author Josue
 */
public class ConversionNumerica
{
  public static void main(String[] args)
  {
    /**
     * Las conversiones de tipos numerico se efectuan cuando los tipos no permiten operar entre uno y otro.
     * Por ejemplo si usamos valores enteros los resultados seran enteros
     * int a = 10;
     * int b = 5;
     * int c = a / b;
     *
     * No podemos asignar a 'c' un tipo diferente al declarado, pero podemos convertirlo.
     */

    //division entera.
    int a = 10;
    int b = 5;

    int c = a / b ;
    //division decimal.
    double r = 10.5;
    double s = 5.5;

    double t = r / s ;

    System.out.println("Division entera");
    System.out.printf ("%d = %d / %d%n", c, a, b);

    System.out.println("Division decimal");
    System.out.printf ("%f = %f/ %f %n", t, r, s);

    System.out.println("Convertir entero a decimal ( se adiciona fracción )");
    System.out.printf ("c=%f%n", (double) c );

    System.out.println("Convertir decimal a entero ( se trunca la fracción )");
    System.out.printf ("t=%d t=%f%n", (int) t, t );
  }
}
