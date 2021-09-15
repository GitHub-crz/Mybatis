package com.crz.servlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Properties;

public class HelloServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context=this.getServletContext();
        String name="crz";
        context.setAttribute("name",name);
        PrintWriter writer=resp.getWriter();
        writer.println("Hello,Servlet");

        InputStream is=context.getResourceAsStream("/WEB-INF/classes/db.properties");
        Properties prop=new Properties();
        prop.load(is);
        String user=prop.getProperty("username");
        String pwd=prop.getProperty("password");
        resp.getWriter().print(user+" "+pwd);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}