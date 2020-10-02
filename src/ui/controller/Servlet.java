package ui.controller;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Domain.db.BezoekenDB;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private BezoekenDB DB = new BezoekenDB();

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String destination;
        String command = request.getParameter("command");
        if (command == null || command.isEmpty())
            command = "";
        switch (command) {
            case "overzicht":
                destination = getOverzicht(request, response);
                break;
            case "voegToe":
                destination = getVoegToe(request, response);
                break;
            default:
                destination = getHome(request, response);
                break;
        }

        RequestDispatcher view = request.getRequestDispatcher(destination);
        view.forward(request, response);

    }

    private String getHome(HttpServletRequest request, HttpServletResponse response) {
        return "index.jsp";
    }

    private String getVoegToe(HttpServletRequest request, HttpServletResponse response) {
        String naam = request.getParameter("naam");
        String rijksregister = request.getParameter("rijksregister");
        int beginuur = Integer.parseInt(request.getParameter("beginuur"));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        LocalDate datum = LocalDate.parse(request.getParameter("datum"), formatter);

        return "add.jsp";
    }

    private String getOverzicht(HttpServletRequest request, HttpServletResponse response) {
        return "overzicht.jsp";
    }
}
