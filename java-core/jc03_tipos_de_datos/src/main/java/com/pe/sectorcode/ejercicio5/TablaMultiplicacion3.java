package com.pe.sectorcode.ejercicio5;

public class TablaMultiplicacion3 {

	public static void main(String[] args) 
	{

			int tabla    = 9;
			int contador = 0;
			
			// esta forma al menos una vez se ejecutar� sin validar la condicion.
			do
			{
				System.out.println (tabla + " x "+ contador + " = "+ (tabla*contador) );
				contador ++;
			}
			while  (contador <=12);
	}

}
