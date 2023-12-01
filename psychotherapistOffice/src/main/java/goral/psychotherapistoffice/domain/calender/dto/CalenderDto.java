package goral.psychotherapistoffice.domain.calender.dto;

public class CalenderDto {
    private Long id;
    private String dayof;
    private String time;
    private boolean free;
    private String patient;
    private String therapy;

    public CalenderDto(Long id, String dayof, String time, boolean free, String patient, String therapy) {
        this.id = id;
        this.dayof = dayof;
        this.time = time;
        this.free = free;
        this.patient = patient;
        this.therapy = therapy;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDayof() {
        return dayof;
    }

    public void setDayof(String dayof) {
        this.dayof = dayof;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public boolean isFree() {
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
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
}
