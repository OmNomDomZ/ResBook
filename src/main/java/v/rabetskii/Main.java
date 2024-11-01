package v.rabetskii;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import v.rabetskii.booking.Booking;
import v.rabetskii.booking.BookingService;
import v.rabetskii.resource.Resource;
import v.rabetskii.resource.ResourceService;
import v.rabetskii.servlet.BookingServlet;
import v.rabetskii.user.User;
import v.rabetskii.user.UserService;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) throws Exception {
        UserService userService = new UserService();
        ResourceService resourceService = new ResourceService();
        BookingService bookingService = new BookingService();

        User user1 = new User("Alice", "alice@example.com", "client");
        User user2 = new User("Bob", "bob@example.com", "client");
        User user3 = new User("Charlie", "charlie@example.com", "admin");

        userService.createUser(user1);
        userService.createUser(user2);
        userService.createUser(user3);

        Resource resource1 = new Resource("Meeting Room");
        Resource resource2 = new Resource("Projector");
        Resource resource3 = new Resource("Laptop");

        resourceService.createResource(resource1);
        resourceService.createResource(resource2);
        resourceService.createResource(resource3);

        Booking booking1 = new Booking(user1.getID(), resource1.getID());
        booking1.setStartTime(LocalDateTime.now().plusHours(1));
        booking1.setEndTime(LocalDateTime.now().plusHours(2));
        booking1.setStatus("Confirmed");

        Booking booking2 = new Booking(user2.getID(), resource2.getID());
        booking2.setStartTime(LocalDateTime.now().plusDays(1));
        booking2.setEndTime(LocalDateTime.now().plusDays(1).plusHours(3));
        booking2.setStatus("Pending");

        Booking booking3 = new Booking(user3.getID(), resource3.getID());
        booking3.setStartTime(LocalDateTime.now().plusDays(2));
        booking3.setEndTime(LocalDateTime.now().plusDays(2).plusHours(4));
        booking3.setStatus("Confirmed");

        bookingService.createBooking(booking1);
        bookingService.createBooking(booking2);
        bookingService.createBooking(booking3);



        Server server = new Server(8080);
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.setContextPath("/");
        context.setResourceBase("src/main/webapp");

        context.addServlet(new ServletHolder(new BookingServlet(bookingService)), "/bookings");

        server.setHandler(context);
        server.start();
        server.join();
    }
}