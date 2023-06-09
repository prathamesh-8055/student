<html>
<body bgcolor = cyan text=black>
<h1>
<center>
<% mvc.Result r = (mvc.Result)request.getAttribute("result"); %>
<h3>Result of Student : <%=r.getName() %></h3>
<table border=5>
<tr>
<td>H.No : <%= r.getHno() %></td>
<td>Name : <%= r.getName() %></td>
<td>C    : <%= r.getC() %></td>
<td>C++  : <%= r.getCpp() %></td>
<td>Java : <%= r.getJava() %></td>
</tr>
</table>
</center>
</h1>
</body>
</html>