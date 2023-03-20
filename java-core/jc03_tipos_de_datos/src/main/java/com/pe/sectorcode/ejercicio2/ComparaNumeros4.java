package com.pe.sectorcode.ejercicio2;


/**
 * Comparar 5 numeros obtener el mayor, el menor y el promedio de los numeros restantes.
 * @author Josue
 *
 */
public class ComparaNumeros4 {

	
	
	public static void main(String[] args) 
	{
		
		int A = 7;
		int B = 45;
		int C = 1600;
		int D = 32;
		int E = 110;
		
		int mayor = 0;
		int menor = 0;
		int aux   = 0;
		
		if (A > B && A > C && A > D && A > E)
		{
			mayor = A;
			aux  = B + C + D + E;
		}
		else if (B > A && B > C && B > D && B > E)
		{
			mayor = B;
			aux  = A + C + D + E;
		}
		else if (C > A && C > B && C > D && C > E)
		{
			mayor = C;
			aux  = A + B + D + E;
		}
		else if (D > A && D > B && D > C && D > E)
		{
			mayor = D;
			aux  = A + B + C + E;
		}
		else
		{
			mayor = E;
			aux  = A + B + C + D;
		}
		
		
		System.out.println ("Mayor "+ mayor);
		
		
		if (A < B && A < C && A < D && A < E)
			menor = A;
		else if (B < A && B < C && B < D && B < E)
			menor = B;
		else if (C < A && C < B && C < D && C < E) 
			menor = C;
		else if (D < A && D < B && D < C && D < E) 
			menor = D;
		else
			menor = E;
		
		aux = ( aux - menor ) / 3;
		
		System.out.println ("Menor "+ menor);	
		
		System.out.println ("Promedio variables resto "+ aux);	
		
	}

}
