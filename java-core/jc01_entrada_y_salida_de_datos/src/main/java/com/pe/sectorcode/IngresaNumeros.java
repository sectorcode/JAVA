package com.pe.sectorcode;

import java.util.Scanner;

/**
 * @Author Josue Lopez
 */
public class IngresaNumeros
{
  public static void main(String[] args)
  {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese un numero entero :");
    int entero = scanner.nextInt();
    System.out.print("Ingrese un numero flotante :");
    float flotante = scanner.nextFloat();
    System.out.print("Ingrese un numero decimal :");
    double decimal = scanner.nextDouble();

    System.out.printf("Entero es %d\n", entero);
    System.out.printf("Flotante es %.5f\n", flotante);
    System.out.printf("Decimal es %.3f\n", decimal);
  }
}
