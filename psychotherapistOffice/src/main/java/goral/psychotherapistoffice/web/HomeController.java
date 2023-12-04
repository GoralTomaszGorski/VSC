package goral.psychotherapistoffice.web;


import goral.psychotherapistoffice.domain.calender.CalenderService;
import goral.psychotherapistoffice.domain.calender.dto.CalenderDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {
    private final CalenderService calenderService;

    public HomeController(CalenderService calenderService){
        this.calenderService = calenderService;
    }

    @GetMapping("/")
    public String home(Model model){
        List<CalenderDto>freeTherms = calenderService.findAllFreeTherms();
        model.addAttribute("heading", "Wolne Terminy");
        model.addAttribute("description", "Wybierz odpwiedni dla Ciebie termin i zarezerwój wizytę");
        model.addAttribute("therms", freeTherms);
        return "index";
    }
}
