package com.pe.sectorcode.ejercicio2;

import java.util.Scanner;

/**
 *  Comparar 2 n�meros menores de 10 y mostrar su representaci�n en letras.
	Al finalizar el laboratorio, el alumno lograr�:
	Aplicar sentencias condicionales en un c�digo Java.

 * @author Josue
 *
 */
public class ComparaNumeros1 {

	/**
	 * Metodo ejecutable
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		int numero1 = 0; // Iniciacilizamos valores a 0
		int numero2 = 0 ;

		Scanner scanner = new Scanner(System.in); // System.in permitir el ingreso desde teclado

		System.out.println("Ingrese número 1 : ");
		numero1 = scanner.nextInt(); // ingresar un valor entero

		System.out.println("Ingrese número 2 : ");
		numero2 = scanner.nextInt(); // ingresar un valor entero

		scanner.close(); // ya no se pueden ingresar mas valores

		// la comparaci�n
		// v o f = v (boolean)
		// v y f = f
		// v y !f = v
		// f o f =m f
		if (numero1 > 10 || numero2 > 10) {
			System.out.println("N�meros deben ser menores a 10");
		} else {
			
			if (numero1 > numero2)
				System.out.println("Primer n�mero es mayor al segundo");
			else if (numero2 > numero1)
				System.out.println("Segundo n�mero es mayor al primero");
			else
				System.out.println("Números iguales");

			System.out.println("El primer número es :");
			switch (numero1) {
			case 0:
				System.out.println("cero");
				break;
			case 1:
				System.out.println("uno");
				break;
			case 2:
				System.out.println("dos");
				break;
			case 3:
				System.out.println("tres");
				break;
			case 4:
				System.out.println("cuatro");
				break;
			case 5:
				System.out.println("cinco");
				break;
			case 6:
				System.out.println("seis");
				break;
			case 7:
				System.out.println("siete");
				break;
			case 8:
				System.out.println("ocho");
				break;
			case 9:
				System.out.println("nueve");
				break;
			}

		}

	}
}
