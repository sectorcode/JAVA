package com.pe.sectorcode;

/**
 * @Created 11/12/2021
 * @Project java-core
 * @Author Josue
 */
public class VariablesAsignar
{

  public static void main(String[] args)
  {
    /**
     * La asignacion de valores se hace por medio del signo igual '='
     * se coloca un identificador al lado derecho el signo de igualdad y el valor
     * <identificador> = <valor>;
     * <identificador1> = <identificador2>;
     */
    int identificador1 = 10;
    int identificador2 = 11;

    System.out.printf("identificador1 = %d%n", identificador1);
    System.out.printf("identificador2 = %d%n", identificador2);

    System.out.println("Si igualamos los valores de identificador1 = identificador2");
    identificador1 = identificador2;

    System.out.printf("identificador1 = %d%n", identificador1);
    System.out.printf("identificador2 = %d%n", identificador2);

  }
}
