package projectFinal;

import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class confirmationDao {
	
	public Booking confirmBooking(String firstName, String lastName){
    	Transaction transaction = null;
        Booking booking = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        
            // start a transaction
            transaction = session.beginTransaction();
            // get an user object
            booking = (Booking) session.createQuery("FROM Booking U WHERE U.first_name = :firstName").setParameter("firstName", firstName)
                .uniqueResult();
            
            if (booking != null && booking.getLast_name().equals(lastName)) {
                return booking;
            }
            
            // commit transaction
            transaction.commit();
            return booking;
    }
	
}
