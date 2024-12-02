package ua.ucu.edu.apps.task2;

public class Authorize extends Авторизація {
    private Авторизація auth;
    public Authorize() {
        this.auth = new Авторизація();
    }
    public boolean authorize(БазаДаних db) {
        return auth.авторизуватися(db);
    }
}
