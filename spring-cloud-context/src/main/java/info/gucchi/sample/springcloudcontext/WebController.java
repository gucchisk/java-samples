package info.gucchi.sample.springcloudcontext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
    Logger logger = LoggerFactory.getLogger(WebController.class);

    @RequestMapping("/")
    public String get() {
        logger.info("index");
        return "hello";
    }
}
