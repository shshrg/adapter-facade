package ua.ucu.edu.apps.task3;

import org.json.JSONObject;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Brandfetch {
    private static final String API_KEY = "your_brandfetch_api_key";

    public JSONObject getCompanyInfo(String domain) throws IOException {
        URL url = new URL("https://api.brandfetch.io/v1/company/" + domain);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Authorization", "Bearer " + API_KEY);
        connection.connect();
        String text = new Scanner(connection.getInputStream()).useDelimiter("\\Z").next();
        return new JSONObject(text);
    }
}