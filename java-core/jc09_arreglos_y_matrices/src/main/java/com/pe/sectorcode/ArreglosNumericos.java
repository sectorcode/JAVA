package com.pe.sectorcode;

/**
 * @Created 18/03/2023
 * @Project java-core
 * @Author Josue Lopez
 */
public class ArreglosNumericos
{
	public static class Estadisticas
	{
		public int    mayor;
		public int    menor;
		public double sumatoria;
		public double promedio;
	}
	
	public static Estadisticas calcularEstadisticas(int[] arreglo)
	{
		int    mayor     = arreglo[0];
		int    menor     = arreglo[0];
		double sumatoria = 0;
		for (int i = 0; i < arreglo.length; i++)
		{
			if (mayor < arreglo[i])
				mayor = arreglo[i];
			else if (menor > arreglo[i])
				menor = arreglo[i];
			sumatoria += arreglo[i];
		}
		double       promedio = sumatoria / arreglo.length;
		Estadisticas est      = new Estadisticas();
		est.mayor = mayor;
		est.menor = menor;
		est.sumatoria = sumatoria;
		est.promedio = promedio;
		return est;
	}
	
	public static void main(String[] args)
	{
		/**
		 * Los arreglos se definen como una colección o conjunto de datos de un mismo tipo
		 * al cual se accede por medio de un índice el cual en todas las situaciones
		 * inicia en CERO '0'. Por ejemplo si declaramos un array de 10 elementos
		 * tenemos de 0 a 9.
		 */
		
		int[] arreglo = new int[10]; // se declaran 10 elementos iniciando en CERO '0'
		
		arreglo[0] = 14;
		arreglo[1] = 978;
		arreglo[2] = 1132;
		arreglo[3] = 27;
		arreglo[4] = 8;
		arreglo[5] = 150;
		arreglo[6] = 411;
		arreglo[7] = 87;
		arreglo[8] = 41;
		arreglo[9] = 78;
		
		Estadisticas stats = calcularEstadisticas(arreglo);
		for (int i = 0; i < arreglo.length; i++)
		{
			System.out.printf(" el valor para arreglo [%d] es %d %n", i, arreglo[i]);
		}
		
		System.out.println();
		System.out.printf(" el valor mayor del arreglo es %d %n", stats.mayor);
		System.out.printf(" el valor menor del arreglo es %d %n", stats.menor);
		System.out.printf(" el valor de la sumatoria del arreglo es %.0f %n", stats.sumatoria);
		System.out.printf(" el valor del promedio del arreglo es %.2f %n", stats.promedio);
	}
}

