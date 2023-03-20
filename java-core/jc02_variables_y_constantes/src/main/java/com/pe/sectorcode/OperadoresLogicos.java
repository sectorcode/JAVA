package com.pe.sectorcode;

/**
 * @Created 12/12/2021
 * @Project java-core
 * @Author Josue
 */
public class OperadoresLogicos
{


  public static void main(String[] args)
  {

    /**
    * Operadores logicos
    * -----------------------------------------------------------------------------
    * &&    Representa AND el valor del conector lógico 'Y'
    * ||    Representa OR el valor del conector lógico 'O'
    * !     Representa NOT el valor del conector lógico 'No' o negación
    */

    int a  = 13 ;
    int b  = 5 ;
    int c  = 5 ;

    System.out.printf(" OPERADORES LOGICOS %n");
    System.out.printf(" AND (&&)  (a == b=%b && b >= c=%b) ->%b%n", a == b, b>=c,  a == b && b>=c );
    System.out.printf(" OR  (||)  (a == b=%b || b >= c=%b) ->%b%n", a == b, b>=c,  a == b || b>=c );
    System.out.printf(" NOT (!)   !(a == b)=%b  && !(b >= c)=%b ->%b%n", !(a == b), !(b>=c),  !(a == b) && !(b>=c) );
  }
}
