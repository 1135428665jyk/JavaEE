package com.jyk.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * <pre>
 * Modify Information:
 * Author        Date          Description
 * ============ =========== ============================
 * jiyukun     2021年02月20日    Create this file
 * </pre>
 */
public class LoginController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        resp.setContentType("text/html");
        writer.write("\r\n");
        writer.write("<html>");
        writer.write("<head>");
        writer.write("</head>");
        writer.write("<body>");
        writer.write("<form action=\"service\" method=\"post\">\n" +
                "  <p>name: <input type=\"text\" name=\"name\" /></p>\n" +
                "  <p>password: <input type=\"text\" name=\"password\" /></p>\n" +
                "  <input type=\"submit\" value=\"Submit\" />\n" +
                "</form>");
        writer.write("</body>");
        writer.write("</html>");
    }
}