package designpatterns.behavioral.observerPattern.StockPriceMonitoring;

import java.util.ArrayList;
import java.util.List;

public class Stock implements Subject {

    private double price;
    private List<Observer> observers = new ArrayList<>();

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
        notifyObserver();
    }

    @Override
    public void add(Observer o) {
        observers.add(o);
    }

    @Override
    public void remove(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer: observers) {
            observer.update(price);
        }
    }
}
