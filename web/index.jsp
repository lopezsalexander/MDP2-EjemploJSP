<%-- 
    Document   : index
    Created on : 25/02/2018, 09:40:48 PM
    Author     : Alexander
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejemplo JSP</title>
    </head>
    <body>
        <h1>Registro</h1>
        <form action="registro.do" method="POST">
            <table border="0" align="center">
                <thead>
                    <tr>
                        <th colspan="2">Datos del usuario</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Nombre: </td>
                        <td><input type="text" name="nombre" value="" /></td>
                    </tr>
                    <tr>
                        <td>Apellido:</td>
                        <td><input type="text" name="apellido" value="" /></td>
                    </tr>
                    <tr>
                        <td>Edad: </td>
                        <td><input type="text" name="edad" value="" /></td>
                    </tr>
                    <tr>
                        <td>Correo: </td>
                        <td><input type="text" name="correo" value="" /></td>
                    </tr>
                    <tr>
                        <td>Usuario: </td>
                        <td><input type="text" name="usuario" value="" /></td>
                    </tr>
                    <tr>
                        <td>Clave: </td>
                        <td><input type="password" name="clave" value="" /></td>
                    </tr>
                    <tr>
                        <td colspan="2" align="center" ><input type="submit" value="Registrar" /></td>
                    </tr>
                </tbody>
            </table>

        </form>
    </body>
</html>
