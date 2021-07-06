package com.pe.sectorcode.beans;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "holaMundoBean")
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
