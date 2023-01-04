<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
  
<%@ taglib   uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
    
    
<!DOCTYPE html>
<html>
<head>


<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">




<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>




<h1 style="text-align: center;"> CART </h1>


<table class="container table table-hover">

<tr><th></th><td>CART Id</td><th>FOOD POSTER</th><th>Food NAME</th><th>FOOD CATEGORY</th><th>FOOD STATUSE</th><th>FOOD QUANTITY</th><th>FOOD DESCRIPTION</th></th><th>FOOD PRICE</th></tr>


<c:forEach items="${cartList}" var="product"  >


<tr><td></td><td>${cart.cartId}</td> <td><img src="/images/${cart.foodImageUrl}"style="height: 301px; width: 301px;"/></td>
     <td>${cart.foodName}</td> <td>${cart.foodCategory}</td> <td>${cart.foodStatus}</td><td>${cart.foodQuantity}</td><td>${cart.foodDescription}</td><td>${cart.foodPrice}</td>
     
     <td>
<form class="container col-md-4"  action="http://localhost:8080/user/delete/?cartId" method="post">
 <input type="hidden"  value="${cart.cartId}" name="foodId" />
 
<button type="submit"  class="btn btn-danger"   value="delete" name="action">Delete</button>
</form>
	
</td>

     
     
     
      </tr>
</c:forEach>


</table>

<button type="submit" id="login"class="btn btn-warning btn-block btn-large login"><a href="/views/Payment.jsp">CHECKOUT</a></button>


</body>
</html>