package com.uplooking.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/book")
public class BookServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("doPost");
        System.out.println("doPost");
        System.out.println("doPost");
        System.out.println("doPost");
        System.out.println("doPost");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("doGet");
        System.out.println("doGet");
        System.out.println("doGet");
        System.out.println("doGet");
        System.out.println("doGet");
        System.out.println("doGet");
        System.out.println("doGet");
        System.out.println("doGet1");
        System.out.println("doGet1");
        System.out.println("doGet2");
        System.out.println("doGet2");
        System.out.println("doGet1");
    }
}
