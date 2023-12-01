package goral.psychotherapistoffice.domain.calender;


import goral.psychotherapistoffice.domain.calender.dto.CalenderDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalenderService {
    public final CalenderRepository calenderRepository;

    public CalenderService(CalenderRepository calenderRepository) {
        this.calenderRepository = calenderRepository;
    }

    public List<CalenderDto>findAllFreeTherms(){
        return calenderRepository.findAllByFreeIsTrue().stream()
                .map(CalenderDtoMapper::map).toList();
    }
}
