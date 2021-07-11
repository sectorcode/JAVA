package com.pe.sectorcode.service;

import com.pe.sectorcode.beans.Alumno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlumnoServiceImpl implements AlumnoService
{

  @Autowired
  Alumno alumno;



  public Alumno getAlumno()
  {
    return alumno;
  }

  public void setAlumno(Alumno alumno)
  {
    this.alumno = alumno;
  }




}
