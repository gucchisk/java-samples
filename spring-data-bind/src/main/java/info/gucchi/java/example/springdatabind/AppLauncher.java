package info.gucchi.java.example.springdatabind;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppLauncher implements CommandLineRunner {

    @Autowired
    Config config;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(config.getText());
    }
}