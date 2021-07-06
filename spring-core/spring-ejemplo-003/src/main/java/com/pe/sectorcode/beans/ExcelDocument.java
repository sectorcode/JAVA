package com.pe.sectorcode.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Component
@Qualifier("excelDocumentBeanAnotation")
public class ExcelDocument implements Printable
{

  @PostConstruct
  public void iniciar()
  {
    System.out.println("Iniciando la construcción del bean");
  }

  @PreDestroy
  public void destruir()
  {
    System.out.println("Destruyendo la instancia creada");
  }

  @Override
  public String print()
  {
    return "Imprimiendo desde un archivo de Excel!";
  }

}
