package designpatterns.creational.abstractfactory;

import designpatterns.creational.abstractfactory.phoneStore.PhoneStore;

/**
 * Abstract Factory Design Pattern is factory of factory pattern
 * This is c Creational Design Pattern
 */
public class Customer {
    public static void main(String[] args) {

        PhoneStoreFactory phoneStoreFactory = new PhoneStoreFactory();

        //One factory is there to get the phone store
        PhoneStore iphoneStore = phoneStoreFactory.getPhoneStore("Iphone");
        iphoneStore.orderPhone("12PRO");

        PhoneStore onePlusStore = phoneStoreFactory.getPhoneStore("OnePlus");
        onePlusStore.orderPhone("13PlUS");
    }
}
