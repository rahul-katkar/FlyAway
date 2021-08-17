package projectFinal;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/booking")
public class FlightController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private FlightDao bookingDao;

    public void init() {
    	bookingDao = new FlightDao();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.sendRedirect("login-success.jsp");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        try {
            authenticate(request, response);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private void authenticate(HttpServletRequest request, HttpServletResponse response)
    throws Exception {
        String source = request.getParameter("source");
        String destination = request.getParameter("destination");

        if (bookingDao.validate(source, destination)) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("booking.jsp");
            request.setAttribute("bookingDao", bookingDao);
            dispatcher.forward(request, response);
        } else {
            throw new Exception("Flights not found..");
        }
    }
}
