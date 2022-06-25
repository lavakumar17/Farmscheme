<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
      <button class="navbar-toggler-icon btn btn-default" id="menu-toggle"><a href="#menu-toggle"></a></button>
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
            <a class="nav-link" href="/receptionist/availableRooms">Bidding</a>
          </li>
          <!-- <li class="nav-item">
            <a class="nav-link" href="#">Features</a>
          </li> -->
<!--           <li class="nav-item">
            <a class="nav-link" href="/receptionist/pricing">Insurance</a>
          </li> -->
          <li>
            <div class="d-sm-flex pl-2">
              <div class="d-none d-md-block">
                <!-- <img src="http://randomuser.me/api/portraits/men/12.jpg" class="rounded-circle d-none d-md-block" alt="" style="overflow: hidden; width: 40px; height: 40px;"> -->
              </div>
              <a class="nav-link" href="#">
                   ${rname}
              </a>
          </li>
          <li>
            <a href="/logout" class="nav-link">Logout</a>
<!--             <form name="logoutForm" action="/logout" method="post" hidden="true">
      				<input hidden type="submit" value="/Logout"/>
			</form>  -->
          </li>
        </ul>
      </div>
    </div>
  </nav>
<br><br>
    <div id="wrapper" class="toggled">

        <!-- Sidebar -->
        <div id="sidebar-wrapper">
            <ul class="sidebar-nav">
                <li class="sidebar-brand">
                  <!-- <div class="container"> -->
                    <div class="d-sm-flex">
                    <div class="d-none d-sm-block">
                      <i class="fa fa-user-circle-o text-warning pt-3" aria-hidden="true" style="font-size:30px;"></i>
                </div>
                    <a href="#">
                        ${rname}
                    </a>
                  </div>
                <!-- </div> -->
                </li>
                <li>
                    <a href="/receptionist/dashboard.jsp">Dashboard</a>
                </li>
                <li>
                    <a href="javascript:document.bookRoomForm.submit()">Place Bid</a>
                    
                </li>
                <li>
                    <a href="javascript:document.bookingInfoForm.submit()">Purchase History</a>
                </li>
                <li>
                  <a href="javascript:document.checkBillForm.submit()">View Market Place</a>
              </li>
                <li>
                  <a href="/logout">Logout</a>
                </li>
            </ul>
        </div>
        
        <!-- /#sidebar-wrapper -->
        <br><br>
        <div class="container">
          <div class="row">
            <div class="d-md-flex justify-content-center pb-5">
              <div class="col-md-4 col-xl-4">
                <div class="card bg-info order-card">
                  <div class="card-block d-none d-md-block">
                    <!-- <i class="fas fa-bullhorn p-5 pb-1 fa-3x text-center w-100"></i> -->
                  </div>
                  <a class="btn btn-info" href="javascript:document.bidderDashboard.submit()" role="button"><h3>Welcome</h3></a>
                <form name="bidderDashboard" action="/bidder/bidAmount" hidden="true" method="get">
      				<input hidden type="submit" value=""/></form>
                </div>
              </div>
              </div>
              </div>
              </div>

<br><br>
<!-- Footer -->
<%@include file="footer.jsp" %>
<script>
if ( window.history.replaceState ) {
  window.history.replaceState( null, null, "/bidder/dashboard.jsp" );
}
</script>
</body>
</html>