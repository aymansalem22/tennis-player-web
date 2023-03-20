package com.paltecno;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Servlet implementation class PlayerServlet
 * http://localhost:8080/tennis-player-web/player.do
 */
//@WebServlet(name = "tennis-player-web", urlPatterns = { "/player.do", "/" }) 
public class PlayerServlet extends HttpServlet {
	
	@Autowired
	PlayerService service;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String playerName = request.getParameter("name");
		request.setAttribute("name", playerName);
		request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String playerName = request.getParameter("name");
		Player player = service.getPlayerByName(playerName);
		request.setAttribute("name", playerName);
		request.setAttribute("country", player.getNationality());
		request.setAttribute("dob", player.getBirthDate());
		request.setAttribute("titles", player.getTitles());
		request.getRequestDispatcher("/WEB-INF/views/info.jsp").forward(request, response);
	}
	


}
