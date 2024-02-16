package solidprinciples.dependencyinversion.withDI;

public class NotificationService2 {
    private Notification notification;

    public NotificationService2(Notification notification) {
        this.notification = notification;
    }

    public void sendNotification() {
        notification.sendNotification();
    }

}