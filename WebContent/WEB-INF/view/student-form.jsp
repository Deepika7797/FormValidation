<%@ taglib prefix="form"  uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<title>Student Registration Form</title>

<style>
.iamCSS {color:red}
</style>
</head>
<body>

<i>FILL THE FORM... Asterisk(*)denotes required..</i>
<br>
<br>

<form:form action = "processForm" modelAttribute="student">

First Name (*): <form:input path="firstName"/>
<form:errors path="firstName" cssClass="iamCSS"/>
<br>
<br>
Last Name (*) : <form:input path="lastName"/>
<form:errors path="lastName" cssClass="iamCSS"/>
<br>
<br>
Gender        :<form:select path="gender">
<form:option value = "Male" label="Male"/>
<form:option value = "Female" label="Female"/>
<form:option value = "Others" label="Other"/>
</form:select>
<br>
<br>
Age(*)        :<form:input path="age"/>
<form:errors path="age" cssClass="iamCSS"/>
<br>
<br>
Mail ID       :<form:input path="email"/>
<br>
<br>
Subject Interest:
<br>
History  <form:checkbox path="SubjectInterest" value="History"/>
<br>
Maths    <form:checkbox path="SubjectInterest" value="Maths"/>
<br>
Geography    <form:checkbox path="SubjectInterest" value="Geography"/>
<br>
Science    <form:checkbox path="SubjectInterest" value="Science"/>
<br>
Polity    <form:checkbox path="SubjectInterest" value="Polity"/>
<br>


<input type="submit" value = "Submit">
</form:form>

</body>

</html>