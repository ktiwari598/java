package solidprinciples.dependencyinversion;

import solidprinciples.dependencyinversion.withDI.Notification;

public class EmailNotification implements Notification {

    @Override
    public void sendNotification() {
        System.out.println("Sending Mail to client");
    }
}
