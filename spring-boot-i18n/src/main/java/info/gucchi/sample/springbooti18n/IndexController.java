package info.gucchi.sample.springbooti18n;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @Autowired
    MessageSource messageSource;

    @GetMapping("/")
    public String index(Model model) {
        String message = messageSource.getMessage("message", null, LocaleContextHolder.getLocale());
        model.addAttribute("message", message);
        return "index";
    }
}
