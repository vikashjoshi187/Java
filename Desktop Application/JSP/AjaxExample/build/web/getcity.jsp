<%@page import="com.sun.tools.xjc.api.S2JJAXBModel"%>
<%@page import="java.util.*"%>
<%@page import="dao.CityDao"%>
<%@page import="dto.CityDto"%>

<%
    int stateId = Integer.parseInt(request.getParameter("stateId"));
    CityDao city = new CityDao();
    ArrayList<CityDto> citylist = city.getCityList(stateId);
    for(CityDto ct : citylist){
   System.out.println(ct.getCityId()+"\t"+ct.getCityName());
%>
<option value="<%=ct.getCityId() %>"><%=ct.getCityName() %></option>
<%}%>