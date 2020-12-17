<%@taglib prefix="form"  uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<title>Student Confirmation Form</title>
</head>
<body>

Welcome Student : ${student.firstName} ${student.lastName}
<br><br>

Age             : ${student.age}
<br><br>

Gender          : ${student.gender}
<br><br>

Email ID        : ${student.email}
<br><br>

Subject Interested:

<ul>
<c:forEach  var="temp" items="${student.SubjectInterest}">
<li>
${temp}
</li>
</c:forEach>
</ul>

</body>
</html>
