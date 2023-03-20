package com.pe.sectorcode;

/**
 * @Created 12/12/2021
 * @Project java-core
 * @Author Josue
 */
public class OperadoresAsignacion
{


  public static void main(String[] args)
  {

    /**
     *                          Operadores de Asignación
     * -----------------------------------------------------------------------------
     * Operador   Significado					        Ejemplo
     * -----------------------------------------------------------------------------
     * =		      Asignación					        a  = b  Igualamos a con el valor de b
     * +=		      Suma y asignación			      a += b (a=a + b)
     * -=		      Resta y asignación			    a -= b (a=a - b)
     * *=		      Multiplicación y asignación	a *= b (a=a * b)
     * /=		      División y asignación		    a /= b (a=a / b)
     * %=		      Módulo y asignación			    a %= b (a=a % b)
     */

    int suma           = 3 ;
    int resta          = 5 ;
    int multiplicacion = 3 ;
    int division       = 4 ;
    int resto          = 5 ;


    System.out.println(" ASIGNACION ");
    System.out.printf(" suma           = %d%n", suma);
    System.out.printf(" resta          = %d%n", resta);
    System.out.printf(" multiplicacion = %d%n", multiplicacion);
    System.out.printf(" division       = %d%n", division);
    System.out.printf(" resto          = %d%n", resto);


    suma           +=7; // Retorna 10
    resta          -=2; // Retorna 3
    multiplicacion *=2; // Retorna 6
    division       /=3; // Retorna 2
    resto          %=3; // Retorna 2

    System.out.println(" OPERADORES ASIGNACION  ");
    System.out.printf(" suma           +=7 -- Retorna : %d%n", suma);
    System.out.printf(" resta          -=2 -- Retorna : %d%n", resta);
    System.out.printf(" multiplicacion *=2 -- Retorna : %d%n", multiplicacion);
    System.out.printf(" division       /=3 -- Retorna : %d%n", division);
    System.out.printf(" resto          %%=3 -- Retorna : %d%n", resto);

  }
}
