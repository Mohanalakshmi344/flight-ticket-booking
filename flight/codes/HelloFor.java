import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
// Extend HttpServlet class
public class HelloFor extends HttpServlet {
public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException
{
response.setContentType("text/html");
PrintWriter out = response.getWriter();
String title = "AIR INDIA BOARDING PASS";
out.println(
"<html>\n" +"<head><title >" + title + "</title></head>\n" );
out.println("<style>");
out.println("body{font-size : 25px;style='background-color : #00FFFF;' border:15px; }");
out.println("h1{style='color : #A52A2A;' }");
out.println("</style>");
out.println(
"<h1 align=\"center\" color=\"#A52A2A\">" + title + "</h1>\n" +
"<body bgcolor=\"#00FFFF\"align=\"center\">\n" +
" <b>Name of passenger</b>: "
+ request.getParameter("First_name") + "\n&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp"+
" <b>Travel type</b>: "
+ request.getParameter("travel") + "</br></br>\n" +
"<b>Departure</b>: "
+ request.getParameter("departure") + "\n&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp" +
" <b>Arrival</b>: "
+ request.getParameter("arrival") + "</br></br>\n" +
" <b>Date & Time of travel</b>: "
+ request.getParameter("dot") + "</br></br>\n" +
"<b>Flight code</b>: "
+ request.getParameter("code") + "&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp\n" +
" <b>Class</b>: "
+ request.getParameter("class") + "&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp\n" +
" <b>Seat no:</b>: 13A" + "\n" +
"</body></html>"
);
} }
