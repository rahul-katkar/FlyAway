package projectFinal;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/payment")
public class BookingController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private BookingDao bookingDao;

    public void init() {
    	bookingDao = new BookingDao();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.sendRedirect("booking.jsp");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        try {
            confirm(request, response);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    
	private void confirm(HttpServletRequest request, HttpServletResponse response)
    throws Exception {
        
    	Booking booking = new Booking();
    	System.out.println(request.getParameter("first_name"));
    	booking.setFirst_name(request.getParameter("first_name"));
    	booking.setLast_name(request.getParameter("last_name"));
    	booking.setAge(request.getParameter("age"));
    	System.out.println(booking);
    	bookingDao.saveBooking(booking);

            RequestDispatcher dispatcher = request.getRequestDispatcher("payment.jsp");
            dispatcher.forward(request, response);
    }
}
