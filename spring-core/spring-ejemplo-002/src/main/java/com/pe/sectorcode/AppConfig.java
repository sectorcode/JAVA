package com.pe.sectorcode;

import com.pe.sectorcode.beans.HolaMundo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean 
    public HolaMundo holaMundoBean() {
        return new HolaMundo();
    }
}
