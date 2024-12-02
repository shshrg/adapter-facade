package ua.ucu.edu.apps.task3;

import org.json.JSONObject;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class PDLReader {
    // public static void main(String[] args) throws IOException {
    //     String API_KEY = "";
    //     URL url = new URL("https://api.peopledatalabs.com/v5/company/enrich?website=ucu.edu.ua");
    //     HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    //     connection.setRequestMethod("GET");
    //     connection.setRequestProperty("X-Api-Key", API_KEY);
    //     connection.connect();
    //     String text = new Scanner(connection.getInputStream()).useDelimiter("\\Z").next();
    //     JSONObject jsonObject = new JSONObject(text);
    //     System.out.println(jsonObject);
    // }
    private static final String API_KEY = "your_pdl_api_key";

    public JSONObject getCompanyInfo(String website) throws IOException {
        URL url = new URL("https://api.peopledatalabs.com/v5/company/enrich?website=" + website);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("X-Api-Key", API_KEY);
        connection.connect();
        String text = new Scanner(connection.getInputStream()).useDelimiter("\\Z").next();
        return new JSONObject(text);
    }
}
