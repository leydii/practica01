<%-- 
    Document   : index
    Created on : 05/09/2016, 12:31:55 PM
    Author     : alumno
--%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>INICIAR SESION</h1>
    <left>Introduce tu nombre y contraseña para ingresar</left>    
    
    <body>
        <form action="validarUsuario" method="post">
            <table>
                <tr>
                    <td>Usuario </td>
                        <td><input name="txtusuario" type="text"> </td>
                </tr>
                
                <tr>
                    <td>Password </td>
                     <td> <input name="txtpassword" type="text"></td>
                 </tr>
                
                 
                <tr>
                    <td>
                    <td><input type="submit" value="INICIAR SESION"></td>
                     <td> </td>
                </tr>
                <tr>
                </tr>
            </table>
        </form>
    </body>
</html>
