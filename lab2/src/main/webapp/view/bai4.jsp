<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h2>User Form</h2>
    <form action="update" method="post">
        Fullname:
        <input name="fullname" value="${user.fullname}"
               ${editable ? "readonly" : ""}>
        <br><br>

        Gender:
        <input type="radio" name="gender" value="true"
               ${user.gender ? "checked" : ""}> Male
        <input type="radio" name="gender" value="false"
               ${!user.gender ? "checked" : ""}> Female
        <br><br>

        Country:
        <select name="country">
            <option value="VN" ${user.country == "VN" ? "selected" : ""}>Việt Nam</option>
            <option value="US" ${user.country == "US" ? "selected" : ""}>United States</option>
            <option value="CN" ${user.country == "CN" ? "selected" : ""}>China</option>
        </select>
        <br><br>

        <button type="submit" ${editable ? "disabled" : ""}>Create</button>
    </form>
</body>
</html>