package designpatterns.abstractfactory.phoneStore;

import designpatterns.abstractfactory.phone.Phone;
import designpatterns.abstractfactory.phoneStore.PhoneStore;

public class SamsungStore extends PhoneStore {
    @Override
    public Phone createPhone(String model) {
        return null;
    }
}
