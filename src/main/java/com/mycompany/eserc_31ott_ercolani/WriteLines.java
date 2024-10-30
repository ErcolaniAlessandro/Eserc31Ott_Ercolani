/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eserc_31ott_ercolani;

/**
 *
 * @author Utente
 */
import java.io.*;
public class WriteLines {
public WriteLines(String filename) throws IOException { PrintWriter output =
new PrintWriter(new FileWriter(filename)); 
BufferedReader input =
new BufferedReader(new InputStreamReader(System.in));
String linea = input.readLine(); while (!linea.equals("")) {
output.println(linea); linea = input.readLine();
}
input.close(); output.close();
}}
