package TrainerReservation;

public class ReservationApproved extends AbstractEvent {

    private Long id;
    private Long trainerID;
    private String status;
    private String reservationDate;
    private Long reservationID;

    public Long getId() {
        return trainerID;
    }

    public void setId(Long trainerID) {
        this.trainerID = trainerID;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public String getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(String reservationDate) {
        this.reservationDate = reservationDate;
    }
    public Long getReservationId() {
        return reservationID;
    }

    public void setReservationId(Long reservationID) {
        this.reservationID = reservationID;
    }
}