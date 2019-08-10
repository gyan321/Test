 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  


<html>
<body>
<h2>Hello World!</h2>
 
   <form action="add" method="post" > 
<input type="text" name="t1">
<input type="text" name="t2"> 
<input type="submit"> 

</form>    
 
  <%--  <form:form method="post"  action="add"  modelAttribute="student">

 <form:input path="firstValue"/>
 <form:input path="secondValue"/>
<input type="submit" value="Submit" />
</form:form>  --%>
</body>
</html>
