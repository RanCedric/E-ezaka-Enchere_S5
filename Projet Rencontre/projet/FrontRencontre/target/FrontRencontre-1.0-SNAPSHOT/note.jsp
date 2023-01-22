<%-- 
    Document   : list
    Created on : 19 janv. 2023, 00:15:43
    Author     : Cédric
--%>
<%@page import="java.util.LinkedHashMap"%>
<%@page import="wiremock.com.fasterxml.jackson.databind.ObjectMapper"%>
<%@page import="java.util.ArrayList"%>
<%@page import="controller.Client"%>
<%@page import="controller.Client"%>
<% String note = (String) session.getAttribute("note"); %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table border="1">
            <tr>
                <th>note</th>
            </tr>
        <tr>
            <td><% out.print(note); %></td>
        </tr>
    </table>

    </body>
</html>
