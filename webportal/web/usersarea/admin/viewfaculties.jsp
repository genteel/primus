<%-- 
    Document   : adminhomepage
    Created on : 14-May-2014, 06:03:50
    Author     : Ocheja Patrick Ileanwa
--%>
<%@page import="com.primus.appstates.AdministratorState"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<link rel="stylesheet" href="<%=request.getContextPath()%>/usersarea/css/jquery.dataTables.css" />
<script src="<%=request.getContextPath()%>/usersarea/js/unicorn.interface.js"></script>
<script src="<%=request.getContextPath()%>/usersarea/js/jquery.dataTables.min.js"></script>
<script src="<%=request.getContextPath()%>/usersarea/js/jquery.jeditable.js"></script>
<script src="<%=request.getContextPath()%>/usersarea/js/jquery.dataTables.editable.js"></script>
<input type="hidden" id="nodeView" name="nodeView" value="view">
<div class="row">
    <div class="col-12">

        <div class="widget-box">
            <div class="widget-title">
                <span class="icon">
                    <i class="glyphicon glyphicon-th"></i>
                </span>
                <h5>Faculties</h5>
            </div>
            <div class="widget-content">
                <table id="facultyData" class="display" cellspacing="0" width="100%">
                    <thead>
                        <tr>
                            <th>Serial No.</th>
                            <th>Faculty Name</th>
                            <th>Description</th>
                            <th>Action</th>
                        </tr>
                    </thead>
                    <tbody>

                    </tbody>
                    <tfoot>
                        <tr>
                            <th>Serial No.</th>
                            <th>Faculty Name</th>
                            <th>Description</th>
                            <th>Action</th>
                        </tr>
                    </tfoot>
                </table>
            </div>
        </div>  		
    </div>
</div>
<script src="<%=request.getContextPath()%>/usersarea/js/datatable/facultydata.js"></script>
<a href="#InformerModal" id="informerModalLink" data-toggle="modal" style="display:none" class="btn btn-primary"></a>
<a href="#myAlert" id="myAlertLink" data-toggle="modal" style="display:none" class="btn btn-danger">Alert</a>
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