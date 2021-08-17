<%@ page import="projectFinal.FlightDao" %>
<%@ page import="projectFinal.Flight" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
 href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
 integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
 crossorigin="anonymous">
</head>
<body>
	 <div align="center"> </div>
  <h1>Your Available Flights Are : </h1>
   <%
   	FlightDao flight = (FlightDao)request.getAttribute("bookingDao");
   String source = request.getParameter("source");
   String destination = request.getParameter("destination");
    Flight flightDec = flight.printFlight(source, destination);
    out.println(flightDec.getFlight_no()+ " " + flightDec.getSource()+" "+ flightDec.getDestination());
   %> </br>
   If you want to book this flight, Please fill the information and click Book button below </br>
  <div class="container col-md-8 col-md-offset-3" style="overflow: auto">
  <form action="<%=request.getContextPath()%>/payment" method="post">
   <div class="form-group">
    <label for="uname">First Name : </label> <input type="text"
     class="form-control" id="first_name" placeholder="First Name" 
     name="first_name" required>
   </div>
   <div class="form-group">
    <label for="uname">Last Name : </label> <input type="text"
     class="form-control" id="last_name" placeholder="Last Name"
     name="last_name" required>
   </div>
   <div class="form-group">
    <label for="uname">Age : </label> <input type="text"
     class="form-control" id="age" placeholder="30"
     name="age" required>
   </div>
    <button type="submit" class="btn btn-primary">Book</button>
    </form>
 </div>
</body>
</html>