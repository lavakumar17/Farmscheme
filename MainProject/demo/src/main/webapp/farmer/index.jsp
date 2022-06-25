<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
   <!-- Font awesome -->
    <%@include file="fontawesome.jsp" %> 
    <!-- Bootstrap css and JavaScript links -->
    <%@include file="bootstrap_links.jsp" %>
    <!-- custom css -->
    <link href="css/index.css" rel="stylesheet"/>

    <title>Document</title>
  </head>
 
  <body>
  <%@include file="homeNavbar.jsp" %>
    <section class="bg-dark text-light p-5 pb-2 text-center text-sm-start">
      <div class="container">
        <div class="d-sm-flex">
          <div>
            <h2>
              Welcome to <span class="text-warning">Farm Scheme</span>
            </h2>
            <p class="lead my-4">A Best Place To Sell and Buy Crops</p>
            <br />
              <a class="btn btn-primary btn-lg" onclick="javascript:document.farmerDashBoardForm.submit()" name="submit">FARMER LOGIN</a>
              <form name="farmerDashBoardForm" action="/farmer/dashboard.jsp" method="post" hidden="true">
      				<input hidden type="submit" value="/farmer/dashboard.jsp" />
			</form>
          </div>
          <img
            class="img-fluid w-50 ms-auto d-none d-sm-block p-1"
            src="https://ruralmarketing.in/wp-content/uploads/2020/12/11-Most-important-government-schemes-in-agriculture-sector-2.jpg"
            alt="" />
        </div>
        <div class="w-100"></div>
        <div class="w-100"></div>
        <div class="w-100"></div>
      </div>
    </section>


    <!-- <section class="bg-primary text-white p-5 text-center text-sm-start ms-auto d-none d-xl-block" > -->
    <div class="d-md-flex fluid-container text-center p-3 bg-primary text-white text-sm-start ms-auto d-none d-xl-block">
        <!-- <div class="d-md-flex"> -->
          <h2 class="text-center" style="font-family:'Brush Script MT', cursive;">Let's experience the digital and modern agriculture and practices</h2>
        <!-- </div> -->
      </div>
    <!-- </section> -->
<div class="container p-5">
<h3 class="text-center" id="about-us">About Us</h3>
<p class="lead"><em>
	Our aim is to encourage farmers to adopt innovative and modern agricultural 
	practices. We focus on bidding of crops by bidders in different cities.
	Registered users will have access to the online marketplace where individuals can request their crops for auction and potential buyers can make
	bids. 
	A seller will request for a crop auction, specifying details of the crops including
	quantity. A seller can see current bids and log of all crops sold.
	Bidder will specify the amount they plan to invest for the bidding process, will be
	able to see the crop hosted for selling.Our team will control the entire bidding process, approve the crop to be sold and
the final bid.</em></p>
</div>
<div class="container"><h3 class="text-center" id="contact-us">Contact Us</h3></div>
<form>
<div class="d-flex justify-content-center">
<div class="form-group w-50">
<label for="exampleFormControlInput1">Email address</label>
    <input type="email" class="form-control" id="exampleFormControlInput1" placeholder="name@example.com">
    <br><label for="exampleFormControlTextarea1">Type Your Message below</label>
    <textarea class="form-control pb-5" id="exampleFormControlTextarea1" rows="3" placeholder="Enter text here"></textarea>
    <br><button class="btn btn-primary" type="submit">Submit</button>
  </div>
  <div>
  
  </div>
  </div>
  
</form>
<!-- footer -->
<%@include file="footer.jsp" %>

  </body>
</html>
