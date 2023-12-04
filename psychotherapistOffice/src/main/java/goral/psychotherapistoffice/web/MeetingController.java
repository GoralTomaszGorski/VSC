package goral.psychotherapistoffice.web;

import goral.psychotherapistoffice.domain.calender.CalenderService;
import goral.psychotherapistoffice.domain.calender.dto.CalenderDto;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Controller
public class MeetingController {
    private final CalenderService calenderService;

    public MeetingController(CalenderService calenderService) {
        this.calenderService = calenderService;
    }


    @GetMapping("/termin/{id}")
    public String getTherm(@PathVariable long id, Model model){
        CalenderDto calenderDto = calenderService.findThermById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        model.addAttribute("meeting", calenderDto);
        return "meeting";

    }
}
