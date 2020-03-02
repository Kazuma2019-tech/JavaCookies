/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myServlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author olade
 */
@WebServlet(name = "AddCookiesServlet", urlPatterns = {"/AddCookiesServlet"})
public class AddCookiesServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private static int cookieCount;
    
    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
            String name = "Cookie" + (++cookieCount);
            String value = String.valueOf(System.currentTimeMillis());
            Cookie cookie = new Cookie(name, value);
            
            response.addCookie(cookie);
            response.getWriter().println("A cookie has been created successfully!");
           
}
    }
