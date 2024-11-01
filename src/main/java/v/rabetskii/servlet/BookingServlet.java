package v.rabetskii.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import v.rabetskii.booking.BookingService;

import java.io.IOException;

@WebServlet("/bookings")
public class BookingServlet extends HttpServlet {
    private final BookingService bookingService;

    public BookingServlet(BookingService bookingService) {
        this.bookingService = bookingService;
    }


    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setAttribute("bookings", bookingService.getBookings().values());
        request.getRequestDispatcher("/home/omnomdom/IdeaProjects/ResBook/src/main/webapp/booking.jsp").forward(request, response);
    }
}
