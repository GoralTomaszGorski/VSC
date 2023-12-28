package goral.psychotherapistoffice.domain.meeting;


import goral.psychotherapistoffice.domain.meeting.dto.MeetingDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MeetingService {

    public MeetingRepository meetingRepository;


    public MeetingService(MeetingRepository meetingRepository) {
        this.meetingRepository = meetingRepository;
    }


    public List<MeetingDto>findAllMeetings(){
        return meetingRepository.findAll()
                .stream()
                .map(MeetingDtoMapper::map)
                .toList();
    }

    public Optional<MeetingDto>findMeetingById(Long id){
        return meetingRepository.findById(id).map(MeetingDtoMapper::map);
    }





}
