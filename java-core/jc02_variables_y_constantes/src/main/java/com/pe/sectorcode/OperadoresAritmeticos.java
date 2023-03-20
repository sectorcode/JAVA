package com.pe.sectorcode;

/**
 * @Created 12/12/2021
 * @Project java-core
 * @Author Josue
 */
public class OperadoresAritmeticos
{


  public static void main(String[] args)
  {

    /**
     * 			Operadores Aritméticos
     * -------------------------------------------------
     * Operador	Significado					Ejemplo
     * -------------------------------------------------
     * +			  Suma						    a + b
     * -			  Resta						    a - b
     * *			  Multiplicación			a * b
     * /			  División					  a / b
     * %			  Módulo						  a % b
     */

    int suma           = 3 + 7;   // Retorna 10
    int resta          = 5 - 2;   // Retorna 3
    int multiplicacion = 3 * 2;   // Retorna 6
    int division       = 4 / 2;   // Retorna 2
    int resto          = 5 % 3;   // Retorna 2
    System.out.printf("suma = 3 + 7           -- Retorna : %d%n", suma);
    System.out.printf("resta = 5 - 2          -- Retorna : %d%n", resta);
    System.out.printf("multiplicacion = 3 * 2 -- Retorna : %d%n", multiplicacion);
    System.out.printf("division = 4 / 2       -- Retorna : %d%n", division);
    System.out.printf("resto = 5 %% 3         -- Retorna : %d%n", resto);
  }
}
