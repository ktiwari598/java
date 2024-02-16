package solidprinciples.dependencyinversion;

import solidprinciples.dependencyinversion.withDI.Notification;

public class SMSNotification implements Notification {

    @Override
    public void sendNotification() {
        System.out.println("Sending SMS to client");
    }
}
