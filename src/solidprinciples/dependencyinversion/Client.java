package solidprinciples.dependencyinversion;

import solidprinciples.dependencyinversion.withDI.Notification;
import solidprinciples.dependencyinversion.withDI.NotificationService2;

/**
 * High level modules(class) should not depend on low level modules, instead both should depend on abstractions.
 */

public class Client {
    public static void main(String[] args) {
        Notification notification1 = new EmailNotification();
        Notification notification2 = new SMSNotification();

        NotificationService2 notificationService2 = new NotificationService2(notification2);
        notificationService2.sendNotification();
    }
}
