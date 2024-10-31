package v.rabetskii.booking;

import v.rabetskii.user.User;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class BookingService {
    private final Map<UUID, Booking> bookings = new HashMap<>();

    public void createBooking(Booking booking) {
        bookings.put(booking.getID(), booking);
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
}
