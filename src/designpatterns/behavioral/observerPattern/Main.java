package designpatterns.behavioral.observerPattern;

import designpatterns.behavioral.observerPattern.observable.IphoneStock;
import designpatterns.behavioral.observerPattern.observable.SamsungStock;
import designpatterns.behavioral.observerPattern.observer.EmailNotificationAlert;
import designpatterns.behavioral.observerPattern.observer.MobileNotificationAlert;

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
