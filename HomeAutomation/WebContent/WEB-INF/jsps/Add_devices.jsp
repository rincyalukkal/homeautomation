<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="resources/blue.css" rel="stylesheet" type="text/css"/>
<title>Add Devices</title>

</head>


<body>
<div class="container">
<h3>Add Device Name</h3>
  <form action="add_device_name" modelAttribute="devices" >
    <div class="row">
      <div class="col-25">
        <label for="dname">Add Device Name</label>
      </div>
      <div class="col-75">
        <input type="text" id="dname" name="dname"  />
      </div>
    </div>

 
  
    <div class="row">
      <input type="submit" value="Add">
    </div>
  </form>
  </div>
<a href="home">Go back </a>
</body>
</html>