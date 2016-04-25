<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
 <div id="formAdmin">
 
 	 <!-- employee = obj dans la methode Index -->
 	<f:form modelAttribute="emplyee" action="saveEmpl" 
 		method="post" enctype="multipart/form-data">
 		<table>
 			<tr>
 			  <td> ID Employee </td>
 			  <td> <f:input path="idEmplyee"/> </td>
 			  <td> <f:errors path="idEmplyee" cssClass="errors"></f:errors> </td>
 			</tr>
 			<tr>
 			  <td> Nom Employee </td>
 			  <td> <f:input path="nomEmplyee"/> </td>
 			  <td> <f:errors path="nomEmplyee" cssClass="errors"></f:errors> </td>
 			</tr>
 			<tr>
 			  <td> Matricule Employee </td>
 			  <td> <f:input path="matricule"/> </td>
 			  <td> <f:errors path="matricule" cssClass="errors"></f:errors> </td>
 			</tr>
 		</table>
 	
 	</f:form>
 
 </div>