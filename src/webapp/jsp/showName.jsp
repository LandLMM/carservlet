<%@page language ="java" contentType="text/html" pageEncoding="UTF-8" %>

<html>
<body>

Car list:
<c:forEach items="${cars}" var="car">
    <p>    Model : ${car.carModel}
        Type  : ${car.carType}
        Year  : ${car.year}</p>
    <br>
</c:forEach>
</body>
</html>