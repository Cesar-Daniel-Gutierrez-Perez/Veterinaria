<%-- 
    Document   : index2
    Created on : 14/10/2022, 01:52:16 PM
    Author     : perez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
    </head>
    <body>
        <h1>Ingrese la informacion requerida</h1>
        <form action="form2.jsp"> 
        Tipo de mascota: <br/>
        Perro: <input type="radio" name = "Mascota2" id="p2">
        Gato: <input type="radio" name = "Mascota2" id="g2"> <br/>
        Nombre: <input type="text" name = "Nombre2"> <br/>
        Raza: <input type="text" name = "Raza2"> <br/>
        Color: <input type="text" name = "Color2"> <br/>
        Edad: <input type="text" name = "Edad2"> <br/>
        <p id="inf2" hidden>Nivel de entrenamiento(1 a 10): </p>
        <input type="text" id="nv2" name = "NivEn2" hidden>
        <select id="s" name="Tox2" hidden>
            <option selected disabled>¿Tiene toxoplasmosis?</option>
            <option>Si</option>
            <option>No</option>
        </select><br/>
        <textarea name = "gp" id="rp" cols="200" rows="200" value = "<%out.print(request.getParameter("rp"));%> " hidden><%out.print(request.getParameter("rp"));%></textarea>
        <textarea name = "gg" id="rg" cols="200" rows="200" value = "<%out.print(request.getParameter("rg"));%> " hidden><%out.print(request.getParameter("rg"));;%></textarea>
        <textarea name = "gp2" id="rp2" cols="200" rows="200" value = "<%out.print(request.getParameter("rp2"));%> " hidden><%out.print(request.getParameter("rp"));%></textarea>
        <textarea name = "gg2" id="rg2" cols="200" rows="200" value = "<%out.print(request.getParameter("rg2"));%> " hidden><%out.print(request.getParameter("rg"));;%></textarea>
        <input type="submit" value = "ok">
        </form>
        <script>            
            $(function(){
                $('#p2').click(function(){
                    $('#s').hide();
                    $('#inf2').show();
                    $('#nv2').show();
                });                
            });
            $(function(){
                $('#g2').click(function(){
                    $('#s').show();
                    $('#inf2').hide();
                    $('#nv2').hide();
                });                
            });
            </script>
    </body>
</html>
