<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <!-- Font awesome -->
    <%@include file="fontawesome.jsp" %>
 <!-- BootStrap css and JavaScript links -->
    <%@include file="bootstrap_links.jsp" %>
<title>Insert title here</title>
<style>  
h4 
{  
text-indent: 1em;  
}  
.tab1 {   
            tab-size: 2;   
        }  
</style> 
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
    </nav>
<br><br>
<div class="container bg-primary p-5 text-light">
<form action="/customer/updateCustomerProfile" method="post">
<div class="p-1">
<h4><span><label>Crop Type&emsp;&emsp;&emsp;&ensp;&nbsp;&ensp;&nbsp;&ensp;&nbsp;:</label> Winter
</span></h4>
</div>
<div class="p-1">
<h4><span><label>Crop Name&ensp;&nbsp;&ensp;&nbsp;&ensp;&nbsp;:</label> Padi
</span></h4>
</div>
<div class="p-1">
<h4><span><label>Base Price&emsp;&emsp;&ensp;&nbsp;&ensp;&nbsp;:</label> 10000
</span></h4>
</div>
<div class="p-1">
<h4><label>Current Bid Amount&emsp;&emsp;&ensp;&nbsp;&ensp;&nbsp;:</label>10200</h4>
</div>
<div class="p-1">
<h4><label>Previous Bids&nbsp;&ensp;&nbsp;&ensp;&nbsp;:</label> 10050</h4>
</div>
<div class="p-1">
<h4><label>Previous Bids&nbsp;&ensp;&nbsp;&ensp;&nbsp;:</label> 10100</h4>
</div>
<div class="p-1">
<h4><label>Previous Bids&nbsp;&ensp;&nbsp;&ensp;&nbsp;:</label> 10150</h4>
</div>
</form>
</div>
<br><br>
<%@include file="footer.jsp" %>
<script>
if ( window.history.replaceState ) {
  window.history.replaceState( null, null, "/farmer/market_place.jsp" );
}
</script>
</body>
</html>