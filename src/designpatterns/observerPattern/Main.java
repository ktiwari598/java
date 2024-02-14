package designpatterns.observerPattern;

import designpatterns.observerPattern.observable.IphoneStock;
import designpatterns.observerPattern.observable.SamsungStock;
import designpatterns.observerPattern.observer.EmailNotificationAlert;
import designpatterns.observerPattern.observer.MobileNotificationAlert;

/**
 * We have 2 interfaces observable and observer
 */
public class Main {
    public static void main(String[] args) {
        IphoneStock iphoneStock = new IphoneStock();

        EmailNotificationAlert emailNotificationAlert1 = new EmailNotificationAlert("xyz@gmail.com", iphoneStock);
        EmailNotificationAlert emailNotificationAlert2 = new EmailNotificationAlert("12435@gmail.com", iphoneStock);
        MobileNotificationAlert mobileNotificationAlert = new MobileNotificationAlert("78763653738", iphoneStock);
        iphoneStock.add(emailNotificationAlert1);
        iphoneStock.add(emailNotificationAlert2);
        iphoneStock.add(mobileNotificationAlert);

        SamsungStock samsungStock = new SamsungStock();
        EmailNotificationAlert emailNotificationAlert3 = new EmailNotificationAlert("3456@gmail.com", samsungStock);
        samsungStock.add(emailNotificationAlert3);

        samsungStock.setStock(1);
        iphoneStock.setStock(10);
    }
}
