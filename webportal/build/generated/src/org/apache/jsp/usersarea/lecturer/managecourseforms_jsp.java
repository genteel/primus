package org.apache.jsp.usersarea.lecturer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class managecourseforms_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<div class=\"row\" id=\"courseform-arena\">\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/usersarea/lecturer/approvecourseforms.jsp", out, false);
      out.write("    \n");
      out.write("</div>\n");
      out.write("<a href=\"#addLecturerCourseModal\" id=\"addLecturerCourseModalLink\" data-toggle=\"modal\" style=\"display:none\" class=\"btn btn-primary\"></a>\n");
      out.write("<a href=\"#addLecturerPositionModal\" id=\"addLecturerPositionModalLink\" data-toggle=\"modal\" style=\"display:none\" class=\"btn btn-primary\"></a>\n");
      out.write("<a href=\"#LecturerCourseModal\" id=\"LecturerCourseModalLink\" data-toggle=\"modal\" style=\"display:none\" class=\"btn btn-primary\"></a>\n");
      out.write("<a href=\"#studentCoursesModal\" id=\"studentCoursesModalLink\" data-toggle=\"modal\" style=\"display:none\" class=\"btn btn-primary\"></a>\n");
      out.write("<a href=\"#LecturerPositionModal\" id=\"LecturerPositionModalLink\" data-toggle=\"modal\" style=\"display:none\" class=\"btn btn-primary\"></a>\n");
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
      out.write("                <p id=\"alert_content\" >Confirm Action</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-footer\">\n");
      out.write("                <a data-dismiss=\"modal\" id=\"actionConfirmed\" class=\"btn btn-primary btn-small\" href=\"#\">Confirm</a>\n");
      out.write("                <a data-dismiss=\"modal\" class=\"btn btn-default btn-small\" href=\"#\">Cancel</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<div id=\"addLecturerCourseModal\" class=\"modal fade\">\n");
      out.write("    <div class=\"modal-dialog\">\n");
      out.write("        <div class=\"modal-content\">\n");
      out.write("            <div class=\"modal-header\">\n");
      out.write("                <button data-dismiss=\"modal\" class=\"close\" id=\"viewCoursesCloseXtra\" type=\"button\">×</button>\n");
      out.write("                <h3>New Course (s) for <h4 class=\"owning_lecturer_space\" ></h4>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-body\">\n");
      out.write("                <form class=\"form-horizontal\" method=\"post\" action=\"\" name=\"add_lecturer_course_form\" id=\"add_lecturer_course_form\" novalidate=\"novalidate\">\n");
      out.write("\n");
      out.write("                    <input type=\"hidden\" id=\"owningLecturer\" name=\"owningLecturer\"/>\n");
      out.write("\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label class=\"control-label\">Course (s)</label>\n");
      out.write("                        <div class=\"controls\">\n");
      out.write("                            <select multiple id=\"courses\" name=\"courses\" class=\"required\">\n");
      out.write("                                <c:forEach items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${courses}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"  var=\"course\">\n");
      out.write("                                    <option value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${course.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" > <c:out value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${course.courseTitle}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(' ');
      out.write('(');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${course.courseCode}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(")\"/> </option>\n");
      out.write("                                </c:forEach>\n");
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
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"addLecturerPositionModal\" class=\"modal fade\">\n");
      out.write("    <div class=\"modal-dialog\">\n");
      out.write("        <div class=\"modal-content\">\n");
      out.write("            <div class=\"modal-header\">\n");
      out.write("                <button data-dismiss=\"modal\" class=\"close\" id=\"viewPositionCloseXtra\" type=\"button\">×</button>\n");
      out.write("                <h3>New Position (s) for <h4 class=\"owning_lecturer_space\" ></h4>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-body\">\n");
      out.write("                <form class=\"form-horizontal\" method=\"post\" action=\"\" name=\"add_lecturer_position_form\" id=\"add_lecturer_position_form\" novalidate=\"novalidate\">\n");
      out.write("\n");
      out.write("                    <input type=\"hidden\" id=\"owningLecturer\" name=\"owningLecturer\"/>\n");
      out.write("\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label class=\"control-label\">Position (s)</label>\n");
      out.write("                        <div class=\"controls\">\n");
      out.write("                            <select multiple id=\"positions\" name=\"positions\" class=\"required\">\n");
      out.write("                                <c:forEach items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${positions}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"  var=\"position\">\n");
      out.write("                                    <option value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${position}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" > <c:out value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${position}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/> </option>\n");
      out.write("                                </c:forEach>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label class=\"control-label\">Level</label>\n");
      out.write("                        <div class=\"controls\">\n");
      out.write("                            <select id=\"academiclevel\" name=\"academiclevel\" disabled=\"disabled\" class=\"required\">\n");
      out.write("                                <option value=\"\" selected=\"\"></option>\n");
      out.write("                                <c:forEach items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${levels}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"  var=\"level\">\n");
      out.write("                                    <option value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${level}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" > <c:out value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${level}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/> </option>\n");
      out.write("                                </c:forEach>\n");
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
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"studentcoursesdiv\">\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<div id=\"lecturerpositionsdiv\">\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<script>\n");
      out.write("    $(document).ready(function() {\n");
      out.write("        $('select').select2();\n");
      out.write("        $(\"#positions\").change(function() {\n");
      out.write("            toggleacademiclevelFields();\n");
      out.write("        });\n");
      out.write("    });\n");
      out.write("    function validateCourseForm(data, url, preViewBoxToClose,modalID) {\n");
      out.write("        $('#' + preViewBoxToClose).click();\n");
      out.write("        $(\"#\" + modalID).click();\n");
      out.write("        $(\"#actionConfirmed\").click(function() {\n");
      out.write("            \n");
      out.write("            console.log('dadddsdsd: '+data+'Urrrrrlrllll:'+url);\n");
      out.write("            $.ajax({\n");
      out.write("                url: url,\n");
      out.write("                type: 'GET',\n");
      out.write("                data: data,\n");
      out.write("                async: false,\n");
      out.write("                dataType: 'json',\n");
      out.write("                success: function(resp) {\n");
      out.write("                    $(\"#message_content\").text(\"Status - \" + resp.message);\n");
      out.write("                    $(\"#informerModalLink\").click();\n");
      out.write("                },\n");
      out.write("                error: function(request, status, errorThrown) {\n");
      out.write("                    $(\"#message_content\").text(\"Status - \" + status);\n");
      out.write("                    $(\"#informerModalLink\").click();\n");
      out.write("\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("        return false;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function deleteLecturerCourseRow(data, extra) {\n");
      out.write("        $.ajax\n");
      out.write("                ({\n");
      out.write("                    url: '/Primus/admin/ajax',\n");
      out.write("                    data: data,\n");
      out.write("                    async: false,\n");
      out.write("                    type: 'POST',\n");
      out.write("                    dataType: 'json',\n");
      out.write("                    beforeSend: function() {\n");
      out.write("                    },\n");
      out.write("                    success: function(resp) {\n");
      out.write("                        $(\"#message_content\").text(\"Action completed. Status --- \" + resp.message);\n");
      out.write("                        if (extra !== null) {\n");
      out.write("                            $(\"#\" + extra).click();\n");
      out.write("                        }\n");
      out.write("                        $(\"#informerModalLink\").click();\n");
      out.write("                        return false;\n");
      out.write("                    },\n");
      out.write("                    error: function(request, status, errorThrown) {\n");
      out.write("                        console.log(errorThrown);\n");
      out.write("                        var d = $(status);\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("        return false;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function toggleacademiclevelFields() {\n");
      out.write("        var selectedItems = [];\n");
      out.write("        var containsPosition = false;\n");
      out.write("//selector uses id substring\n");
      out.write("        $(\"#positions option:selected\").each(function(i, obj) {\n");
      out.write("            \n");
      out.write("            console.log('position:'+$(this).val());\n");
      out.write("            if($(this).val()==='ACADEMIC_ADVISER'){\n");
      out.write("                containsPosition = true;\n");
      out.write("        }\n");
      out.write("        });\n");
      out.write("        if(containsPosition){\n");
      out.write("            $(\"#academiclevel\").removeAttr('disabled');\n");
      out.write("        }else {\n");
      out.write("            $(\"#academiclevel\").attr('disabled', 'true');\n");
      out.write("            $(\"#academiclevel\").attr('value', '');\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    \n");
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
}