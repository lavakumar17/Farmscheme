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
<h3 class="text-center text-danger pt-2">Insurance</h3>
<h4 class="text-success text-center">${success }</h4>
<h4 class="text-danger text-center">${failed }</h4>
<div class="container w-50 cjustify-content-center bg-primary text-white p-5">
<form action="/farmer/insuranceForm" method="post">

<div class="p-3">
<span class="form-label"><h4>Season</h4></span>
<input class="form-control" type="text" name="season" required placeholder="Enter Crop Type">
</div>
<div class="p-3">
<span class="form-label pt-3"><h4>Year</h4></span>
<input class="form-control" type="text" name="year" required placeholder="Enter Crop Name">
</div>

<div class="p-3">
<span class="form-label pt-3"><h4>Crop</h4></span>
<input class="form-control" type="text" name="crop" required placeholder="Enter Fertilizer Type">
</div>

<div class="p-3">
<span class="form-label pt-3"><h4>Sum Insured</h4></span>
<input class="form-control" type="text" name="sumInsured" required placeholder="Enter Quatity">
</div>

<div class="p-3">
<span class="form-label pt-3"><h4>Area</h4></span>
<input class="form-control" type="text" name="area" required placeholder="Enter Quatity">
</div>

<div class="d-flex justify-content-center pt-3">
<div class="w-50">
<button class="btn btn-success" type="submit">Reset</button>
</div>
<div>
<button class="btn btn-success" type="submit">Calculate</button>
</div>
</div>
</form>
</div><br><br>
<section>
<!-- <h3 class="text-center">Booking History</h3> -->
<div class="container">
<table class="table table-bordered table-striped text-center table-responsive-md">
<tr>
<th>Insurance Company</th>
<th>Sum Insured(per Hectare)</th>
<th>Share Premium</th>
<th>Premium Amount</th>
<th>Crop Name</th>
<th>Area</th>
<th>Sum Insured</th>
</tr>
<%-- <td class="border">${user.getUserId()}</td>
<td class="border">${user.getUserName()}</td> --%>
<%-- <c:forEach var="history" items="${bookingHistory}" varStatus="status"> --%>
<tr>
<td>${insurance.company }</td>
<td>${insurance.sumInsuredPH }</td>
<td>${insurance.sharePremium }</td>
<td>${insurance.premiumAmount }</td>
<td>${insurance.crop}</td>
<td>${insurance.area }</td>
<td>${insurance.sumInsured }</td>
</tr>
<!-- </c:forEach> -->
</table>
<button class="btn btn-success" type="submit" onclick="javascript:document.insuranceApplyForm.submit()">Apply</button>
</div>
</section><br><br>
<div class="d-flex justify-content-center">
<form name="insuranceApplyForm" action="/farmer/insurance_apply" hidden="true" method="post">
      				<input hidden value=${insurance.company }/>
      				<input hidden value=${insurance.sumInsuredPH }/>
      				<input hidden value=${insurance.sharePremium }/>
      				<input hidden value=${insurance.premiumAmount }/>
      				<input hidden value=${insurance.crop }/>
      				<input hidden value=${insurance.area }/>
      				<input hidden value=${insurance.sumInsured }/>
</form>
</div><br><br>

<!-- </div> -->





<script>
if ( window.history.replaceState ) {
  window.history.replaceState( null, null, "/farmer/insurance.jsp" );
}
</script>

<!-- footer -->
<%@include file="footer.jsp" %>
</body>
</html>