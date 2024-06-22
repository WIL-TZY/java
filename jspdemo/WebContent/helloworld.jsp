<%@ page import="com.jspdemo.jsp.Utils" %>
<html>
<body>
<jsp:include page="header.html"/>
<h3>Hello World using JSP!</h3>
<h3>Expressions</h3>
<!-- Expressions: < % = java code here % > -->
The time on the server is <%= new java.util.Date() %>
<br><br>
Converting a string to uppercase: <%= new String("Hello World").toUpperCase() %> %>
<br><br>
25 multiplied by 4 equals <%= 25*4 %>
<br>
<h3>Scriplet</h3>
<!-- Scriplet: < % java code here % > -->
<%  
for (int i=1; i <= 5; i++) {
	out.println("Loop:" + i);
}
%>
<h3>Declarations</h3>
<%
    out.println("Sum: " + sum(3, 4));
%>
<%! 
    public int sum(int a, int b) {
        return a + b;
    }
%>
<h3>Import Java Class to JSP</h3>
<!-- Package + ClassName + Method -->
Let's have some fun: <%= com.jspdemo.jsp.Utils.makeItLower("FUN FUN FUN") %>
<br><br>
Let's have some fun: <%= Utils.makeItLower("IMPORT IMPORT") %>
<h3>JSP Built-in Objects</h3>
Request user agent: <%= request.getHeader("User-Agent") %>
<br><br>
Request language: <%= request.getLocale() %>
<h3>Including Files</h3>
<jsp:include page="footer.jsp"/>
</body>
</html>