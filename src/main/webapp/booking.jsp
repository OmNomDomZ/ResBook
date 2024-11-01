<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Booking Details</title>
</head>
<body>
<h2>Список бронирований</h2>
<ul>
    <c:forEach var="booking" items="${bookings}">
        <li>Бронирование: ID=${booking.uuid}, Пользователь: ${booking.userID}, Ресурс: ${booking.resourceID}, Время: ${booking.startTime} - ${booking.endTime}</li>
    </c:forEach>
</ul>
</body>
</html>
