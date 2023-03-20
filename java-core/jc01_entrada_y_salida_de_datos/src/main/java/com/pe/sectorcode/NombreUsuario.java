package com.pe.sectorcode;

import java.util.Scanner;

/**
 * @Author Josue Lopez
 */
public class NombreUsuario
{
  public static void main(String[] args)
  {
    System.out.print("Ingrese su nombre :");
    Scanner scanner = new Scanner(System.in);
    String nombre = scanner.nextLine();
    System.out.printf("Su nombre es %s", nombre);
  }
}
