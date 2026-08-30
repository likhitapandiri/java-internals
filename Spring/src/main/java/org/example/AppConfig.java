package org.example;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.example")
@PropertySource(
        "classpath:application.properties"
) //annotation to get the place from where properties come from
public class AppConfig {

}


