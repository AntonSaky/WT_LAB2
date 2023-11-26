package com.example.demo1;

import java.io.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

//@WebServlet(name = "helloServlet", value = "/hello-servlet")
//public class HelloServlet extends HttpServlet {
//    private String message;
//
//    public void init() {
//        message = "Hello World!";
//    }
//
//    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        response.setContentType("text/html");
//
//        // Hello
//        PrintWriter out = response.getWriter();
//        out.println("<html><body>");
//        out.println("<h1>" + message + "</h1>");
//        out.println("</body></html>");
//    }
//
//    public void destroy() {
//    }
//}

public class HelloServlet extends HttpServlet{

    private String uri;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String uri = req.getRequestURI();
//        System.out.println(uri);
//        String page = "";
//        if (uri.contains("hello")){
//            page = "JSP/newsomae.jsp";
//        }else{
//            page = "soame.jsp";
//        }

//        if(uri.contains("/css/")){
//            try
//            {
//                resp.setContentType("text/css");
//                resp.setHeader("Content-Disposition", "attachment; filename=\"main.css\"");
//                InputStream inputStream = new FileInputStream(uri);
//
//                OutputStream outputStream = resp.getOutputStream();
//                byte[] buffer = new byte[4096];
//                int bytesRead;
//                while ((bytesRead = inputStream.read(buffer)) != -1) {
//                    outputStream.write(buffer, 0, bytesRead);
//                }
//                inputStream.close();
//                outputStream.close();
//            }
//            catch(IOException ex){
//
//                System.out.println(ex.getMessage());
//            }
//
//        }
//        RequestDispatcher dispatcher = req.getRequestDispatcher(page);
//        if(dispatcher != null){
//            dispatcher.forward(req, resp);
//        }
    }
}