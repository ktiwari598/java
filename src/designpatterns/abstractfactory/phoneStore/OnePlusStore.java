package designpatterns.abstractfactory.phoneStore;

import designpatterns.abstractfactory.phone.Iphone12;
import designpatterns.abstractfactory.phone.Iphone13;
import designpatterns.abstractfactory.phone.Phone;

import java.util.Objects;

public class OnePlusStore extends PhoneStore {
    @Override
    public Phone createPhone(String model) {
        //Another factory is to get corresponding phone model
        if(Objects.equals(model, "12PLUS")) {
            return new Iphone12("OnePlus", "12PLUS", "Wooden", "9inch");
        }
        else {
            return new Iphone13("OnePlus", "13PLUS", "Thermocol", "10inch");
        }
    }
}
