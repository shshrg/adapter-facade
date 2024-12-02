package ua.ucu.edu.apps.task2;

public class ReportBuilder {
    private DataBase db;
    public ReportBuilder(DataBase db) {
        this.db = db;
    }

    public String getUserData() {
        return this.db.getUserData();
    }

    public String getStatistics() {
        return this.db.getStatistics();
    }

}
