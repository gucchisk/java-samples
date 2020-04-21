package info.gucchi.java.example.springdatabind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@ConfigurationPropertiesScan
@Controller
@Component
public class SpringDataBindApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataBindApplication.class, args);
    }

}



