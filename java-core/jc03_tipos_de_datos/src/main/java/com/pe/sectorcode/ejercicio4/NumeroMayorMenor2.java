package com.pe.sectorcode.ejercicio4;

import java.util.Scanner;

/**
 * 
 * Crea un programa (llamado �NumeroMayorMenor� en el paquete �ejercicio3�) que
 * permita almacenar los valores en un arreglo de enteros de 5 posiciones
 * (valores por consola utilizando �while�). Una vez ingresados, col�calos en
 * pantalla (en una sola l�nea) y muesra el n�mero mayor y menor.
 * 
 * @author Josue
 *
 *
 *              indice 
 *                 ^ 
 *         numero [0]=valor1; 
 *         numero [1]=valor2;
 *         numero [2]=valor3;
 *         numero [3]=valor4;
 *         numero [4]=valor5;
 *
 */
public class NumeroMayorMenor2 {

	public static void main(String[] args) {

		int contador = 1;
		int numeros[] = new int[5]; // se crea una lista que guardar� 5 elementos de 0-4
		int mayor = 0;
		int menor = 99999; // inicializamos en un numero para que pueda ser tomado el numero mayor

		System.out.println("Ingrese 5 numeros enteros");

		Scanner scanner = new Scanner(System.in);

		// solo vamos a ingresar los valores del vector o arreglo
		while (contador != 6) {
			System.out.println("Ingrese valor para el n�mero [" + contador + "]");
			numeros[contador - 1] = scanner.nextInt();

			contador++;
		}
		scanner.close();

		/// procesamos los valores.

		// desde i igual a 0 mientras i sea menor a la longitud del vector de numero,
		// incrementar en 1 si e verdadero.
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(" numero [" + i + "] =" + numeros[i]);

			if (numeros[i] > mayor)
				mayor = numeros[i];

			if (numeros[i] < menor)
				menor = numeros[i];
		}

		System.out.println("n�mero mayor [" + mayor + "]");
		System.out.println("n�mero menor [" + menor + "]");
	}

}
