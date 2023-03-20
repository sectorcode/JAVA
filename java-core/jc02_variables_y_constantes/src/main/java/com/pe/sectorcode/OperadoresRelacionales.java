package com.pe.sectorcode;

/**
 * @Created 12/12/2021
 * @Project java-core
 * @Author Josue
 */
public class OperadoresRelacionales
{


  public static void main(String[] args)
  {

    /**
    * Operadores relacionales
    * -----------------------------------------------------------------------------
    * ==		Igualdad					    a == b
    * !=		Distinto					    a != b
    * <			Menor que					    a < b
    * >			Mayor que					    a > b
    * <=		Menor o igual que			a <= b
    * >=		Mayor o igual que			a >= b
     */

    int a  = 13 ;
    int b  = 5 ;

    System.out.printf(" OPERADORES RELACIONALES a=%d b=%d %n",a , b);
    System.out.printf(" == Igualdad             a == b ->%b%n", a == b );
    System.out.printf(" != Distinto             a != b ->%b%n", a != b );
    System.out.printf(" <  Menor que            a < b  ->%b%n", a < b  );
    System.out.printf(" >  Mayor que            a > b  ->%b%n", a > b  );
    System.out.printf(" <= Menor o igual que    a <= b ->%b%n", a <= b );
    System.out.printf(" >= Mayor o igual que    a >= b ->%b%n", a >= b );

  }
}
