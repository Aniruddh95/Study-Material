<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form name="frm" method="post" action="rest/products">
	Enter Product Id<input type="text" name="txtProductId" 
	required pattern="[1-9]{1,3}"/><br>
	Enter Product Name <input type="text" name="txtProductName" 
	required pattern="[A-Za-z]+"/><br>
	Enter Price <input type="text" name="txtPrice" 
	required pattern="[1-9]{1}[0-9]{5,}"/><br>
	<input type="submit" value="Add Product" />
</form>
</body>
</html>