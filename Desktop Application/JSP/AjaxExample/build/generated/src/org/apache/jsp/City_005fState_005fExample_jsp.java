package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import dao.StateDao;
import dto.StateDto;

public final class City_005fState_005fExample_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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

    StateDao state = new StateDao();
    ArrayList<StateDto> statelist = state.getStateList();

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script>\n");
      out.write("            function show(){\n");
      out.write("                    var stateId = document.getElementById(\"stateId\").value;\n");
      out.write("                    var xhttp = new XMLHttpRequest();\n");
      out.write("                    var url = \"getcity.jsp?stateId=\"+stateId;\n");
      out.write("                    xhttp.open(\"GET\",url,true);\n");
      out.write("                    xhttp.send();\n");
      out.write("                    \n");
      out.write("                    xhttp.onreadystatechange=function(){\n");
      out.write("                        alert(xhttp.readyState+\" inside onreadystate \"+xhttp.status);\n");
      out.write("                        if(xhttp.readyState===4 && xhttp.status===500){\n");
      out.write("                        alert(\"inside status\");    \n");
      out.write("                        document.getElementById(\"cityId\").innerHTML=xhttp.responseText();\n");
      out.write("                        }\n");
      out.write("                    };\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center><h2>Ajax Example</h2>\n");
      out.write("            <select name=\"state\" id=\"stateId\" onchange=\"show()\">\n");
      out.write("                <option value=\"\">Select State</option>\n");
      out.write("                ");
for(StateDto st :  statelist){
      out.write("\n");
      out.write("                <option value=\"");
      out.print(st.getStateId() );
      out.write('"');
      out.write('>');
      out.print(st.getStateName() );
      out.write("</option>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("            </select>\n");
      out.write("            <br> <br>\n");
      out.write("            <select name=\"city\" id=\"cityId\">\n");
      out.write("                <option value=\"\">Select City</option>\n");
      out.write("            </select>\n");
      out.write("        </center>\n");
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
