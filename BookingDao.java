package projectFinal;

import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

@SuppressWarnings("deprecation")
public class BookingDao {

    public void saveBooking(Booking booking) {
        Transaction transaction = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.save(booking);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}