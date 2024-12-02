package ua.ucu.edu.apps.task1;

import java.time.LocalDateTime;
import java.util.List;

public class MessageSender {
    public void send(String text, List<User> users, String message) {
        for (User user : users) {
            if (user.getCountry().equals("Ukraine")) {
                if (user.getLastActiveTime().isAfter(LocalDateTime.now().minusHours(1))) {
                    System.out.println("Sending message to " + user.getUserMail());
                    System.out.println("Message: " + message);
                    System.out.println("Message sent successfully");
                }
            }
        }
    }
}
