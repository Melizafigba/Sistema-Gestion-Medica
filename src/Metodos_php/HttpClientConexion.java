/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos_php;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author maite
 */
public class HttpClientConexion {
    

//this.httpget("https://api.chucknorris.io/jokes/random");
    
public static String httpget(String testurl) throws Exception{
        StringBuilder result = new StringBuilder();
        URL url = new URL(testurl);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()))){
           
        for (String line; (line = reader.readLine()) != null; ){
        result.append(line);
        }
            }
        return result.toString();
        
}
}