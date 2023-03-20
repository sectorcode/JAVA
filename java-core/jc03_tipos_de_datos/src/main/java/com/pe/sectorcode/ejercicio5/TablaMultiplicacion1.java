package com.pe.sectorcode.ejercicio5;

public class TablaMultiplicacion1 {

	public static void main(String[] args) 
	{

			int contador = 0;
			int tabla    = 9;
			
			// solo ejecutar� si se cumple la condicion
			while (contador <= 12)
			{
				System.out.println (tabla + " x "+ contador + " = "+ (tabla*contador) );
				contador++;
			}
	}

}
