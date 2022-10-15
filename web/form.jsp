<%-- 
    Document   : form
    Created on : 27/09/2022, 05:11:39 PM
    Author     : perez
--%>



<%@page import="lg.Datosg"%>
<%@page import="lg.Datosp"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>        
    </head>
    <body>
        <h1>Seleccione el tipo de mascota del que quiere consultar informacion</h1>
        <%@ page import="lg.Felinos"%>
        <%@ page import="lg.Caninos"%>
        <%@ page import="lg.IFelinos"%>
        <%@ page import="lg.ICaninos"%>
        <%@ page import="lg.Veterinaria"%>
        <%@ page import="lg.Mascota"%> 
        <%ArrayList ip = new ArrayList();
        ArrayList ig = new ArrayList();
        String listap="";
        String listag="";
        String t = request.getParameter("Tox")+"";
        if(t.equals("Si")||t.equals("No")){
        Datosg g = new Datosg(request.getParameter("Nombre"), request.getParameter("Raza"), request.getParameter("Color"), request.getParameter("Edad"), request.getParameter("Tox")+"",ig);                  
            listag += g.getLg(); 
            listap +="";
        }
        else{
            Datosp p = new Datosp(request.getParameter("Nombre"), request.getParameter("Raza"), request.getParameter("Color"), request.getParameter("Edad"), request.getParameter("NivEn"), ip);
            listap += p.getLp();
            listag+="";
        }
        %>
        <button id="mp">Perros</button>
        <button id="mg">Gatos</button><br/>        
        <form action="index2.jsp">
            <input type="submit" value = "volver">
            <textarea name = "rp" id="rp" cols="200" rows="200" value = "<%out.print(listap);%> " hidden><%out.print(listap);%></textarea>
            <textarea name = "rg" id="rg" cols="200" rows="200" value = "<%out.print(listag);%> " hidden><%out.print(listag);%></textarea>           
        </form>        
        <script>            
            $(function(){
                $('#mp').click(function(){
                    $('#rg').hide();
                    $('#rp').show();
                });                
            });
            $(function(){
                $('#mg').click(function(){
                    $('#rg').show();
                    $('#rp').hide();
                });                
            });
            </script>
    </body>
</html>