package TrainerReservation;

public class ReservationRequested extends AbstractEvent {

    private Long id;
    private Long trainerID;
    private String userName;
    private String reservationDate;
    private Long reservationID;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getTrainerId() {
        return trainerID;
    }

    public void setTrainerId(Long trainerID) {
        this.trainerID = trainerID;
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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