<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form action="pwChangeOk" method="post">
	현재 비밀번호 : <input type="password" name="membPw" /><br />
	변경 비밀번호 : <input type="password" name="newPw" /><br />
	변경 비밀번호 확인 : <input type="password" name="newPwCon" /><br />
	<input type="submit" value="비밀번호 변경" />
</form>
</body>
</html>