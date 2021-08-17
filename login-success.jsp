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
 <!-- <div align="center">
  <h1>You have logged in successfully</h1>
 </div> -->
 <div class="container col-md-8 col-md-offset-3" style="overflow: auto">
  <h1>Please Enter Following Details to Search Your Flight</h1>
  <form action="<%=request.getContextPath()%>/booking" method="post">
   <div class="form-group">
    <label for="uname">Source : </label> <input type="text"
     class="form-control" id="source" placeholder="Source"
     name="source" required>
   </div>
   <div class="form-group">
    <label for="uname">Destination : </label> <input type="text"
     class="form-control" id="destination" placeholder="Destination"
     name="destination" required>
   </div>
   <button type="submit" class="btn btn-primary">Search</button>
  </form>
 </div>
</body>
</html>