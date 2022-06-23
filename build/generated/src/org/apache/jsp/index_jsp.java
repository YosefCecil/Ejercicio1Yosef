package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");

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
  


      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Tabla De Calificaciones Alumnos UT</title>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"content\">\n");
      out.write("            <nav class=\"navbar navbar-dark bg-dark\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"#\">Unidad Academica De la Region Norte de Guerrero</a>\n");
      out.write("            </nav>\n");
      out.write("\n");
      out.write("            <table class=\"table table-striped\" id=\"tabla\">\n");
      out.write("                <tbody>\n");
      out.write("                <table class=\"table table-hover table-dark\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th scope=\"col\">Matricula</th>\n");
      out.write("                            <th scope=\"col\">Nombre</th>\n");
      out.write("                            <th scope=\"col\">DDI</th>\n");
      out.write("                            <th scope=\"col\">DWI</th>\n");
      out.write("                            <th scope=\"col\">ECBD</th>\n");
      out.write("                            <th scope=\"col\">PROMEDIO</th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        <tr>\n");
      out.write("               \n");
      out.write("                            <td>");
 out.print(Matricula[0]);
      out.write("</td>\n");
      out.write("                            <td>");
 out.print(Nombre[0]);
      out.write("</td>\n");
      out.write("                            <td>");
 out.print(DDI[0]);
      out.write("</td>\n");
      out.write("                            <td>");
 out.print(DWI[0]);
      out.write("</td>\n");
      out.write("                            <td>");
 out.print(ECBD[0]);
      out.write("</td>\n");
      out.write("                            <td>");
 double prom = (DDI[0] + DWI[0] + ECBD[0]) / (3);
                             out.print(String.format("%.1f", prom));
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            \n");
      out.write("                            <td>");
 out.print(Matricula[1]); 
      out.write("</td>\n");
      out.write("                            <td>");
 out.print(Nombre[1]);
      out.write("</td>\n");
      out.write("                            <td>");
 out.print(DDI[1]);
      out.write("</td>\n");
      out.write("                            <td>");
 out.print(DWI[1]);
      out.write("</td>\n");
      out.write("                            <td>");
 out.print(ECBD[1]);
      out.write("</td>\n");
      out.write("                            <td>");
 double prom1 = (DDI[1] + DWI[1] + ECBD[1]) / (3);
                             out.print(String.format("%.1f", prom1));
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                           \n");
      out.write("                            <td>");
 out.print(Matricula[2]); 
      out.write("</td>\n");
      out.write("                            <td>");
 out.print(Nombre[2]);
      out.write("</td>\n");
      out.write("                            <td>");
 out.print(DDI[2]);
      out.write("</td>\n");
      out.write("                            <td>");
 out.print(DWI[2]);
      out.write("</td>\n");
      out.write("                            <td>");
 out.print(ECBD[2]);
      out.write("</td>\n");
      out.write("                            <td>");
 double prom2 = (DDI[2] + DWI[2] + ECBD[2]) / (3);
                             out.print(String.format("%.1f", prom2));
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                           \n");
      out.write("                            <td>");
 out.print(Matricula[3]); 
      out.write("</td>\n");
      out.write("                            <td>");
 out.print(Nombre[3]);
      out.write("</td>\n");
      out.write("                            <td>");
 out.print(DDI[3]);
      out.write("</td>\n");
      out.write("                            <td>");
 out.print(DWI[3]);
      out.write("</td>\n");
      out.write("                            <td>");
 out.print(ECBD[3]);
      out.write("</td>\n");
      out.write("                            <td>");
 double prom3 = (DDI[3] + DWI[3] + ECBD[3]) / (3);
                             out.print(String.format("%.1f", prom3));
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                           \n");
      out.write("                            <td>");
 out.print(Matricula[4]); 
      out.write("</td>\n");
      out.write("                            <td>");
 out.print(Nombre[4]);
      out.write("</td>\n");
      out.write("                            <td>");
 out.print(DDI[4]);
      out.write("</td>\n");
      out.write("                            <td>");
 out.print(DWI[4]);
      out.write("</td>\n");
      out.write("                            <td>");
 out.print(ECBD[4]);
      out.write("</td>\n");
      out.write("                            <td>");
 double prom4 = (DDI[4] + DWI[4] + ECBD[4]) / (3);
                             out.print(String.format("%.1f", prom4));
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            \n");
      out.write("                            <td>");
 out.print(Matricula[5]); 
      out.write("</td>\n");
      out.write("                            <td>");
 out.print(Nombre[5]);
      out.write("</td>\n");
      out.write("                            <td>");
 out.print(DDI[5]);
      out.write("</td>\n");
      out.write("                            <td>");
 out.print(DWI[5]);
      out.write("</td>\n");
      out.write("                            <td>");
 out.print(ECBD[5]);
      out.write("</td>\n");
      out.write("                            <td>");
 double prom5 = (DDI[5] + DWI[5] + ECBD[5]) / (3);
                             out.print(String.format("%.1f", prom5));
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            \n");
      out.write("                            <td>");
 out.print(Matricula[6]); 
      out.write("</td>\n");
      out.write("                            <td>");
 out.print(Nombre[6]);
      out.write("</td>\n");
      out.write("                            <td>");
 out.print(DDI[6]);
      out.write("</td>\n");
      out.write("                            <td>");
 out.print(DWI[6]);
      out.write("</td>\n");
      out.write("                            <td>");
 out.print(ECBD[6]);
      out.write("</td>\n");
      out.write("                            <td>");
 double prom6 = (DDI[6] + DWI[6] + ECBD[6]) / (3);
                             out.print(String.format("%.1f", prom6));
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            \n");
      out.write("                            <td>");
 out.print(Matricula[7]); 
      out.write("</td>\n");
      out.write("                            <td>");
 out.print(Nombre[7]);
      out.write("</td>\n");
      out.write("                            <td>");
 out.print(DDI[7]);
      out.write("</td>\n");
      out.write("                            <td>");
 out.print(DWI[7]);
      out.write("</td>\n");
      out.write("                            <td>");
 out.print(ECBD[7]);
      out.write("</td>\n");
      out.write("                            <td>");
 double prom7 = (DDI[7] + DWI[7] + ECBD[7]) / (3);
                             out.print(String.format("%.1f", prom7));
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                           \n");
      out.write("                            <td>");
 out.print(Matricula[8]); 
      out.write("</td>\n");
      out.write("                            <td>");
 out.print(Nombre[8]);
      out.write("</td>\n");
      out.write("                            <td>");
 out.print(DDI[8]);
      out.write("</td>\n");
      out.write("                            <td>");
 out.print(DWI[8]);
      out.write("</td>\n");
      out.write("                            <td>");
 out.print(ECBD[8]);
      out.write("</td>\n");
      out.write("                            <td>");
 double prom8 = (DDI[8] + DWI[8] + ECBD[8]) / (3);
                             out.print(String.format("%.1f", prom8));
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                           \n");
      out.write("                            <td>");
 out.print(Matricula[9]); 
      out.write("</td>\n");
      out.write("                            <td>");
 out.print(Nombre[9]);
      out.write("</td>\n");
      out.write("                            <td>");
 out.print(DDI[9]);
      out.write("</td>\n");
      out.write("                            <td>");
 out.print(DWI[9]);
      out.write("</td>\n");
      out.write("                            <td>");
 out.print(ECBD[9]);
      out.write("</td>\n");
      out.write("                            <td>");
 double prom9 = (DDI[9] + DWI[9] + ECBD[9]) / (3);
                             out.print(String.format("%.1f", prom9));
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\" integrity=\"sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.min.js\" integrity=\"sha384-VHvPCCyXqtD5DqJeNxl2dtTyhF78xXNXdkwX1CZeRusQfRKp+tA7hAShOK/B/fQ2\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
