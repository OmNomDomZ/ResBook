package v.rabetskii;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public class Booking {
    private UUID uuid;
    private UUID userID;
    private UUID resourceID;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String status;

    public void createBooking(UUID userID, UUID resourceID) {
        this.uuid = UUID.randomUUID();
        this.userID = userID;
        this.resourceID = resourceID;
    }

    public void getBooking(UUID uuid){

    }




}
