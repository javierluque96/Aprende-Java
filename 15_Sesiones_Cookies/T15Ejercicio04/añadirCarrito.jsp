<%@ page import="tiendaOnline.Carrito" %>
<%
	int codigo = Integer.parseInt(request.getParameter("codigo"));
	Carrito c = (Carrito) session.getAttribute("carrito");
	c.añadeProducto(codigo);
	session.setAttribute("codigo", c);
	response.sendRedirect("index.jsp");
%>