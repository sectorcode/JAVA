package com.pe.sectorcode;

import com.pe.sectorcode.beans.HolaMundo;
import com.pe.sectorcode.service.PrintableService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application
{

  public static void main(String[] args)
  {

    ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
    HolaMundo          hm         = (HolaMundo) appContext.getBean("holaMundoBean");
    System.out.println(hm.getSaludo());
    HolaMundo hm2 = (HolaMundo) appContext.getBean("holaMundoBean");
    hm.setSaludo("Segundo saludo");
    System.out.println(hm2.getSaludo());
    System.out.println("--- posiciones de memoria ---");
    System.out.println(hm + " - " + hm2);
    System.out.println("El valor de hm es ahora " + hm.getSaludo());
    System.out.println("El valor de hm2 es ahora " + hm2.getSaludo());

    PrintableService is = (PrintableService) appContext.getBean("printableServiceBean");
    is.imprimirDocumento();

    ((ConfigurableApplicationContext) appContext).close();
  }

}
