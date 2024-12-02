package ua.ucu.edu.apps.task2;

public class Main {
    public static void main(String[] args) {
        DataBase db = new DataBase();
        Authorize auth = new Authorize();
        
        
        ReportBuilder reportBuilder = new ReportBuilder(db);
        auth.authorize(db);
        System.out.println(reportBuilder.getUserData());
        System.out.println(reportBuilder.getStatistics());
    }
}
