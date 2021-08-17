# FlyAway
A JAVA-Hibernate-Maven-MySQL-jsp based project implemeting a flight booking portal

The project architecture has 5 components consisting entity, controller and DAO classes and the corresponding jsp pages. The project has a MySQL database containing 3 tables as users, flights and booking. 

Login - 

User.java -
The User class implements the users table from the database which has first name, last name, username and password columns. 

UserDao.java - 
This class implements the db connections and user authentication.

loginController.java - 
This is a servlet that handles request and response and connects with the jsp page.
Login.jsp - 
Login.jsp page has the form to enter the username and password.

2) Flight Search - 

Flight.java - 
This class implements the flights table in the database. This class has flight number, source and destination columns. 

FlightController - 
The controller class handles the servlet requests and redirects to the next jsp page.

FlightDao - 
This class implements the connections with flights table in the db as well as retrieving the flights upon entering the source and destination on the jsp page.

Login-success.jsp - 
User is redirected to this page after successful login. This page has a form with source and destination fields to search for flights.

3) Booking - 

Booking.java - 
This class implements the booking table from the db containing first name, last name and age fields. 

BookingController.java - 
This class handles the servlet requests and forwards data to the next jsp page.

BookingDao.java - 
This class connects to the booking table and pushes the user entered data to the booking table.

booking.jsp - 
Booking.jsp page shows the available flight and takes in booking data from the user in the form fields to be pushed to the booking table.




4) Payment - 

Payment.jsp - 
This jsp page takes user inputs in the form fields such as first name, last name, card number, validity date, cvv for the payment of the selected flight.

paymentProcess.java - 
This class implements the servlet that connects to the payment.jsp page and upon successful completion forwards the request to the next jsp page.

5) Confirmation - 

confirmationDao.java - 
This class implements the db connections with the booking table. It retrieves the booking data of the user from the booking table.

ConfirmationController.java - 
The controller class handles the servlet requests from the payment page, calls a method from Dao to retrieve the booking data and forwards the request to the confirmation.jsp page.

Confirmation.jsp - 
This page shows the booking confirmation upon successful payment. 


Database - 

The project uses the mysql database to implement three tables - 

1.users -
  Id (Primary Key)
  First name
  Last Name
  Username
  Password
  
2.flights - 
  Id (Primary Key)
  Flight number
  Source
  Destination
  
3.booking - 
  Id (Primary Key)
  First Name
  Last Name
  Age




