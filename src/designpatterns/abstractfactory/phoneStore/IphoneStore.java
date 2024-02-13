package designpatterns.abstractfactory.phoneStore;

import designpatterns.abstractfactory.phone.Iphone12;
import designpatterns.abstractfactory.phone.Iphone13;
import designpatterns.abstractfactory.phone.Phone;

import java.util.Objects;

public class IphoneStore extends PhoneStore {
    @Override
    public Phone createPhone(String model) {
        if(Objects.equals(model, "12PRO")) {
            return new Iphone12("Iphone", "12PRO", "Metallic", "5inch");
        }
        else {
            return new Iphone13("Iphone", "13PRO", "Plastic", "6inch");
        }
    }
}
