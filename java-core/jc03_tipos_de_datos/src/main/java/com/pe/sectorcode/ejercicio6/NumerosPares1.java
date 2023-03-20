package com.pe.sectorcode.ejercicio6;

public class NumerosPares1 {

	public static void main(String[] args) 
	{
		int cantidad = 10;
		int sumatoria = 0;
		
		for (int i = 1; i <= cantidad; i++)
		{
			if (i % 2== 0) 
			{
				System.out.println ("Numero = "+i+" es par");
				sumatoria+= i;
			}
			else
				System.out.println ("Numero = "+i+" es impar");
		}
		
		
		System.out.println ("Sumatoria = "+sumatoria);
		
		
	}

}
