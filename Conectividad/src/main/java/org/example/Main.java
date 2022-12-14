package org.example;

import resistencia.MySQLConection;

public class Main {
    public static void main(String[] args) {

        //System.out.println("H");
        MySQLConection connection = new MySQLConection();
        connection.establecerConexion();
    }
}