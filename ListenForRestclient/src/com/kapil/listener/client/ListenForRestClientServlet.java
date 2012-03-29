package com.kapil.listener.client;

import java.io.IOException;
import javax.servlet.http.*;
 
@SuppressWarnings("serial")
public class ListenForRestClientServlet extends HttpServlet
{
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException
    {
        String message = "NONE";
 
        resp.setContentType("text/plain");
 
        if (req.getParameterMap().containsKey("message"))
            message = req.getParameter("message");
 
        resp.getWriter().println("You said: " + message);
    }
}
