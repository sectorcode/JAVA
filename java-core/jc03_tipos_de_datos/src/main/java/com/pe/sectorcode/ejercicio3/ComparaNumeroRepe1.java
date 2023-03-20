package com.pe.sectorcode.ejercicio3;

import java.util.Scanner;

/***
 * Crea en una nueva clase llamada �ComparaNumerosRepe� la misma l�gica del
 * ejercicio anterior,pero ahora solicita repetidamente al usuario los n�meros
 * hasta que los ingrese menores a 10.
 * 
 * @author Josue
 *
 */
public class ComparaNumeroRepe1 {

	public static void main(String[] args) {
		// declarar e inicializar los valores de las variables
		int numero1 = 11;
		int numero2 = 11;

		Scanner teclado = new Scanner(System.in); // permitiendo el ingreso de datos por teclado

		// la primera vez se permitira ingresar porque el numero evaluado es mayor
		// que 10 para salir del bucle el numero debe ser menor que 10

		while (numero1 > 10) {
			System.out.println("Ingresar un n�mero menor a 10 -> 1 :");
			numero1 = teclado.nextInt(); // ingresar un valor entero por teclado
		}

		while (numero2 > 10) {
			System.out.println("Ingresar un n�mero menor a 10 -> 2 :");
			numero2 = teclado.nextInt(); // ingresar un valor entero por teclado
		}

		teclado.close();

		if (numero1 > numero2)
			System.out.println("Primer numero es mayor al segundo");
		else if (numero2 > numero1)
			System.out.println("Segundo numero es mayor que el primero");
		else
			System.out.println("Numeros iguales");

		
		System.out.print("El valor del primer n�mero es :");
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
