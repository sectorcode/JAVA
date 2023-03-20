package com.pe.sectorcode.ejercicio6;

public class NumerosPares3 {

	public static void main(String[] args) 
	{
		int cantidad = 10;
		int sumatoria = 0;
		int i = 1;
		
		do
		{
			if (i % 2== 0)
			{
				System.out.println ("Numero = "+i+" es par");
				sumatoria += i;
			}
			else
				System.out.println ("Numero = "+i+" es impar");
			
			i++;
		}
		while ( i <= cantidad  );
		
		System.out.println ("Sumatoria = "+sumatoria);
	}

}
