import ua.ucu.edu.apps.task3.*;

import org.json.JSONObject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestTask3 {

    private CompanyInfoFacade facade;

    @BeforeEach
    void setUp() {
        facade = new CompanyInfoFacade();
    }

    @Test
    void testGetCompanyInfo() {
        String website = "ucu.edu.ua";
        JSONObject companyInfo = facade.getCompanyInfo(website);

        assertNotNull(companyInfo.getJSONObject("PDL"));
        assertNotNull(companyInfo.getJSONObject("WebScraper"));
        assertNotNull(companyInfo.getJSONObject("Brandfetch"));
    }
}
