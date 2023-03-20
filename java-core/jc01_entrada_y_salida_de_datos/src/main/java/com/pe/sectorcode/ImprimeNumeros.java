package com.pe.sectorcode;

/**
 * @Author Josue Lopez
 */
public class ImprimeNumeros
{
  public static void main(String[] args)
  {
    /**
     * d	 	      Un entero decimal.
     * f	 	      Un flotador.
     * n	 	      Un carácter de nueva línea siempre debe usar %n,
     * tB	 	      Conversión de fecha y hora: nombre completo del mes específico de la configuración regional.
     * td, te	 	  Una conversión de fecha y hora: día del mes de 2 dígitos. td tiene ceros a la izquierda según sea necesa
     * ty, tY	 	  Una conversión de fecha y hora: ty = año de 2 dígitos, tY = año de 4 dígitos.
     * tl	 	      Conversión de fecha y hora: hora en formato de 12 horas.
     * tM	 	      Una conversión de fecha y hora: minutos en 2 dígitos, con ceros a la izquierda según sea necesario.
     * tp	 	      Una conversión de fecha y hora: am / pm específica de la configuración regional (minúsculas).
     * tm	 	      Una conversión de fecha y hora: meses en 2 dígitos, con ceros a la izquierda según sea necesario.
     * tD	 	      Una conversión de fecha y hora: fecha como% tm% td% ty
     *  	        08	Ocho caracteres de ancho, con ceros a la izquierda según sea necesario.
     *  	        +	Incluye signo, ya sea positivo o negativo.
     *  	        ,	Incluye caracteres de agrupación específicos de la configuración regional.
     *  	        -	Justificado a la izquierda ..
     *  	        .3	Tres lugares después del punto decimal.
     *  	        10,3	Diez caracteres de ancho, justificados a la derecha, con tres lugares después del punto decimal.

     */


    double valor = 4657987.87921231;

    System.out.println("Mostrar un mismo valor con varios formatos");

    // El simbolo  es un salto de linea
    //normal double y float
    System.out.printf("El valor es %f%n", valor);

    //con notación científica
    System.out.printf("El valor con notación científica es %e%n", valor);

    //con 2 decimales
    System.out.printf("El valor con 2 decimales es %.2f%n", valor);

    //con 6 decimales
    System.out.printf("El valor con 6 decimales es %.6f%n", valor);

    //con simbolo + y 2 decimales
    System.out.printf("El valor con simbolo + y 2 decimales es %+.2f%n", valor);

    //con espacios en blanco (suman 11 todas las cifras) con 2 decimales
    System.out.printf("El valor con espacios en blanco (suman 11 todas las cifras) con 2 decimales es %11.2f%n", valor);

    //con espacios en blanco (suman 11 todas las cifras) con símbolo + y 2 decimales
    System.out.printf("El valor con espacios en blanco (suman 11 todas las cifras) con símbolo + y 2 decimales es %+11.2f%n", valor);

    //con ceros delante (suman 11 todas las cifras) con 2 decimales
    System.out.printf("El valor con ceros delante (suman 11 todas las cifras) con 2 decimales es %011.2f%n", valor);

    //con ceros delante (suman 11 todas las cifras) con símbolo + y 2 decimales
    System.out.printf("El valor con ceros delante (suman 11 todas las cifras) con símbolo + y 2 decimales es %+011.2f%n", valor);

    //separando los miles (4,657,987.87921231 en lugar de 4657987.87921231)
    System.out.printf("El valor separando los miles %,f en lugar de %f%n", valor, valor);
  }
}
