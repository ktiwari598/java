package designpatterns.observerPattern.observer;

import designpatterns.observerPattern.observable.StocksObservable;

public class MobileNotificationAlert implements NotificationAlertObserver {

    private final String mobileNumber;
    private final StocksObservable stocksObservable;

    public MobileNotificationAlert(String mobileNumber, StocksObservable stocksObservable) {
        this.mobileNumber = mobileNumber;
        this.stocksObservable = stocksObservable;
    }
    @Override
    public void update() {
        System.out.println("MobileNotification : Sending notification to mobileNumber " + mobileNumber);
    }
}
