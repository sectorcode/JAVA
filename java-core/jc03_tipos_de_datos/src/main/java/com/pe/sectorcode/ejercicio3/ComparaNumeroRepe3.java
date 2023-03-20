package com.pe.sectorcode.ejercicio3;

import java.util.Scanner;

public class ComparaNumeroRepe3 {

	public static void main(String[] args) {
		/// los variables de tipo primitivo no aceptan null
		/// solo aquellas que son de tipo objeto (wrappers)

		int valor = 0;
		int acumulador = 0;
		int promedio = 0;
		int contador = 0;

		Scanner scanner = new Scanner(System.in); // permitiendo el ingreso de datos por teclado
		while (true) { /// bucle infinito solo sale si ejecuta un sentencia break
			System.out.println("Ingresar un n�mero diferente de 0 :");
			valor = scanner.nextInt(); // ingresar un valor entero por teclado

			acumulador += valor; // acumulando valores --> acumulador = acumulador + valor

			if (valor != 0) /// solo se contara aquellos numero que sean diferentes de 0
				contador++; // contando --> contador = contador+1 / contador +=1
			else
				break; /// si es cero sale del bucle.
		}

		promedio = acumulador / contador;

		System.out.println("Total valores ingresados  :" + contador);
		System.out.println("Total valores sumados  :" + acumulador);
		System.out.println("Promedio  :" + promedio);

		scanner.close();

	}

}
