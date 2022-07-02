package com.example.projetofinal.services;

import android.util.Log;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ServiceApi {
    private static String urlAPI = "https://62799ca54a5ef80e2c0c50e2.mockapi.io/";

    public static String getService(String urlMetodo, String parametro){
        String response = "";
        try{
            URL url;
            if(parametro == "")
                url = new URL(urlAPI + urlMetodo);
            else
                url =new URL(urlAPI+urlMetodo+"/"+parametro);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            InputStream in = new BufferedInputStream(conn.getInputStream());
            response = convertStreamToString(in);
            return response;
        }
        catch (Exception ex){
            Log.e("Service API",ex.getMessage());
            return null;
        }
    }

    private static String convertStreamToString(InputStream in) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        StringBuilder sb = new StringBuilder();
        String line;
        try {
            while ((line = reader.readLine()) != null) {
                sb.append(line).append('\n');
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }        }        return sb.toString();
    }

    public static String deleteService(String uriMethod) {
        try {
            URL uri = new URL(urlAPI + uriMethod);
            HttpURLConnection connection = (HttpURLConnection) uri.openConnection();
            connection.setRequestMethod("DELETE");
            InputStream in = new BufferedInputStream(connection.getInputStream());
            return "OK";
        } catch (Exception exception) {
            return null;
        }
    }

    public static String putService(String uriMethod, String data) {
        try {
            URL uri = new URL(urlAPI + uriMethod);
            HttpURLConnection connection = (HttpURLConnection) uri.openConnection();
            connection.setRequestMethod("PUT");
            InputStream in = new BufferedInputStream(connection.getInputStream());
            return "OK";
        } catch (Exception ex) {
            return null;
        }
    }
}
