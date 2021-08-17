package projectFinal;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class confirmationController {

	@WebServlet("/confirmation")
	public class BookingController extends HttpServlet {
	    private static final long serialVersionUID = 1L;
	    private confirmationDao confirm;

	    public void init() {
	    	confirm = new confirmationDao();
	    }

	    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	        response.sendRedirect("confirmation.jsp");
	    }

	    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	        try {
	            confirmFlight(request, response);
	        } catch (Exception e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	    }

	    
		private void confirmFlight(HttpServletRequest request, HttpServletResponse response)
	    throws Exception {
	        
	    	Booking booking = new Booking();
	    	String first_name = request.getParameter("f_name");
	        String last_name = request.getParameter("l_name");
	        System.out.println(first_name+ " " + last_name);
	       booking = confirm.confirmBooking(first_name, last_name); 
	            RequestDispatcher dispatcher = request.getRequestDispatcher("confirmation.jsp");
	            request.setAttribute("confirm", booking);
	            dispatcher.forward(request, response);
	}
}
}
