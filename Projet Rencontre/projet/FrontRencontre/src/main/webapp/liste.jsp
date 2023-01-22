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
<% Object[] ret = (Object[]) session.getAttribute("liste"); %>
<% ArrayList<Object> liste = (ArrayList<Object>) ret[0]; %>
<% ArrayList<Double> note = (ArrayList<Double>) ret[1]; %>
<% ArrayList<String> toetra = (ArrayList<String>) ret[2]; %>
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
                <th>nom</th>
                <th>note</th>
            </tr>
        <%
            for (int i = 0; i < liste.size(); i++) {
            LinkedHashMap a = (LinkedHashMap) liste.get(i);
            ObjectMapper mapper = new ObjectMapper();
            Client client = mapper.convertValue(a, Client.class);
        %>
        <tr>
            <td><% out.print(client.getNom()); %></td>
            <td><% out.print(note.get(i)); %></td>
            <td><% out.print(toetra.get(i)); %></td>
        </tr>
        <% }
        %>
    </table>

    </body>
</html>
