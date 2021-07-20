<%@page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>

<h1>Happy :)</h1>



${student}

<img src="<c:url value="/resources/image/${name}" />" alt="img" style="width: 50%;" />