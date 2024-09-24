package br.com.alurafood.pagamentos.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Mateus Dantas
 */
@Configuration
public class Configuracao {
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
