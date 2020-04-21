package info.gucchi.java.example.springdatabind;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConstructorBinding
@ConfigurationProperties(prefix = "app")
public class Config {
    private String text;
    Config(String text) {
        this.text = text;
    }
    String getText() {
        return text;
    }
}