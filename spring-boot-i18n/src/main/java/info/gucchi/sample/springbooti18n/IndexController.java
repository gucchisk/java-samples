package info.gucchi.sample.springbooti18n;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Calendar;

@Controller
public class IndexController {
    @Autowired
    MessageSource messageSource;

    @GetMapping("/")
    public String index(Model model) {
        Calendar calendar = Calendar.getInstance();
        String messageKey = getMessageKey(calendar);
        String message = messageSource.getMessage(messageKey, null, LocaleContextHolder.getLocale());
        model.addAttribute("message", message);
        return "index";
    }

    private String getMessageKey(Calendar calendar) {
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        if (hour > 3 && hour < 11) {
            return "message_morning";
        } else if (hour >= 11 && hour < 19) {
            return "message_noon";
        } else {
            return "message_night";
        }
    }
}
