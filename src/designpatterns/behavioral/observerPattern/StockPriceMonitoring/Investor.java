package designpatterns.behavioral.observerPattern.StockPriceMonitoring;

import java.sql.SQLOutput;

public class Investor implements Observer {

    private String name;

    public Investor(String name) {
        this.name = name;
    }

    @Override
    public void update(double price) {
        System.out.println("Investor " + this.name + " notified about stock price : $" + price);
    }
}
