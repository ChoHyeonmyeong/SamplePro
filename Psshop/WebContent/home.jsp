<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:if test="${! empty success}">
  <script type="text/javascript">
    alert('${success}');
  </script>
</c:if>
<c:if test="${! empty mesg}">
  <script type="text/javascript">
    alert('${mesg}');
  </script>
</c:if>



<span style="color: red; font-size:3em;" >P</span>
<span style="color: blue; font-size:3em;">S</span>
<h1>SHOP</h1>


<jsp:include page="common/top.jsp" flush="true" /><br> 
<hr>
<img src="images/main.png" width="auto" height="aoto" />

</body>
</html>