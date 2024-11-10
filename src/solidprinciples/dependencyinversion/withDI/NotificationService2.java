package solidprinciples.dependencyinversion.withDI;

/**
 * Here the high level module(NotificationService2) depends on abstractions(Notification interface) instead of
 * concrete classes.
 */
public class NotificationService2 {
    private Notification notification;

    public NotificationService2(Notification notification) {
        this.notification = notification;
    }

    public void sendNotification() {
        notification.sendNotification();
    }

}