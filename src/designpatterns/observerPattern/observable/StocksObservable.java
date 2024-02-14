package designpatterns.observerPattern.observable;

import designpatterns.observerPattern.observer.NotificationAlertObserver;

public interface StocksObservable {
    void add(NotificationAlertObserver observer);
    void remove(NotificationAlertObserver observer);
    void notifyListeners();

    void setStock(int stockCount);

    int getStock();

}
