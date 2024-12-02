package ua.ucu.edu.apps.task3;

import org.json.JSONObject;

import java.io.IOException;

public class CompanyInfoFacade {
    private final PDLReader pdlReader;
    private final WebScraper webScraper;
    private final Brandfetch brandfetch;

    public CompanyInfoFacade() {
        this.pdlReader = new PDLReader();
        this.webScraper = new WebScraper();
        this.brandfetch = new Brandfetch();
    }

    public JSONObject getCompanyInfo(String website) {
        JSONObject companyInfo = new JSONObject();

        try {
            companyInfo.put("PDL", pdlReader.getCompanyInfo(website));
        } catch (IOException e) {
            companyInfo.put("PDL", "Error fetching data from PDL");
        }

        companyInfo.put("WebScraper", webScraper.scrapeCompanyInfo(website));

        try {
            companyInfo.put("Brandfetch", brandfetch.getCompanyInfo(website));
        } catch (IOException e) {
            companyInfo.put("Brandfetch", "Error fetching data from Brandfetch");
        }

        return companyInfo;
    }
}