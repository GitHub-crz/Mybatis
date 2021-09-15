package com.crz;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;

public class down extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String realPath="/home/robocup/下载/证件照.jpg";
        String fileName=realPath.substring(realPath.lastIndexOf('/')+1,realPath.length());
        System.out.println(fileName);
        resp.setHeader("Content-Disposition","attachment;filename="+ URLEncoder.encode(fileName,"UTF-8"));

        FileInputStream in=new FileInputStream(realPath);
        int len=0;
        byte[] buffer=new byte[1024000];
        ServletOutputStream out=resp.getOutputStream();
        while((len=in.read(buffer))>0){
            out.write(buffer,0,len);
        }
        in.close();out.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
