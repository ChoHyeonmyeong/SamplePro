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
<span style="color: red; font-size:3em;" >P</span>
<span style="color: blue; font-size:3em;">S</span>


<jsp:include page="common/top.jsp" flush="true" /><br> 
<hr>
<jsp:include page="member/loginForm.jsp" flush="true" />
</body>
</html>