/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myServlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author olade
 */
@WebServlet(name = "DeleteCookiesServlet", urlPatterns = {"/DeleteCookiesServlet"})
public class DeleteCookiesServlet extends HttpServlet {
     private static final long serialVersionUID = 1L;
     
    public DeleteCookiesServlet(){
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        {
          
                   PrintWriter writer = response.getWriter();
 Cookie[] cookies = request.getCookies();
 
 if (cookies != null){
     for (Cookie aCookie: cookies){
         aCookie.setMaxAge(0);
         response.addCookie(aCookie);
     }
     writer.println("All cookies have been deleted!");
     
 }
 else{
     writer.println("No cookies found");
 }
            
     
        }
    }

}
