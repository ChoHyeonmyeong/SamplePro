<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>


<c:if test="${empty login}">
	<a href="LoginUIServlet">로그인</a>
	<a href="MemberUIServlet">회원가입</a>
</c:if>

<c:if test="${!empty login}">
	${login.username}님!&nbsp;
	<a href="LogoutServlet">로그아웃</a>
	<a href="MyPageServlet">MyPage</a>
	<a href="GoodsCartListServlet">장바구니</a>
</c:if>