package org.apache.jsp.usersarea.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.primus.appstates.AdministratorState;

public final class createdepartment_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_out_value_nobody.release();
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<input type=\"hidden\" id=\"nodeView\" name=\"nodeView\" value=\"create\">\n");
      out.write("<div class=\"row\">\n");
      out.write("    <div class=\"col-12\">\n");
      out.write("        <div class=\"widget-box\">\n");
      out.write("            <div class=\"widget-title\">\n");
      out.write("                <span class=\"icon\">\n");
      out.write("                    <i class=\"glyphicon glyphicon-align-justify\"></i>\t\t\t\t\t\t\t\t\t\n");
      out.write("                </span>\n");
      out.write("                <h5>New Department Form</h5>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"widget-content nopadding\">\n");
      out.write("                <form class=\"form-horizontal\" method=\"post\" action=\"\" name=\"create_department_form\" id=\"create_department_form\" novalidate=\"novalidate\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label class=\"control-label\">Name of Department</label>\n");
      out.write("                        <div class=\"controls\">\n");
      out.write("                            <input type=\"hidden\" class=\"required\" id=\"departmentName\" name=\"departmentName\"/>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label class=\"control-label\">Description</label>\n");
      out.write("                        <div class=\"controls\">\n");
      out.write("                            <input type=\"text\" class=\" required form-control input-small\" name=\"description\" id=\"description\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label class=\"control-label\">Faculty</label>\n");
      out.write("                        <div class=\"controls\">\n");
      out.write("                            <select  class=\"required\" id=\"faculty\" name=\"faculty\">\n");
      out.write("                                <option selected=\"selected\" value=\"\"></option>\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-actions\">\n");
      out.write("                        <input type=\"submit\" value=\"Create\" id=\"create_btn\" class=\"btn btn-success btn-max\">\n");
      out.write("                        <div id=\"loading_gif\" style=\"display: none\">\n");
      out.write("                            <img src=\"");
      out.print(request.getContextPath());
      out.write("/usersarea/img/notice_spinner.gif\"/>\n");
      out.write("                            <label id=\"message_on_end\">Loading...</label>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\t\t\t\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"row\">\n");
      out.write("    <div class=\"col-12\">\n");
      out.write("        <div class=\"widget-box\">\n");
      out.write("            <div class=\"widget-title\">\n");
      out.write("                <span class=\"icon\">\n");
      out.write("                    <i class=\"glyphicon glyphicon-align-justify\"></i>\t\t\t\t\t\t\t\t\t\n");
      out.write("                </span>\n");
      out.write("                <h5>Batch Department Creation (EXCEL)</h5>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"widget-content nopadding\">\n");
      out.write("                <form class=\"form-horizontal\" method=\"post\" action=\"/Primus/faculty\" name=\"create_batch_faculty_form\" id=\"create_batch_faculty_form\" novalidate=\"novalidate\">\n");
      out.write("\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label class=\"control-label\">Excel file</label>\n");
      out.write("                        <div class=\"controls\">\n");
      out.write("                            <input type=\"file\" name=\"excelFile\" id=\"excelFile\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-actions\">\n");
      out.write("                        <input type=\"submit\" value=\"Create\" id=\"create_btn\" class=\"btn btn-success btn-max\">\n");
      out.write("                    </div>\n");
      out.write("            </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </div>\t\t\t\n");
      out.write("</div>\n");
      out.write("<a href=\"#InformerModal\" id=\"informerModalLink\" data-toggle=\"modal\" style=\"display:none\" class=\"btn btn-primary\"></a>\n");
      out.write("<a href=\"#myAlert\" id=\"myAlertLink\" data-toggle=\"modal\" style=\"display:none\" class=\"btn btn-danger\">Alert</a>\n");
      out.write("<div id=\"InformerModal\" class=\"modal fade\">\n");
      out.write("    <div class=\"modal-dialog\">\n");
      out.write("        <div class=\"modal-content\">\n");
      out.write("            <div class=\"modal-header\">\n");
      out.write("                <button data-dismiss=\"modal\" class=\"close\" type=\"button\">×</button>\n");
      out.write("                <h3>Notification</h3>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-body\">\n");
      out.write("                <p id=\"message_content\">Success</p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<div id=\"myAlert\" class=\"modal fade\">\n");
      out.write("    <div class=\"modal-dialog\">\n");
      out.write("        <div class=\"modal-content\">\n");
      out.write("            <div class=\"modal-header\">\n");
      out.write("                <button data-dismiss=\"modal\" class=\"close\" type=\"button\">×</button>\n");
      out.write("                <h3>Confirmation</h3>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-body\">\n");
      out.write("                <p id=\"alert_content\" >Confirm Delete</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-footer\">\n");
      out.write("                <a data-dismiss=\"modal\" id=\"deleteConfirmed\" class=\"btn btn-primary btn-small\" href=\"#\">Confirm</a>\n");
      out.write("                <a data-dismiss=\"modal\" class=\"btn btn-default btn-small\" href=\"#\">Cancel</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<script>\n");
      out.write("    $(document).ready(function() {\n");
      out.write("        var lastResults = [];\n");
      out.write("        $('select').select2();\n");
      out.write("        $(\"#departmentName\").select2({\n");
      out.write("            placeholder: \"Search for a department name or add new\",\n");
      out.write("            minimumInputLength: 3,\n");
      out.write("            multiple: false,\n");
      out.write("                ajax: {\n");
      out.write("                url: \"/Primus/admin/ajax\",\n");
      out.write("                dataType: 'json',\n");
      out.write("                type: \"GET\",\n");
      out.write("                    data: function(term, page) {\n");
      out.write("                        return {\n");
      out.write("                        q: term, // search term\n");
      out.write("                    action: \"departmentNames\"\n");
      out.write("                };\n");
      out.write("                },\n");
      out.write("                    results: function(data, page) {\n");
      out.write("                    lastResults = data;\n");
      out.write("                return {results: data};\n");
      out.write("                }\n");
      out.write("                },\n");
      out.write("                    createSearchChoice: function(term) {\n");
      out.write("                        var text = term + (lastResults.some(function(r) {\n");
      out.write("                    return r.text === term;\n");
      out.write("                    }) ? \"\" : \" (new)\");\n");
      out.write("            return {id: term, text: text};\n");
      out.write("        }\n");
      out.write("    });\n");
      out.write("    });\n");
      out.write("</script>");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${faculties}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("faculty");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${faculty.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" > ");
          if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write(" </option>\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${faculty.facultyName.name}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }
}
