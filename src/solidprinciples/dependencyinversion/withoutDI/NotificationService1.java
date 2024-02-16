package solidprinciples.dependencyinversion.withoutDI;

import solidprinciples.dependencyinversion.EmailNotification;
import solidprinciples.dependencyinversion.SMSNotification;

/**
 * Here, NotificationService1 class directly depends on EmailNotification, SMSNotification,
 * this is a tightly coupled program. Instead, class should depend on abstractions.
 */
public class NotificationService1 {
    private EmailNotification emailNotification;
    private SMSNotification smsNotification;

    public NotificationService1() {
        this.emailNotification = new EmailNotification();
        this.smsNotification = new SMSNotification();
    }

    public void sendNotification(String message) {
        emailNotification.sendNotification();
        smsNotification.sendNotification();
    }
}
