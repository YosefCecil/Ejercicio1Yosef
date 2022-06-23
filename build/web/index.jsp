<%-- 
    Document   : index
    Created on : 19/06/2022, 07:58:42 PM
    Author     : Hp_Corei7
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String Matricula[] = new String[10];
    Matricula[0] = "57211000117";
    Matricula[1] = "57211000135";
    Matricula[2] = "57211000112";
    Matricula[3] = "57211000123";
    Matricula[4] = "57211000118";
    Matricula[5] = "57211000145";
    Matricula[6] = "57211000160";
    Matricula[7] = "57211000139";
    Matricula[8] = "57211000110";
    Matricula[9] = "57211000109";
   

    String Nombre[] = new String[10];
    Nombre[0] = "Yosef Cecil Flore Martinez";
    Nombre[1] = "Roberto Leonel Salgado De La Sancha";
    Nombre[2] = "Amado Perez Cochine";
    Nombre[3] = "Yonathan Uriel Pastrana Tepectzin";
    Nombre[4] = "Daniel Chino Bello";
    Nombre[5] = "Luis Gustavo Tacuba Bonifacio";
    Nombre[6] = "Victor Manuel Bautista Nievez";
    Nombre[7] = "Susano Eduardo Moras Gatica";
    Nombre[8] = "Verónica Marín Jorge";
    Nombre[9] = "Kevin Ulises Garcia Camacho";


    double DDI[] = new double[10];
    DDI[0] = 10;
    DDI[1] = 8;
    DDI[2] = 9;
    DDI[3] = 7;
    DDI[4] = 8;
    DDI[5] = 10;
    DDI[6] = 7;
    DDI[7] = 10;
    DDI[8] = 8;
    DDI[9] = 10;
   

    double DWI[] = new double[10];
    DWI[0] = 9;
    DWI[1] = 8;
    DWI[2] = 9;
    DWI[3] = 10;
    DWI[4] = 10;
    DWI[5] = 9;
    DWI[6] = 10;
    DWI[7] = 7;
    DWI[8] = 8;
    DWI[9] = 10;
  

    double ECBD[] = new double[10];
    ECBD[0] = 10;
    ECBD[1] = 8;
    ECBD[2] = 10;
    ECBD[3] = 10;
    ECBD[4] = 9;
    ECBD[5] = 9;
    ECBD[6] = 10;
    ECBD[7] = 9;
    ECBD[8] = 8;
    ECBD[9] = 7;
  

%>
<!DOCTYPE html>
<html>
    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tabla De Calificaciones Alumnos UT</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

    </head>
    <body>
        <div id="content">
            <nav class="navbar navbar-dark bg-dark">
                <a class="navbar-brand" href="#">Unidad Academica De la Region Norte de Guerrero</a>
            </nav>

            <table class="table table-striped" id="tabla">
                <tbody>
                <table class="table table-hover table-dark">
                    <thead>
                        <tr>
                            <th scope="col">Matricula</th>
                            <th scope="col">Nombre</th>
                            <th scope="col">DDI</th>
                            <th scope="col">DWI</th>
                            <th scope="col">ECBD</th>
                            <th scope="col">PROMEDIO</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
               
                            <td><% out.print(Matricula[0]);%></td>
                            <td><% out.print(Nombre[0]);%></td>
                            <td><% out.print(DDI[0]);%></td>
                            <td><% out.print(DWI[0]);%></td>
                            <td><% out.print(ECBD[0]);%></td>
                            <td><% double prom = (DDI[0] + DWI[0] + ECBD[0]) / (3);
                             out.print(String.format("%.1f", prom));%></td>
                        </tr>
                        <tr>
                            
                            <td><% out.print(Matricula[1]); %></td>
                            <td><% out.print(Nombre[1]);%></td>
                            <td><% out.print(DDI[1]);%></td>
                            <td><% out.print(DWI[1]);%></td>
                            <td><% out.print(ECBD[1]);%></td>
                            <td><% double prom1 = (DDI[1] + DWI[1] + ECBD[1]) / (3);
                             out.print(String.format("%.1f", prom1));%></td>
                        </tr>
                        <tr>
                           
                            <td><% out.print(Matricula[2]); %></td>
                            <td><% out.print(Nombre[2]);%></td>
                            <td><% out.print(DDI[2]);%></td>
                            <td><% out.print(DWI[2]);%></td>
                            <td><% out.print(ECBD[2]);%></td>
                            <td><% double prom2 = (DDI[2] + DWI[2] + ECBD[2]) / (3);
                             out.print(String.format("%.1f", prom2));%></td>
                        </tr>
                        <tr>
                           
                            <td><% out.print(Matricula[3]); %></td>
                            <td><% out.print(Nombre[3]);%></td>
                            <td><% out.print(DDI[3]);%></td>
                            <td><% out.print(DWI[3]);%></td>
                            <td><% out.print(ECBD[3]);%></td>
                            <td><% double prom3 = (DDI[3] + DWI[3] + ECBD[3]) / (3);
                             out.print(String.format("%.1f", prom3));%></td>
                        </tr>
                        <tr>
                           
                            <td><% out.print(Matricula[4]); %></td>
                            <td><% out.print(Nombre[4]);%></td>
                            <td><% out.print(DDI[4]);%></td>
                            <td><% out.print(DWI[4]);%></td>
                            <td><% out.print(ECBD[4]);%></td>
                            <td><% double prom4 = (DDI[4] + DWI[4] + ECBD[4]) / (3);
                             out.print(String.format("%.1f", prom4));%></td>
                        </tr>
                        <tr>
                            
                            <td><% out.print(Matricula[5]); %></td>
                            <td><% out.print(Nombre[5]);%></td>
                            <td><% out.print(DDI[5]);%></td>
                            <td><% out.print(DWI[5]);%></td>
                            <td><% out.print(ECBD[5]);%></td>
                            <td><% double prom5 = (DDI[5] + DWI[5] + ECBD[5]) / (3);
                             out.print(String.format("%.1f", prom5));%></td>
                        </tr>
                        <tr>
                            
                            <td><% out.print(Matricula[6]); %></td>
                            <td><% out.print(Nombre[6]);%></td>
                            <td><% out.print(DDI[6]);%></td>
                            <td><% out.print(DWI[6]);%></td>
                            <td><% out.print(ECBD[6]);%></td>
                            <td><% double prom6 = (DDI[6] + DWI[6] + ECBD[6]) / (3);
                             out.print(String.format("%.1f", prom6));%></td>
                        </tr>
                        <tr>
                            
                            <td><% out.print(Matricula[7]); %></td>
                            <td><% out.print(Nombre[7]);%></td>
                            <td><% out.print(DDI[7]);%></td>
                            <td><% out.print(DWI[7]);%></td>
                            <td><% out.print(ECBD[7]);%></td>
                            <td><% double prom7 = (DDI[7] + DWI[7] + ECBD[7]) / (3);
                             out.print(String.format("%.1f", prom7));%></td>
                        </tr>
                        <tr>
                           
                            <td><% out.print(Matricula[8]); %></td>
                            <td><% out.print(Nombre[8]);%></td>
                            <td><% out.print(DDI[8]);%></td>
                            <td><% out.print(DWI[8]);%></td>
                            <td><% out.print(ECBD[8]);%></td>
                            <td><% double prom8 = (DDI[8] + DWI[8] + ECBD[8]) / (3);
                             out.print(String.format("%.1f", prom8));%></td>
                        </tr>
                        <tr>
                           
                            <td><% out.print(Matricula[9]); %></td>
                            <td><% out.print(Nombre[9]);%></td>
                            <td><% out.print(DDI[9]);%></td>
                            <td><% out.print(DWI[9]);%></td>
                            <td><% out.print(ECBD[9]);%></td>
                            <td><% double prom9 = (DDI[9] + DWI[9] + ECBD[9]) / (3);
                             out.print(String.format("%.1f", prom9));%></td>
                        </tr>
                    </tbody>
                </table>
        </div>

        <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.min.js" integrity="sha384-VHvPCCyXqtD5DqJeNxl2dtTyhF78xXNXdkwX1CZeRusQfRKp+tA7hAShOK/B/fQ2" crossorigin="anonymous"></script>

    </body>
</html>
