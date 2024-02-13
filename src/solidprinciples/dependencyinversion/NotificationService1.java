package solidprinciples.dependencyinversion;

/**
 * Here, NotificationService class directly depends on EmailNotificationService, SMSNotificationService,
 * this is a tightly coupled program. Instead, class should depend on abstractions.
 */
//public class NotificationService1 {
//    private EmailNotification emailNotification;
//    private SMSNotification smsNotification;
//
//    public NotificationService() {
//        this.emailNotification = new EmailNotification();
//        this.smsNotification = new SMSNotification();
//    }
//
//    public void sendNotification(String message) {
//        emailNotification.send(message);
//        smsNotification.send(message);
//    }
//}
