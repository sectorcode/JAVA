package com.pe.sectorcode;

/**
 * @Created 12/12/2021
 * @Project java-core
 * @Author Josue
 */
public class TiposDatos
{

  public static void main(String[] args)
  {
    /**
     * Datos de tipo primitivo: representan un único dato
     * simple que puede ser de tipo char, byte, short, int, long, float, double, boolean.
     * Tipo de dato	Representación	    Tamaño (Bytes)	Rango de Valores	Valor por defecto	Clase Asociada
     * -----------------------------------------------------------------------------------------------------------
     * byte	    Numérico Entero con signo	1	  -128 a 127							      0			          Byte
     * short	  Numérico Entero con signo	2		-32768 a 32767						    0			          Short
     * int		  Numérico Entero con signo	4		-2147483648 a 2147483647		  0			          Integer
     * long	    Numérico Entero con signo	8		-9223372036854775808 a 			 	0			          Long
     * 				  							                 9223372036854775807
     * float	  Numérico en Coma flotante	4		± 3.4x10-38 a ± 3.4x1038      0			          Float
     * 		      de precisión simple Norma
     * 		      IEEE 754
     * double	  Numérico en Coma flotante	8		± 1.8x10-308 a ± 1.8x10308		0			          Double
     * 		      de precisión doble Norma
     * 		      IEEE 754
     * char	    Carácter Unicode			    2		\u0000 a \uFFFF						\u0000		          Character
     * boolean	Dato lógico					      -		true ó false						  false		            Boolean
     * void	    -							            -		-									        -			              Void
     */

    // datos enteros
    int a = 2147483647;
    byte n1 = -128, n2 = 127;
    short x = 32767;

    char letra1 = 'z';
    char letra2 = '\u0061'; //código unicode del carácter ‘a’

    /**
     * En el conjunto de caracteres ASCII, los primeros 32 valores están asignados a los
     * códigos de control de comunicaciones y de impresora (caracteres no imprimibles) empleados
     * para controlar la forma  en que la información es transferida desde una computadora
     * a otra o desde una computadora a una impresora.
     */
    char letra3 = '\u0062'; //código unicode del carácter ‘b'
    /**
     * UNICODE proporciona una única representación numérica para cada carácter, de forma independiente al
     * tipo de computadora, aplicación o el lenguaje de programación usado.
     */

    System.out.printf(" a=%d %n",a);
    System.out.printf(" n1=%d, n2=%d %n",n1,n2);
    System.out.printf(" x=%d %n",x);
    System.out.printf(" letra1=%c letra2=%c letra3=%c %n",letra1,letra2, letra3 );

    // tipos de dato decimal
    float flotante = 3.58f;
    double decimal  = 5.256d;

    System.out.printf("flotante=%f decimal=%.3f %n", flotante, decimal);

  }
}
