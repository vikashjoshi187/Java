<%@page import="java.util.*" %>
<%@page import="dao.StateDao" %>
<%@page import="dto.StateDto" %>
<%
    StateDao state = new StateDao();
    ArrayList<StateDto> statelist = state.getStateList();
%>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP Page</title>
        <script>
            function show(){
                    var stateId = document.getElementById("stateId").value;
                    var xhttp = new XMLHttpRequest();
                    var url = "getcity.jsp?stateId="+stateId;
                    xhttp.open("GET",url,true);
                    xhttp.send();
                    
                    xhttp.onreadystatechange=function(){
                        alert(xhttp.readyState+" inside onreadystate "+xhttp.status);
                        if(xhttp.readyState===4 && xhttp.status===500){
                        alert("inside status");    
                        document.getElementById("cityId").innerHTML=xhttp.responseText();
                        }
                    };
            }
        </script>
    </head>
    <body>
    <center><h2>Ajax Example</h2>
            <select name="state" id="stateId" onchange="show()">
                <option value="">Select State</option>
                <%for(StateDto st :  statelist){%>
                <option value="<%=st.getStateId() %>"><%=st.getStateName() %></option>
                <%}%>
            </select>
            <br> <br>
            <select name="city" id="cityId">
                <option value="">Select City</option>
            </select>
        </center>
    </body>
</html>
