<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <!-- Bootstrap css and JavaScript links -->
    <%@include file="bootstrap_links.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- navbar -->

<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
      <div class="container-fluid container">
        <a class="navbar-brand" href="#">Farm Scheme</a>
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
            <!-- <li class="nav-item">
              <a class="nav-link active" aria-current="page" href="/">Home</a>
            </li> -->
          </ul>
        </div>
      </div>
    </nav><br><br>
<section>
<!-- <h3 class="text-center">Booking History</h3> -->
<div class="container">
<table class="table table-bordered table-striped text-center table-responsive-md">
<tr>
<th>Crop Type</th>
<th>Crop Name</th>
<th>Base Price</th>
<th>Current Bid</th>
</tr>
<%-- <td class="border">${user.getUserId()}</td>
<td class="border">${user.getUserName()}</td> --%>
<c:forEach var="sellRequest" items="${sellRequest}" varStatus="status">
<tr>
<td>${sellRequest.cropType }</td>
<td>${sellRequest.cropName }</td>
<td>${1000 }</td>
<td>${cBid}</td>
</tr>
</c:forEach>
</table>
</div>
</section><br><br>
<div class="container">
<form action="/bidder/bidAmount" method="post">
Bid Amount: <input type="text" placeholder="Enter bid amount" name="bidAmount"/>
<button class="btn btn-success" type="submit">Submit</button>
</form>
</div>
<br><br>
<%@include file="footer.jsp" %>
<script>
if ( window.history.replaceState ) {
  window.history.replaceState( null, null, "/bidder/dashboard.jsp" );
}
</script>
</body>
</html>