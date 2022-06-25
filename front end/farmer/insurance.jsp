<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Font awesome -->
    <%@include file="../fontawesome.jsp" %>
    <!-- BootStrap css and JavaScript links -->
    <%@include file="bootstrap_links.jsp" %>
    <title>Document</title>
    <!-- custom stylesheet -->
    <link href="../css/dashboard.css" rel="stylesheet"/>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
    <div class="container-fluid container">
      <button class="navbar-toggler-icon btn btn-default" id="menu-toggle"></a></button>
      <a class="navbar-brand pl-3" href="">Farm Scheme</a>
      <button
        class="navbar-toggler"
        type="button"
        data-bs-toggle="collapse"
        data-bs-target="#navbarNavDropdown"
        aria-controls="navbarNavDropdown"
        aria-expanded="false"
        aria-label="Toggle navigation"
      >
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarNavDropdown">
        <ul class="navbar-nav ms-auto">
          <li class="nav-item">
            <a class="nav-link active" aria-current="page" href="/receptionist/dashboard">Home</a>
          </li>
          <li class="nav-item">
            <a class="nav-link active" href="/receptionist/availableRooms">Bidding</a>
          </li>
          <!-- <li class="nav-item">
            <a class="nav-link" href="#">Features</a>
          </li> -->
          <!-- <li class="nav-item active">
            <a class="nav-link" href="/farmer/insurance">Insurance Claim</a>
          </li> -->
          <li>
            <div class="d-sm-flex pl-2">
              <div class="d-none d-md-block">
                <img src="http://randomuser.me/api/portraits/men/12.jpg" class="rounded-circle d-none d-md-block" alt="" style="overflow: hidden; width: 40px; height: 40px;">
              </div>
              <a class="nav-link" href="#">
                   ${rname}
              </a>
          </li>
          <li>
            <a href="/logout" class="nav-link active">Logout</a>
<!--             <form name="logoutForm" action="/logout" method="post" hidden="true">
      				<input hidden type="submit" value="/Logout"/>
			</form>  -->
          </li>
        </ul>
      </div>
    </div>
  </nav>
<br><br>
<div class="container p-5">
          <div class="row">
            <div class="d-md-flex justify-content-center pb-5">
              <div class="col-md-4 col-xl-4">
                <div class="card bg-info order-card">
                  <div class="card-block d-none d-md-block">
                    <span><i class="fas fa-shield-alt p-5 pb-1 text-center w-100" style="font-size: 40px;"></i></span>
                  </div>
                  <a class="btn btn-info" href="/farmer/insurance_reg.jsp" role="button"><h3>Apply for Insurance</h3></a>
                <form name="insuranceForm" action="/farmer/insurance_apply" hidden="true" method="get">
      				<input hidden type="submit" value=""/></form>
                </div>
              </div>

              <div class="col-md-4 col-xl-4">
                <div class="card bg-warning order-card">
                  <div class="card-block d-none d-md-block">
                    <span><i class="fas fa-shield-alt p-5 pb-1 text-center w-100" style="font-size: 40px;"></i></span>
                  </div>
                  <a class="btn btn-warning" href="javascript:document.insuranceClaimForm.submit()" role="button"><h3>Claim Insurance</h3></a>
                  <form name="insuranceClaimForm" action="/farmer/insuranceClaim" hidden="true" method="get">
      				<input hidden type="submit" value=""/></form>
                </div>
              </div>
              </div>
              </div>
              </div><br><br>
              <!-- footer -->
<%@include file="footer.jsp" %>
</body>
</html>