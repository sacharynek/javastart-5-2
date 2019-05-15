package model;

public class Device {

    private String make, code, deviceType;
    private double price;

    public Device(String code, String make, String deviceType) {
        this.code = code;
        this.make = make;
        this.deviceType = deviceType;
    }

    public Device(String code, String make, String deviceType, double price) {
        this(code, make, deviceType);
        this.price = price;
    }

    public String getInfo() {
        return toString();
    }

    @Override
    public String toString() {
        //string.format
        return "Kod:" + this.code +
                ", Producent: " + this.make +
                ", typ: " + this.deviceType +
                ", cena: " + this.price;
    }
}
