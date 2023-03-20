package com.pe.sectorcode;

/**
 * @Created 12/12/2021
 * @Project java-core
 * @Author Josue
 */
public class OperadoresEspeciales
{


  public static void main(String[] args)
  {

    /**
    * Operadores Especiales
    * -----------------------------------------------------------------------------
    * ++		Incremento	              a++	(postincremento)
    *                                 ++a (preincremento)
    * --		Decremento	              a--	(postdecremento)
    *                                 --a	(predecremento)
    * (tipo)expr	Cast					      a = (int) b
    * +	Concatenación de cadenas		  a = "cad1" + "cad2"
    * .	Acceso a variables y métodos	a = obj.var1
    * ( )	Agrupación de expresiones		a = (a + b) * c
     */

    int a  = 13 ;

    System.out.printf("OPERADORES ESPECIALES \n");
    System.out.printf("a = %d%n", a );
    System.out.printf("a++\t(postincremento) %d%n", a++ );
    System.out.printf("a Se imprime ya incrementada %d%n", a  );
  }
}
