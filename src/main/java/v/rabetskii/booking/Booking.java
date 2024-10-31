package v.rabetskii.booking;

import java.time.LocalDateTime;
import java.util.UUID;

public class Booking {
    private UUID uuid;
    private UUID userID;
    private UUID resourceID;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String status;

    public Booking(UUID userID, UUID resourceID) {
        this.uuid = UUID.randomUUID();
        this.userID = userID;
        this.resourceID = resourceID;
    }

    public UUID getID() {
        return uuid;
    }

    public UUID getUserID() {
        return userID;
    }

    public UUID getResourceID() {
        return resourceID;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public String getStatus() {
        return status;
    }

    public void setUserID(UUID userID) {
        this.userID = userID;
    }

    public void setResourceID(UUID resourceID) {
        this.resourceID = resourceID;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
