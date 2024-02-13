package solidprinciples.dependencyinversion;

//public interface Notification {
//    void send(String message);
//}
//
//public class EmailNotification implements Notification {
//    @Override
//    public void send(String message) {
//        // Implementation for sending email notification
//    }
//}
//
//public class SMSNotification implements Notification {
//    @Override
//    public void send(String message) {
//        // Implementation for sending SMS notification
//    }
//}
//
///**
// * Here, Notification Services depends on Notification Interface, this is loosely coupled and allows flexibility.
// */
//public class NotificationService {
//    private Notification emailNotification;
//    private Notification smsNotification;
//
//    public NotificationService(Notification emailNotification, Notification smsNotification) {
//        this.emailNotification = emailNotification;
//        this.smsNotification = smsNotification;
//    }
//
//    public void sendNotification(String message) {
//        emailNotification.send(message);
//        smsNotification.send(message);
//    }
//}
