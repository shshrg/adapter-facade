import ua.ucu.edu.apps.task2.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TestTask2 {

    private DataBase db;
    private ReportBuilder reportBuilder;

    @BeforeEach
    void setUp() {
        db = new DataBase();
        reportBuilder = new ReportBuilder(db);
    }

    @Test
    void testGetUserData() {
        assertEquals("hello", reportBuilder.getUserData());
    }

    @Test
    void testGetStatistics() {
        assertEquals("hello2", reportBuilder.getStatistics());
    }
}