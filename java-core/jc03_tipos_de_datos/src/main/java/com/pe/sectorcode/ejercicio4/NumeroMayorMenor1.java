package com.pe.sectorcode.ejercicio4;

import java.util.Scanner;

/**
 * 
 * Crea un programa (llamado �NumeroMayorMenor� en el paquete �ejercicio3�) 
 * que permita almacenar los valores en un arreglo de enteros de 5 posiciones 
 * (valores por consola utilizando �while�). Una vez ingresados, col�calos en pantalla
 * (en una sola l�nea) y muesra el n�mero mayor y menor.
 * 
 * @author Josue
 *
 */
public class NumeroMayorMenor1 {

	public static void main(String[] args) {
		
		int contador = 1;
		int numero   = 0;
		int mayor    = 0;
		int menor    = 0;
		
		System.out.println ("Ingrese 5 numeros enteros");
		
		Scanner scanner = new Scanner (System.in);
		
		while (contador != 6)
		{
			System.out.println ("Ingrese valor para el n�mero ["+contador+"]");
			numero = scanner.nextInt();
			
			
			if (contador == 1)
			{	
				mayor = numero; 
				menor = numero;
			}
			
			
			if (numero > mayor )
				mayor = numero;
			else if (numero < mayor )
				menor = numero ;
				
			
			contador++;
		}
		
		System.out.println ("  n�mero mayor ["+mayor+"]");
		System.out.println ("  n�mero menor ["+menor+"]");	 
	}

}
