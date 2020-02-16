<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
<style type="text/css">
body
{
background-image:url('resources/back.jpg');
background-repeat:no-repeat;
background-attachment: fixed;
background-size: cover;font-size:20px;
}
.row:after{content:"";
display:table;
clear:both;

}

.column{float:right;width:50%;}
</style>
</head>
<body>
<div class="row">
<div class="column">
<a href="adddevice" >Add Devices</a> <br> 
<a href="listdevice">List All Devices</a> <br/>
<a href="setop" >Set Operations</a><br>
<a href="delete" >Remove Installed Devices</a>



</div>
</div>


</body>
</html>