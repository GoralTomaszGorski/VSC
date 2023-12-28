package goral.psychotherapistoffice.web;

import goral.psychotherapistoffice.domain.calender.CalenderService;
import goral.psychotherapistoffice.domain.calender.dto.CalenderDto;
import goral.psychotherapistoffice.domain.meeting.MeetingService;
import goral.psychotherapistoffice.domain.meeting.dto.MeetingDto;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;


@Controller
public class MeetingController {
    private final CalenderService calenderService;
    private final MeetingService meetingService;

    public MeetingController(CalenderService calenderService, MeetingService meetingService) {
        this.calenderService = calenderService;
        this.meetingService = meetingService;
    }


    @GetMapping("/spotkania")
    public String meeting(Model model){
        List<MeetingDto> meetingsTherms = meetingService.findAllMeetings();
        model.addAttribute("heading", "Terminy spotkań");
        model.addAttribute("description", "Sprawdz terminy spotkań");
        model.addAttribute("meetingThermsOccupied", meetingsTherms);
        return "meeting";
    }


    /*popsułem nie działa do poprawy później*/
/*    @GetMapping("/termin/{id}")
    public String getTherm(@PathVariable long id, Model model){
        CalenderDto calenderDto = calenderService.findThermById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        model.addAttribute("meeting2", calenderDto);
        return "meeting2";

    }*/




}
