package ua.ucu.edu.apps.task3;

import org.json.JSONObject;

public class WebScraper {
    public JSONObject scrapeCompanyInfo(String website) {
        return new JSONObject().put("source", "WebScraper").put("info", "Scraped company info");
    }
}