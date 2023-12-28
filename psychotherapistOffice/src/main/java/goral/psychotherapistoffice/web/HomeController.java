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
    public String therms(Model model){
        List<CalenderDto>allTherms = calenderService.findAllTherms();
        model.addAttribute("headingAllTherm", "Kalendarz spotkań");
        model.addAttribute("descriptionAllTherms", "Wszystkie spotkania - czas pracy gabinetu");
        model.addAttribute("alltherms", allTherms);
        return "index";
    }





}
