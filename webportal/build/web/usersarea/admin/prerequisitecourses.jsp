<%-- 
    Document   : prerequisitecourses
    Created on : 28-May-2014, 20:11:58
    Author     : Ocheja Patrick Ileanwa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>

<div id="precoursesdiv" style="display: none;">

    <div id="PreCourseModal" class="modal fade">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button data-dismiss="modal" id="preViewClose" class="close" type="button">×</button>
                    <h3> Prerequisite(s) for <c:out value="${owningCourse.courseTitle}"></c:out> </h3>
                    </div>
                    <div class="modal-body">
                        <a class='btn btn-success btn-mini' 
                           onclick="preparePreCourseForm('addpreCourseModalLink', '${owningCourse.id}', '${owningCourse.courseTitle}');"
                        href='#'>
                        Add More
                    </a>
                    <table class="table table-bordered table-striped table-hover">
                        <tr>
                            <th>Course Title</th>
                            <th>Course Code</th>
                            <th>Unit Load</th>
                            <th>Department</th>
                            <th>Action</th>
                        </tr>
                        <c:forEach items="${prerequisiteCourses}" var="course">
                            <tr>
                                <td>
                                    <c:out value="${course.courseTitle}">

                                    </c:out> 
                                </td>
                                <td>
                                    <c:out value="${course.courseCode}">

                                    </c:out> 
                                </td>
                                <td>
                                    <c:out value="${course.courseUnitLoad}">

                                    </c:out> 
                                </td>
                                <td>
                                    <c:out value="${course.departmentName.name}">

                                    </c:out> 
                                </td>
                                <td>
                                    <a class='btn btn-danger btn-mini' 
                                       onclick="deletePreRow('preid=${course.id}&owningid=${owningCourse.id}&action=pre_course_delete', 'preViewClose');" href='#'>
                                        Delete
                                    </a>
                                </td>
                            </tr>
                        </c:forEach>
                    </table>
                </div>
            </div>
        </div>
    </div>
</div>
<div id="myAlert" class="modal fade">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button data-dismiss="modal" class="close" type="button">×</button>
                <h3>Confirmation</h3>
            </div>
            <div class="modal-body">
                <p id="alert_content" >Confirm Delete</p>
            </div>
            <div class="modal-footer">
                <a data-dismiss="modal" id="deleteConfirmed" class="btn btn-primary btn-small" href="#">Confirm</a>
                <a data-dismiss="modal" class="btn btn-default btn-small" href="#">Cancel</a>
            </div>
        </div>
    </div>
</div>