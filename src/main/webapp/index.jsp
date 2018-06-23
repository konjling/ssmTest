<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<jsp:forward page="/user/getAll"/>--%>
<%
    pageContext.setAttribute("APP_PATH_C",request.getContextPath());

%>
<jsp:include page="${APP_PATH_C}/common.jsp"></jsp:include>
<html>
<body>
<input type="text"  name="user">
<input type="text"  name="user">
<input type="text"  name="user">
<button class="btn btn-sm" id="ensure">确认</button>
</body>
<script type="text/javascript">
    $(function(){

   $("#ensure").click(function(){
       var userList = new Array();
       for(var i=0;i<$("input[name='user']").length;i++){
           var user = {
               id : $("input[name='user']")[i].value,
               name : 'hh'
           };
           userList.push(user);
       }
    /*  $.post("user/test",
          {
           userList : userList
          });*/
    var num = [1,2,3];
    $.ajax({
        url : "user/test",
        data : {
            userList : userList,
            deptName : "555"
        },
        dataType : "json",
        contentType : 'application/json'
    });


   });
    })
</script>
</html>
