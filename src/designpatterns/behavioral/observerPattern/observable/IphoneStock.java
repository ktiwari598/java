package designpatterns.behavioral.observerPattern.observable;

import designpatterns.behavioral.observerPattern.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneStock implements StocksObservable {

    List<NotificationAlertObserver> observerList = new ArrayList<>();
    int stockCount = 0;

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
    public void setStock(int currentStockCount) {
        if(stockCount == 0) {
            notifyListeners();
        }
        stockCount = currentStockCount;
    }


    @Override
    public int getStock() {
        return stockCount;
    }
}
