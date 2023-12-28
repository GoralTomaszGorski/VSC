package goral.psychotherapistoffice.domain.meeting.dto;

public class MeetingDto {
    private Long id;
    private String patient;
    private String therapy;
    private String calender;


    public MeetingDto(Long id, String patient, String therapy, String calender) {
        this.id = id;
        this.patient = patient;
        this.therapy = therapy;
        this.calender = calender;
    }

    public MeetingDto(Long id, String name, String surname) {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getPatient() {
        return patient;
    }

    public void setPatient(String patient) {
        this.patient = patient;
    }

    public String getTherapy() {
        return therapy;
    }

    public void setTherapy(String therapy) {
        this.therapy = therapy;
    }

    public String getCalender() {
        return calender;
    }

    public void setCalender(String calender) {
        this.calender = calender;
    }
}
