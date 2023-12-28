package goral.psychotherapistoffice.domain.meeting;

import goral.psychotherapistoffice.domain.meeting.dto.MeetingDto;

public class MeetingDtoMapper {
    static MeetingDto map(Meeting meeting){

        return new MeetingDto(
                meeting.getId(),
                meeting.getPatient().getName()+" "+meeting.getPatient().getSurname()+" Nick: "+meeting.getPatient().getNick(),
                meeting.getTherapy().getKindOfTherapy(),
                meeting.getCalender().getDayof()+" "+meeting.getCalender().getTime()
        );
    }


}
