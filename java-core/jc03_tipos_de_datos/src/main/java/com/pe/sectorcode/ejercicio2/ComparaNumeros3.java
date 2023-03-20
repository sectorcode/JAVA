package com.pe.sectorcode.ejercicio2;

public class ComparaNumeros3 {

	public static void main(String[] args)
	{
		
		int A = 1;
		int B = 5;
		int C = 9;
		
		// || ---> o / or
		// && ---> y / and
		// !  ---> no / not
		//               f    y    f =f
		//     v     o         f
		///          v
		if (A > 10  || (B >10 && C>10 ))
		{
			System.out.println("Los numeros ingresados no deben ser mayores que 10");
		}
		else
		{
			if (A>B && A>C) System.out.println ("A es mayor");
			else
				if (B>A && B>C) System.out.println ("B es mayor");
				else
					System.out.println ("C es mayor");
		}

	}

}
