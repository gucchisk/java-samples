package info.gucchi.java.example.springdatabind;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    Config config;

    @Autowired
    AppController(Config config) {
        this.config = config;
    }

    @RequestMapping("/")
    public String index() {
        return config.getText();
    }
}
