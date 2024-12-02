package ua.ucu.edu.apps.task2;

public class DataBase extends БазаДаних{
    private БазаДаних db;
    public DataBase() {
        this.db = new БазаДаних();
    }
    public String getUserData() {
        return this.db.отриматиДаніКористувача();
    }

    public String getStatistics() {
        return this.db.отриматиСтатистичніДані();
    }
}
