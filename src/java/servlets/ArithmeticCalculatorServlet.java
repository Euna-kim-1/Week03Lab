package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ArithmeticCalculatorServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request,response);   
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String firstNum = request.getParameter("firstNum");
        String secondNum = request.getParameter("secondNum");
        String operation = request.getParameter("operation");
      
        
        
        if (firstNum == null || firstNum.equals("") || secondNum == null || secondNum.equals(""))
        {
            request.setAttribute("result", "Invalid");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
        }
        else if (operation.equals("+"))
        {
            int first = Integer.parseInt(firstNum);
            int second = Integer.parseInt(secondNum);
            
            request.setAttribute("result", first + second);
            request.setAttribute("firstNum", first);
            request.setAttribute("secondNum", second);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
        }
        else if (operation.equals("-"))
        {
            int first = Integer.parseInt(firstNum);
            int second = Integer.parseInt(secondNum);
            
            request.setAttribute("result", first - second);
            request.setAttribute("firstNum", first);
            request.setAttribute("secondNum", second);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
        }
        else if (operation.equals("*"))
        {
            int first = Integer.parseInt(firstNum);
            int second = Integer.parseInt(secondNum);
            
            request.setAttribute("result", first * second);
            request.setAttribute("firstNum", first);
            request.setAttribute("secondNum", second);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
        }
         else if (operation.equals("%"))
        {
            int first = Integer.parseInt(firstNum);
            int second = Integer.parseInt(secondNum);
            
            request.setAttribute("result", first % second);
            request.setAttribute("firstNum", first);
            request.setAttribute("secondNum", second);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
        }
        
 
    }    
}

