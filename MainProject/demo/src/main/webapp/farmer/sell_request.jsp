<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- Bootstrap css and JavaScript links -->
    <%@include file="bootstrap_links.jsp" %>
</head>
<body class="align-items-ceter">
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
    </nav>

<%-- <%@include file="navbar.jsp" %><br><br> --%>
<h3 class="text-center text-danger pt-2">Place Sell Request</h3>
<h4 class="text-success text-center">${success }</h4>
<h4 class="text-danger text-center">${failed }</h4>
<div class="container w-50 cjustify-content-center bg-primary text-white p-5">
<form action="/farmer/sellRequest" method="post">

<div class="p-3">
<span class="form-label"><h4>Crop Type</h4></span>
<input class="form-control" type="text" name="cropType" required placeholder="Enter Crop Type">
</div>
<div class="p-3">
<span class="form-label pt-3"><h4>Crop Name</h4></span>
<input class="form-control" type="text" name="cropName" required placeholder="Enter Crop Name">
</div>

<div class="p-3">
<span class="form-label pt-3"><h4>Fertilizer Type</h4></span>
<input class="form-control" type="text" name="fertilizerType" required placeholder="Enter Fertilizer Type">
</div>

<div class="p-3">
<span class="form-label pt-3"><h4>Quatity</h4></span>
<input class="form-control" type="text" name="quantity" required placeholder="Enter Quatity">
</div>

<div class="p-3">
<span class="form-label pt-3"><h4>Soil pH Certificate</h4></span>
<input class="form-control" type="text" name="soilPhCertificate" required placeholder="Enter Quatity">
</div>

<div class="d-flex justify-content-center pt-3">
<button class="btn btn-success" type="submit">Place Request</button>
</div>
</form>
</div><br><br>
<!-- </div> -->

<!-- footer -->
<%@include file="footer.jsp" %>
</body>
</html>