package designpatterns.creational.abstractfactory.phone;

public class Phone {
    private String brand;
    private String model;
    private String bodyType;
    private String size;

    public Phone(String brand, String model, String bodyType, String size) {
        this.brand = brand;
        this.model = model;
        this.bodyType = bodyType;
        this.size = size;
    }

    public void buildPhone() {
        System.out.println("Building Phone with brand " + brand);
        System.out.println("Building Phone with model " + model);
        System.out.println("Building Phone with bodyType " + bodyType);
        System.out.println("Building Phone with size " + size);
    }

    public void assemblePhone() {
        System.out.println("Assembling phone with brand :" + brand + " model : " + model + " bodyType: "
                + bodyType + " size: " + size);
    }

    public void packingBox() {
        System.out.println("Packing phone with brand :" + brand + " model : " + model + " bodyType: "
                + bodyType + " size: " + size);
    }

}
