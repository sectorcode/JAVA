package com.pe.sectorcode;

/**
 * @Created 11/12/2021
 * @Project java-core
 * @Author Josue
 */
public class VariablesNumericas
{
  public static void main(String[] args)
  {
    /**
     * Una variable es un elemento en memoria que contiene información de forma temporal
     * este puede cambiar durante el flujo de un programa
     */
    int    a = 10;
    double b = 10.76;
    float  c = 10.76537f;

    System.out.printf("El valor a = %d  b=%.2f  c=%f%n", a, b, c);

    // luego de cambiar los valores de las variables.
    a = 11;
    b = 11.76;
    c = 11.76537f;
    System.out.printf("El valor a = %d  b=%.2f  c=%f", a, b, c);
  }
}
