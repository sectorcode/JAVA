package com.pe.sectorcode.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("textDocumentBeanAnotation")
public class TextDocument implements Printable
{

    @Override
    public String print() {
        return "Imprimiendo desde un archivo de Texto!";
    }
    
}
