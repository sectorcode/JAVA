package com.pe.sectorcode;

import com.pe.sectorcode.beans.HolaMundo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application
{
    public static void main(String[] args) {
        
        ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");
        HolaMundo          hm         = (HolaMundo)appContext.getBean("holaMundoBean");
        System.out.println(hm.getSaludo());
        
        ((ConfigurableApplicationContext)appContext).close();
    }
}
