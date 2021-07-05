package com.pe.sectorcode.beans;

import org.springframework.beans.factory.annotation.Value;

public class HolaMundo
{
  @Value("Hola Mundo !!!")
  private String saludo;

  public String getSaludo()
  {
    return saludo;
  }
  public void setSaludo(String saludo)
  {
    this.saludo = saludo;
  }
}
