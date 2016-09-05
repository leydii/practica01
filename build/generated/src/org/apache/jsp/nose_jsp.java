package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class nose_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        import javax.swing.*;\n");
      out.write("import javax.swing.table.DefaultTableModel;\n");
      out.write("import java.awt.*;\n");
      out.write("import java.awt.event.*;\n");
      out.write("..public class Main extends JFrame {\n");
      out.write("....public Main() {\n");
      out.write("....Object[][] datos = {\n");
      out.write("......{\"Juan\", new Integer(25), new Boolean(false)},\n");
      out.write("......{\"Sonia\", new Integer(33), new Boolean(true) },\n");
      out.write("......{\"Pedro\", new Integer(42), new Boolean(false)},\n");
      out.write("....};\n");
      out.write("....String[] columnNames = {\"Nombre\",\"Años\",\"Apto\",};\n");
      out.write("...DefaultTableModel dtm= new DefaultTableModel(datos,columnNames);\n");
      out.write("....final JTable table = new JTable(dtm);\n");
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
