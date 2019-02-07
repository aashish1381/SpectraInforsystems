
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE HTML>
<html>
<head><title> Student Registration Form</title></head>
<body>

<form:form action="processForm" modelAttribute="student">

First Name: <form:input path="firstName"/>
<br><br>
Last Name: <form:input path="lastName"/>
<br><br>
Country: <form:select path="country">
<form:options items="${student.countryOptions}"/>
</form:select>

<br><br>

Favourite Language:

Java<form:radiobutton path="favouriteLanguage" value="Java"/>
C#<form:radiobutton path="favouriteLanguage" value="C#"/>
PHP<form:radiobutton path="favouriteLanguage" value="PHP"/>
Ruby<form:radiobutton path="favouriteLanguage" value="Ruby"/>

<br><br>
Which Operating Systems do you have experience with?

Windows<form:checkbox path="operatingSystem" value="Windows"/>
Mac<form:checkbox path="operatingSystem" value="Mac"/>
Linux<form:checkbox path="operatingSystem" value="Linux"/>
Ubuntu<form:checkbox path="operatingSystem" value="Ubuntu"/>



<input type="submit" value="submit"/>

</form:form>
 

</body>

</html>