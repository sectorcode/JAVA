package com.pe.sectorcode.beans;

import org.springframework.stereotype.Component;

@Component
public class AlumnoImpl implements Alumno
{
  String nombres;
  String dni;

  @Override
  public String getNombres()
  {
    return nombres;
  }

  @Override
  public void setNombres(String nombres)
  {
    this.nombres = nombres;
  }

  @Override
  public String getDni()
  {
    return dni;
  }

  @Override
  public void setDni(String dni)
  {
    this.dni = dni;
  }

  @Override
  public String toString()
  {
    return nombres;
  }
}
