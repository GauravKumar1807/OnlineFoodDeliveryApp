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

<jsp:include  page="/views/UserNavbar.jsp" />


<h1 style="text-align: center;">ALL Foods</h1>


<table class="container table table-hover">

<tr><th></th><td>Food Id</td><th>Food POSTER</th><th>Food NAME</th><th>Food Category</th><th>MOVIE LANGUAGE</th></th><th>FOOD DESCRIPTION</th><th>FOOD STATUS</th><th>FOOD PRICE</th></tr>


<c:forEach items="${foodList}" var="product"  >


<tr><td></td><td>${food.foodId}</td> <td><img src="/images/${food.foodImageUrl}"style="height: 301px; width: 301px;"/></td>
     <td>${food.foodName}</td> <td>${food.foodCategory}</td> <td>${food.foodStatus}</td><td>${food.foodStatus}</td><td>${food.foodDescription}</td><td>${food.foodQuantity}</td><td>${food.foodPrice}</td>
     
     
<td>
<form class="container col-md-4"  action="http://localhost:8080/user/add/?foodId/?uid" method="post">
 <input type="hidden"  value="${food.foodId}" name="foodId" />
 <input type="hidden"  value="${food.uid}" name="uid" />
 
<button type="submit"  class="btn btn-warning"   value="delete" name="action">ADD TO CART</button>
</form>
	
</td>
     
     
     
      </tr>
</c:forEach>


</table>



</body>
</html>