package designpatterns.creational.abstractfactory;

import designpatterns.creational.abstractfactory.phoneStore.IphoneStore;
import designpatterns.creational.abstractfactory.phoneStore.OnePlusStore;
import designpatterns.creational.abstractfactory.phoneStore.PhoneStore;
import designpatterns.creational.abstractfactory.phoneStore.SamsungStore;

public class PhoneStoreFactory {
    public PhoneStore getPhoneStore(String type) {
        return switch (type) {
            case "Iphone" -> new IphoneStore();
            case "OnePlus" -> new OnePlusStore();
            default -> new SamsungStore();
        };
    }
}
