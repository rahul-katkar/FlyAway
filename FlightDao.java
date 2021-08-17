package projectFinal;

import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

@SuppressWarnings("deprecation")
public class FlightDao {

    public void saveFlight(Flight flight) {
        Transaction transaction = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.save(flight);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public boolean validate(String source1, String destination1) {

        Transaction transaction = null;
        Flight flight = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            // start a transaction
            transaction = session.beginTransaction();
            // get an user object
            System.out.println(source1 + destination1);
            flight = (Flight) session.createQuery("FROM Flight U WHERE U.source = :source1").setParameter("source1", source1)
                .uniqueResult();
            
            if (flight != null && flight.getDestination().equals(destination1)) {
            	System.out.println(flight.getSource()+" "+ flight.getDestination()+" "+ flight.getFlight_no());
                return true;
            }
            
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return false;
    }
    
    public Flight printFlight(String source1, String destination1){
    	Transaction transaction = null;
        Flight flight = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        
            // start a transaction
            transaction = session.beginTransaction();
            // get an user object
            System.out.println(source1 + destination1);
            flight = (Flight) session.createQuery("FROM Flight U WHERE U.source = :source1").setParameter("source1", source1)
                .uniqueResult();
            
            if (flight != null && flight.getDestination().equals(destination1)) {
            	System.out.println(flight.getSource()+" "+ flight.getDestination()+" "+ flight.getFlight_no());
                return flight;
            }
            
            // commit transaction
            transaction.commit();
            return flight;
    }

}