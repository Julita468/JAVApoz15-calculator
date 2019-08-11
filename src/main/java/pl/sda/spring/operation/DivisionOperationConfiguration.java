package pl.sda.spring.operation;

//Klasa configuration -

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DivisionOperationConfiguration {

    private String EXCEPTION_MESSAGE = "You cannot divide by 0";


    @Bean
    DivisionOperation divisionOperation() {
        return new DivisionOperation(EXCEPTION_MESSAGE);
    }
}
