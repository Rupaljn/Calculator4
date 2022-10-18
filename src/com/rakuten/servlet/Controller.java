package com.rakuten.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Controller() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String num1 = request.getParameter("num1");
		String num2 = request.getParameter("num2");
		try{
			int n1 = Integer.parseInt(num1);
			int n2 = Integer.parseInt(num2);
			int result = n1/n2;
			request.setAttribute("result", result);
			RequestDispatcher rd = request.getRequestDispatcher("HomeView.jsp");
			rd.forward(request, response);
		}
		catch(NumberFormatException n){
			n.printStackTrace();
			String msg = "Please enter numeric";
			request.setAttribute("msg", msg);
			RequestDispatcher rd = request.getRequestDispatcher("HomeView.jsp");
			rd.forward(request, response);
		}
		catch(ArithmeticException a){
			a.printStackTrace();
			String msg1 = "Please do not divied by zero";
			request.setAttribute("msg1", msg1);
			RequestDispatcher rd = request.getRequestDispatcher("HomeView.jsp");
			rd.forward(request, response);
			}
	}
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	
	}