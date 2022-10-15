<%-- 
    Document   : form
    Created on : 27/09/2022, 05:11:39 PM
    Author     : perez
--%>




<%@page import="lg.Datosp"%>
<%@page import="lg.Datosg"%>
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
        ip.add(request.getParameter("gp2"));
        ig.add(request.getParameter("gg2"));
        String listap="";
        String listag="";
        String t = request.getParameter("Tox2")+"";
        Datosg g = new Datosg(request.getParameter("Nombre2"), request.getParameter("Raza2"), request.getParameter("Color2"), request.getParameter("Edad2"), request.getParameter("Tox2")+"",ig);                  

        
        if(t.equals("Si")||t.equals("No")){
            ip = g.getLg();
            ip.remove(request.getParameter("G")+"");
            listap +="";
        }
        else{
            Datosp p = new Datosp(request.getParameter("Nombre2"), request.getParameter("Raza2"), request.getParameter("Color2"), request.getParameter("Edad2"), request.getParameter("NivEn2"),ip);
            ig = p.getLp();
            ig.remove(request.getParameter("P")+"");
            listag+="";
        }
        %>
        <button id="mp2">Perros</button>
        <button id="mg2">Gatos</button><br/>        
        <form action="index2.jsp">
            <p id="Gi" hidden>ingrese el numero de el gato que quiera eliminar:</p> <input type="text" name = "G" id="G" hidden> <br/>
            <p id="Pi" hidden>ingrese el numero de el perro que quiera eliminar:</p><input type="text" name = "P" id="P" hidden> <br/>
            <input type="submit" value = "volver">
            <textarea name = "rp" id="rp2" cols="200" rows="200" value = "<%out.print(ip);%> " hidden><%out.print(ip);%></textarea>
            <textarea name = "rg" id="rg2" cols="200" rows="200" value = "<%out.print(ig);%> " hidden><%out.print(ig);%></textarea>                      
            
        </form>        
        <script>            
            $(function(){
                $('#mp2').click(function(){
                    $('#rg2').hide();
                    $('#rp2').show();
                    $('#G').hide();
                    $('#P').show();
                    $('#Gi').hide();
                    $('#Pi').show();
                });                
            });
            $(function(){
                $('#mg2').click(function(){
                    $('#rg2').show();
                    $('#rp2').hide();
                    $('#P').hide();
                    $('#G').show();
                    $('#Pi').hide();
                    $('#Gi').show();
                });                
            });
            </script>
    </body>
</html>