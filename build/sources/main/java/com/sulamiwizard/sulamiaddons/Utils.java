package com.sulamiwizard.sulamiaddons;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.AbstractMap;
import java.util.Map;

public class Utils {
    public static String getResponse(String url_string) {
        StringBuffer response;
        HttpURLConnection con;
        IOException ioException;
        try {
            URL url = new URL(url_string);

            con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("User-Agent", "SOOPY IS POG");

            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            response = new StringBuffer();

            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            return response.toString();
        } catch (IOException e) {
            return null;
        }
    }

    public static JsonElement getJsonResponse(String url) {
        try {
            String response = getResponse(url);
            if (response == null) return new JsonObject();
            return new JsonParser().parse(response);
        } catch (Exception e) {
            return new JsonObject();
        }
    }

}