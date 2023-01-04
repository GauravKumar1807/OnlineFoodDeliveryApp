<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
	
	
  
</head>
<body>
<%@ include file="/views/AdminNavbar.jsp" %>
<!-- <iframe src="/views/UserNavbar.html" width="1400" height="85"></iframe>   -->
	<div>
		<br>
		<h2 class="text-center" style = "margin-top:8rem">Add Food Details</h2>
		<br>
		<hr>

		<div class="container col-9">
			<form action="/admin/add" method="post">
				<div class="row">
					<div class="col">
						<div class="form-floating mb-3">
							<input type="text" class="form-control" name="foodName"
								id="foodName" placeholder="Food Name" style="width: 30%;background:transparent;border:3px solid white;color:black"> <label
								for="foodName" style="color:black ">Food Name</label>
						</div>
					</div>
					<br>
					<div class="col">
						<select class="form-select" name="foodCategory"
							aria-label="Default select example" style="width: 30%; background:transparent;border:3px solid white;color:black">
							<option selected>Select Food Category</option>
							<option value="Momos">Momos</option>
							<option value="Biryani">Biryani</option>
							<option value="Pizza">Pizza</option>
							<option value="Burger">Burger</option>
							
						</select>
					</div>
				</div>
				<br>
				<div class="row">
					<div class="col">
						<div class="form-floating mb-3">
							<input type="number" class="form-control" name="foodPrice"
								id="foodprice" placeholder="Food Price" style="width: 30%; background:transparent;border:3px solid white;color:black"> <label
								for="foodprice" style="color:black">Food Price</label>
						</div>
					</div>
					<br>

				
					<div class="row">
						<div class="col">
							<div class="form-floating mb-3">
								<input type="text" class="form-control" name="foodStatus"
									id="foodstatus" placeholder="Food Status" style="width: 30%; background:transparent;border:3px solid white;color:black"> <label
									for="foodstatus" style="color:black">Food Status</label>
							</div>
						</div>
						<br>

						<div class="row">
							<div class="col">
								<div class="form-floating mb-3">
									<input type="text" class="form-control" name="foodDescription"
										id="description" placeholder="Food Description" style="width: 50%; background:transparent;border:3px solid white;color:black"> <label
										for="fooddescription" style="color:black">Food Description</label>
								</div>
							</div>
							<br>
							<div class="row">
						<div class="col">
							<div class="form-floating mb-3">
								<input type="text" class="form-control" name="foodQuantity"
									id="foodquantity" placeholder="Food Status" style="width: 30%; background:transparent;border:3px solid white;color:black"> <label
									for="foodquantity" style="color:black">Food Quantity</label>
							</div>
						</div>	

					<br>
			
			
					<div class="col">
						<div class="input-group mb-3">
							<input type="file" class="form-control" name="mimage" id="inputGroupFile02" style="width: 30%; background:transparent;border:3px solid white;color:black">
							<label class="input-group-text" for="inputGroupFile02"style="color:black     margin-left: 92px;">Upload Food Image</label>
						</div>
					</div>
				</div>

				<br> <br>
				<button type="submit" class="btn btn-primary"
					style="margin-bottom: 2rem; padding-left: 1cm; padding-right: 1cm;">Submit
					Details</button>

			</form>
		</div>




	</div>




	<!--linking the bootstrap js-->
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"
		integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js"
		integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF"
		crossorigin="anonymous"></script>
</body>
</head>
<body>

</body>
</html>