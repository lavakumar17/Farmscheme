<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<!-- Bootstrap css and JavaScript links -->
    <%@include file="bootstrap_links.jsp" %>
</head>
<body>
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
<div class="container">
<table class="table table-bordered table-striped text-center table-responsive-md">
<tr>
<th>Crop Name</th>
<th>Quantity</th>
<th>MSP</th>
<th>Sold Price</th>
<th>Total Price</th>
</tr>
<c:forEach var="sellRequest" items="${sellRequest}" varStatus="status">
<tr>
<td>${sellRequest.cropName }</td>
<td>${sellRequest.quantity }</td>
<td>${900 }</td>
<td>${100 }</td>
<td>${100*sellRequest.quantity}</td>
</tr>
</c:forEach>
</table>
</div>
</section><br><br>
<!-- footer -->
<%@include file="footer.jsp" %>
</body>
</html>