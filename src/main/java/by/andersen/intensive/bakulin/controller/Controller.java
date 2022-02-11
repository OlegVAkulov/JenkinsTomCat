package by.andersen.intensive.bakulin.controller;

import javax.servlet.http.HttpServlet;
import java.sql.Connection;
import java.sql.DriverManager;

public class Controller extends HttpServlet {
    public static void main(String[] args) {
        Connection c = null;
            try {
                Class.forName("org.postgresql.Driver");
                c = DriverManager
                        .getConnection("jdbc:postgresql://192.168.0.32:1233/test_db",
                                "postgres", "postgres");
            } catch (Exception e) {
                e.printStackTrace();
                System.err.println(e.getClass().getName()+": "+e.getMessage());
                System.exit(0);
            }
            System.out.println("Opened database successfully");
        }
    }


