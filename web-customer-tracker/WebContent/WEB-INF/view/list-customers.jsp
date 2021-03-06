<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE HTML>
<html>
<head>
<title>Customers</title>

<link type="text/css"
	  rel="stylesheet"
	  href="${pageContext.request.contextPath}/resources/css/style.css" />


</head>
<body>

<div id="wrapper">
	<div id="header">
	
		<h1>CRM - Customer Relationship Manager</h1>
		
		</div>
		</div>
		
<div id="container">
	<div id="content">
	
	
	
	<input type="button" value="Add Customer"
		onClick="window.location.href='showFormForAdd';return false;"
		class="add-button"
		
		/>
	
	
	<table>
	<tr>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Email</th>	
		<th>Action</th>
	</tr>
	
	<c:forEach var="tempCustomer" items="${customers}">
	
	<c:url var="updateLink" value="/customer/showFormForUpdate">
		<c:param name="customerId" value="${tempCustomer.id}" />
		</c:url>
		
		<c:url var="deleteLink" value="/customer/delete">
		<c:param name="customerId" value="${tempCustomer.id}" />
		</c:url>
	
	<tr>
		<td>${tempCustomer.firstName}</td>
		<td>${tempCustomer.lastName}</td>
		<td>${tempCustomer.email}</td>	
		<td><a href="${updateLink}"> Update</a> 
		|
		<a href="${deleteLink}"
		
		 onClick="if(!(confirm('Are you really really sure you want to delete this good customer?'))) return false">Delete</a>
	</tr>
	
	
	
	</c:forEach>
		
	</table>

	</div>
</div>


</body>
</html>