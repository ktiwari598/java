package designpatterns.observerPattern.observable;

import designpatterns.observerPattern.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class SamsungStock implements StocksObservable {

    List<NotificationAlertObserver> observerList = new ArrayList<>();
    int samsungStockCount = 0;

    @Override
    public void add(NotificationAlertObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyListeners() {
        for(NotificationAlertObserver observer: observerList) {
            observer.update();
        }
    }

    @Override
    public void setStock(int newCount) {
        if(samsungStockCount == 0) {
            notifyListeners();
        }
        samsungStockCount = newCount;
    }

    @Override
    public int getStock() {
        return samsungStockCount;
    }
}
