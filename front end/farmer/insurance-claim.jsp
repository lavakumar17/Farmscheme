<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
        <a class="navbar-brand" href="#">Form Scheme</a>
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
<h3 class="text-center text-danger pt-2">Insurance Claim Form</h3>
<h4 class="text-success text-center">${success }</h4>
<h4 class="text-danger text-center">${failed }</h4>
<div class="container w-50 cjustify-content-center bg-primary text-white p-5">
<form action="/farmer/insuranceClaim" method="post">

<div class="p-3">
<h4 class="text-center text-warning">Particulars of Insuree</h4>
<span class="form-label"><h4>Policy No</h4>
<input class="form-control" type="text" name="serviceName" required placeholder="Enter Crop Type">
</div>
<div class="p-3">
<span class="form-label pt-3"><h4>Insurance Company</h4></span>
<input class="form-control" type="text" name="price" required placeholder="Enter Crop Name">
</div>

<div class="p-3">
<span class="form-label pt-3"><h4>Name of Insuree</h4></span>
<input class="form-control" type="text" name="price" required placeholder="Enter Fertilizer Type">
</div>

<div class="p-3">
<span class="form-label pt-3"><h4>Sum Insured</h4></span>
<input class="form-control" type="text" name="price" required placeholder="Enter Sum Insured">
</div>

<div class="p-3">
<h4 class="text-center text-warning">Details of Cause of Loss</h4>
<span class="form-label pt-3"><h4>Cause for Loss</h4></span>
<input class="form-control" type="text" name="price" required placeholder="Enter Cause for Loss">
</div>

<div class="p-3">
<span class="form-label pt-3"><h4>Date of Loss (YYYY-MM-DD)</h4></span>
<input class="form-control" type="text" name="price" required placeholder="Enter Details of loss">
</div>

<div class="p-3">
<span class="form-label pt-3"><h4>Supporting Documents</h4></span>
<input class="form-control" type="text" name="price" required placeholder="Supporting Docs">
</div>

<div class="d-flex justify-content-center pt-3">
<div class="w-50">
<button class="btn btn-success" type="submit">Reset</button>
</div>
<div>
<button class="btn btn-success" type="submit">Submit</button>
</div>
</div>
</form>
</div><br><br>
<!-- footer -->
<%@include file="footer.jsp" %>

<script>
if ( window.history.replaceState ) {
  window.history.replaceState( null, null, "/farmer/insurance.jsp" );
}
</script>
</body>
</html>