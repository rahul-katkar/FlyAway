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
  <h1>Please Enter Your Card Details to Complete the Payment</h1>
  <form action="<%=request.getContextPath()%>/paymentProcess" method="post">
   
   <div class="form-group">
    <label for="uname">First Name : </label> <input type="text"
     class="form-control" id="f_name" placeholder="John"
     name="f_name" required>
   </div>
   <div class="form-group">
    <label for="uname">Last Name : </label> <input type="text"
     class="form-control" id="l_name" placeholder="Doe"
     name="l_name" required>
   </div>
   <div class="form-group">
    <label for="uname">Enter Card Number :  </label> <input type="text"
     class="form-control" id="card_no" placeholder="xxxx xxxx xxxx xxxx"
     name="card_no" required>
   </div>
   <div class="form-group">
    <label for="uname">Card Valid Till  </label> <input type="text"
     class="form-control" id="exp_date" placeholder="mm/yy"
     name="exp_date" required>
   </div>
   <div class="form-group">
    <label for="uname">CVV  </label> <input type="password"
     class="form-control" id="cvv" placeholder="cvv"
     name="cvv" required>
   </div>
   <button type="submit" class="btn btn-primary">Pay</button>
  </form>
 </div>
</body>
</html>