<%-- 
    Document   : register-course
    Created on :  22-August-2014, 12:35:21
    Author     : Ocheja Patrick Ileanwa
--%>

<%@page import="com.primus.appstates.LecturerState"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link rel="stylesheet" href="<%=request.getContextPath()%>/usersarea/css/icheck/flat/green.css" />
<!DOCTYPE html>
<div class="row" id="courseform-arena">
    <div class="col-12">
        <div class="widget-box">
            <div class="widget-content nopadding">
                <c:forEach items="<%= LecturerState.getInstance(request).getCurrentLecturer().getLecturerType().getPositions()%>" var="position">
                    <c:if test="${position eq 'STAFF_ADVISER'}">
                    <a class="btn btn-success btn-mini" href="<%= request.getContextPath()%>/view?parent=<%=LecturerState.LecturerParentViews.ADD_NEW_TIMETABLE.name()%>" id="addTimetable" >Add To Timetable</a>
                    <a class="btn btn-success btn-mini" href="<%= request.getContextPath()%>/view?parent=<%=LecturerState.LecturerParentViews.EDIT_TIMETABLE.name()%>" id="editTimetable">Edit Timetable</a>

                </c:if>
                </c:forEach>
            </div>
            <form method="GET" action="<%= request.getContextPath()%>/view">
                <div class="form-group">
                    <div class="controls">
                        Select Department
                        <select id="departmentName" name="departmentName" class="required">
                            <option value="" selected></option>
                            <c:forEach items="${departmentNames}"  var="departmentName">
                                <option value="${departmentName.id}" > <c:out value="${departmentName.name}"/> </option>
                            </c:forEach>
                        </select>
                        <input type="submit" value="View" id="view_btn" class="btn btn-success btn-small">
                        <input type="hidden" id="parent" name="parent" value="<%=LecturerState.LecturerParentViews.VIEW_TIMETABLE.name()%>"/>
                    </div>
                </div>
            </form>
            <div class="widget-box widget-calendar">
                <div class="widget-title">
                    <span class="icon"><i class="glyphicon glyphicon-calendar"></i></span>
                    <h5>TIMETABLE</h5>
                </div>
                <jsp:include page="/usersarea/lecturer/timetableday.jsp"/>
            </div>
        </div>
    </div>
</div> 
<div id="addrequiredcoursesdiv">

</div>
<a href="#addRequiredCoursesModal" id="addRequiredCoursesModalLink" data-toggle="modal" style="display:none" class="btn btn-primary"></a>
<a href="#myAlertH" id="myAlertHModalLink" data-toggle="modal" style="display:none" class="btn btn-primary"></a>
<a href="#InformerModal" id="informerModalLink" data-toggle="modal" style="display:none" class="btn btn-primary"></a>
<div id="InformerModal" class="modal fade">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button data-dismiss="modal" class="close" type="button">×</button>
                <h3>Notification</h3>
            </div>
            <div class="modal-body">
                <p id="message_content">Success</p>
            </div>
        </div>
    </div>
</div>
<div id="myAlertH" class="modal fade">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button data-dismiss="modal" id="myAlertHClose" class="close" type="button">×</button>
                <h3>Confirmation</h3>
            </div>
            <div class="modal-body">
                <p id="alert_content" >Submit Form?</p>
            </div>
            <div class="modal-footer">
                <a  id="regConfirmed" class="btn btn-primary btn-small" onclick="submitForm('requiredCoursesForm', 'action=registerCourses', 'messageAlert');" href="#">YES</a>
                <a data-dismiss="modal" class="btn btn-default btn-small" href="#">NO</a>
            </div>
        </div>
    </div>
</div>

<script src="<%=request.getContextPath()%>/usersarea/js/ajax-submission.js"></script>
<script src="<%=request.getContextPath()%>/usersarea/js/jquery.icheck.min.js"></script>
<script src="<%=request.getContextPath()%>/usersarea/js/jquery.validate.js"></script>
<script src="<%=request.getContextPath()%>/usersarea/js/select2.min.js"></script>
<script src="<%=request.getContextPath()%>/usersarea/js/jquery.dataTables.min.js"></script>
<script src="<%=request.getContextPath()%>/usersarea/js/unicorn.tables.js"></script>
<script src="<%=request.getContextPath()%>/usersarea/js/jquery-ui.custom.js"></script>
<script src="<%=request.getContextPath()%>/usersarea/js/jquery.jpanelmenu.min.js"></script>
<script src="<%=request.getContextPath()%>/usersarea/js/fullcalendar.min.js"></script>
<script src="<%=request.getContextPath()%>/usersarea/js/unicorn.js"></script>
<script src="<%=request.getContextPath()%>/usersarea/js/unicorn.calendar.js"></script>