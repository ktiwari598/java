package designpatterns.creational.abstractfactory.phoneStore;

import designpatterns.creational.abstractfactory.phone.Phone;

public abstract class PhoneStore {
    private Phone phone;

    public void orderPhone(String model) {
        phone = createPhone(model);
        phone.buildPhone();
        phone.assemblePhone();
        phone.packingBox();
    }

    public abstract Phone createPhone(String model);

}
