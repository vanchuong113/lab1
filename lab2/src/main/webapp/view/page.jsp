<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Page</title>
</head>
<body>
    <!-- Hiển thị biến message -->
    <h2>${message}</h2>

    <!-- Bao hàm trang user-info.jsp -->
    <jsp:include page="user-info.jsp"/>
</body>
</html>
