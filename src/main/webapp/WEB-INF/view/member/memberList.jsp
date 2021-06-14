<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8" isELIgnored ="false" %>
    
    <%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
회원리스트페이지
<table border = 1>
	<tr><td>아이디</td><td>이름</td><td>연락처</td>
		<td>성별</td><td>등록일</td></tr>
	<c:forEach items="${lists}" var="dto">
	<tr><td>${dto.membId }</td><td>${dto.membName }</td>
		<td>${dto.membPhoneNumber }</td><td>${dto.membGender }</td>
		<td><fmt:formatDate value="${dto.membEnterDate }" type="date"
			pattern="yyyy-MM-dd"/></td></tr>
	</c:forEach>

</table>
</body>
</html>