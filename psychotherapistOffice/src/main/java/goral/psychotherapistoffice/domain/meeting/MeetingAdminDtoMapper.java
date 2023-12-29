package goral.psychotherapistoffice.domain.meeting;

import goral.psychotherapistoffice.domain.meeting.dto.MeetingAdminDto;


public class MeetingAdminDtoMapper {


    static MeetingAdminDto map(Meeting meetingAdmin){

        return new MeetingAdminDto(
                meetingAdmin.getId(),
                meetingAdmin.getPatient().getName()+" "+meetingAdmin.getPatient().getSurname()+" Nick: "+meetingAdmin.getPatient().getNick()+" tel. "+meetingAdmin.getPatient().getTelephone()+" rok ur.: "+ meetingAdmin.getPatient().getYearOfBrith(),
                meetingAdmin.getTherapy().getKindOfTherapy(),
                meetingAdmin.getCalender().getDayof()+" "+meetingAdmin.getCalender().getTime()
        );
    }


}
