package designpatterns.behavioral.observerPattern.StockPriceMonitoring;

public interface Subject {
    void add(Observer o);

    void remove(Observer o);

    void notifyObserver();
}
