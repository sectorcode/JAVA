package com.pe.sectorcode.service;

import com.pe.sectorcode.beans.Printable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Service(value = "printableServiceBean")
public class PrintableService
{

  @Autowired
  @Qualifier("excelDocumentBeanAnotation")
  private Printable document;

  public PrintableService()
  {
  }

  public PrintableService(Printable document)
  {
    this.document = document;
  }

  public Printable getDocument()
  {
    return document;
  }

  public void setDocument(Printable document)
  {
    this.document = document;
  }

  public void imprimirDocumento()
  {
    System.out.println(document.print());
  }
}
