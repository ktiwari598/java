package designpatterns.observerPattern.observer;

import designpatterns.observerPattern.observable.StocksObservable;

public class EmailNotificationAlert implements NotificationAlertObserver {

    private final String email;
    private final StocksObservable stocksObservable;

    public EmailNotificationAlert(String email, StocksObservable stocksObservable) {
        this.email = email;
        this.stocksObservable = stocksObservable;
    }

    @Override
    public void update() {
        System.out.println("EmailNotification : Sending mail to " + email);
    }
}
