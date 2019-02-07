<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EMS</title>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  <style type="text/css">
  
  
  .container
  {
  background-image:url("https://interfacelift.com/wallpaper/7yz4ma1/04194_pagview_2560x1600.jpg");
  padding-top: 20%;
padding-bottom: 20%;

background-size:cover;
  
  }
  
  </style>
  
  
  
  
  
</head>
<body>
   <center>
<h1>Login Form</h1><hr/>

<%
   String m=(String)request.getAttribute("msg");
   if(m!=null)
  {  
%>
<div class="alert alert-success alert-dismissible">
  <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
  <strong><% out.println(m); %></strong>
</div>

<%
}
%>


<center>

<div class="container" >
<div class="row">
  <div class="col-sm-4">
  
 <form action="AutoServlet" method="post" >
  <div class="form-group">
    <label for="email">LoginID:</label>
    <input type="TEXT" name="uid"  class="form-control" id="email">
  </div>
  <div class="form-group">
    <label for="pwd">Password:</label>
    <input type="password" name="password" class="form-control" id="pwd">
  </div>
  <button type="submit" class="btn btn-default">Submit</button>
</form>
</div></div>

</div>
</center>
</center>

</body>
</html>