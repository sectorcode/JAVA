package com.pe.sectorcode.ejercicio1;

/**
 * Uso de tipo de dato boolean
 *
 * @author Josue
 */
public class TipoBoolean
{

  public static void main(String[] arg)
  {
    boolean b = true;
    if (b == true)
      System.out.println("Hola Tipo de dato boolean!");

    // algunas validaciones booleanas
    boolean p1 = true && true; // resulta verdadero
    boolean p2 = true && false; // resulta falso
    boolean p3 = false && false; // resulta falso
    boolean p4 = !true && !true; // resulta falso
    boolean p5 = true && !true; // resulta falso
    boolean p6 = true || true; // resulta true
    boolean p7 = true || !true; // resulta true
    boolean p8 = true || false; // resulta true


    System.out.println("Valor de p1 "+p1);
    System.out.println("Valor de p2 "+p2);
    System.out.println("Valor de p3 "+p3);
    System.out.println("Valor de p4 "+p4);
    System.out.println("Valor de p5 "+p5);
    System.out.println("Valor de p6 "+p6);
    System.out.println("Valor de p7 "+p7);
    System.out.println("Valor de p8 "+p8);


  }
}
