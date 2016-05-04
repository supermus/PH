<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
 <div id="formAdmin">
 
 	 <!-- employee = obj dans la methode Index -->
 	<f:form modelAttribute="employee" action="saveEmp" 
 		method="post" enctype="multipart/form-data">
 		<table>
 			<tr>
 			  <td> ID Employee </td>
 			  <td> <f:input path="idEmploye"/> </td>
 			  <td> <f:errors path="idEmploye" cssClass="errors"></f:errors> </td>
 			</tr>
 			<tr> 
 			  <td> Nom Employee </td>
 			  <td> <f:input path="nom"/> </td>
 			  <td> <f:errors path="nom" cssClass="errors"></f:errors> </td>
 			</tr>
 			<tr>
 			  <td> Matricule Employee </td>
 			  <td> <f:input path="matricule"/> </td>
 			  <td> <f:errors path="matricule" cssClass="errors"></f:errors> </td>
 			</tr>
 		</table>
 	
 	</f:form>
 
 </div>