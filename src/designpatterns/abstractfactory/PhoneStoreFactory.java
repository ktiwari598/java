package designpatterns.abstractfactory;

import designpatterns.abstractfactory.phoneStore.IphoneStore;
import designpatterns.abstractfactory.phoneStore.OnePlusStore;
import designpatterns.abstractfactory.phoneStore.PhoneStore;
import designpatterns.abstractfactory.phoneStore.SamsungStore;

public class PhoneStoreFactory {
    public PhoneStore getPhoneStore(String type) {
        return switch (type) {
            case "Iphone" -> new IphoneStore();
            case "OnePlus" -> new OnePlusStore();
            default -> new SamsungStore();
        };
    }
}
