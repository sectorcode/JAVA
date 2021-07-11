package com.pe.sectorcode;

import com.pe.sectorcode.beans.Alumno;
import com.pe.sectorcode.service.AlumnoService;
import com.pe.sectorcode.service.AlumnoServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Uso de Autowire para la inyeccion de dependencias.
 */
public class Application
{

  public static void main(String[] args)
  {
    ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);


    Alumno alumno = (Alumno) appContext.getBean("alumnoImpl");
    alumno.setDni("12345678");
    alumno.setNombres("Juan Perez");

    System.out.println(alumno.toString());

    //Se observa que retorno del alumno en la variable alumno2
    AlumnoServiceImpl alumnoService =  (AlumnoServiceImpl) appContext.getBean("alumnoServiceImpl");
    Alumno alumno2 = alumnoService.getAlumno();

    System.out.println(alumno2.toString());

    ((ConfigurableApplicationContext) appContext).close();
  }

}
