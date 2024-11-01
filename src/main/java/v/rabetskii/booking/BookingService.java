package v.rabetskii.booking;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class BookingService {
    private final Map<UUID, Booking> bookings = new HashMap<>();

    public void createBooking(Booking booking) {
        bookings.put(booking.getID(), booking);
        System.out.println("Бронирование подтверждено для пользователя" + booking.getUserID() + "на ресурс" +
                        booking.getResourceID() + "с" + booking.getStartTime() + "до" + booking.getEndTime());
    }

    public Booking getUser(UUID id) {
        return bookings.get(id);
    }

    public void updateUser(Booking booking){
        bookings.put(booking.getID(), booking);
    }

    public void deleteUser(UUID id) {
        bookings.remove(id);
    }

    public Map<UUID, Booking> getBookings() {
        return bookings;
    }

    public boolean isResourceAvailable(UUID resourceId, LocalDateTime startTime, LocalDateTime endTime) {
        for (Booking booking : bookings.values()) {
            if (booking.getID().equals(resourceId)) {
                LocalDateTime existingStart = booking.getStartTime();
                LocalDateTime existingEnd = booking.getEndTime();

                if (startTime.isBefore(existingEnd) && endTime.isAfter(existingStart)) {
                    System.out.print("На это время нельзя забронировать, ресурс уже забронирован");
                    return false;
                }
            }
        }
        return true;
    }
}
