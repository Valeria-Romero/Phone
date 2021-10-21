package com.phones.brands;
import com.phones.references.*;

public class Iphone extends Phone implements Ringable {
    public Iphone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
    	return "Iphone "+super.getVersion() + " says " + super.getRingTone();
    }
    @Override
    public String unlock() {
        return "Iphone" + super.getVersion() + " unlocking phone";
    }
    @Override
    public void displayInfo() {
    	System.out.println("Iphone "+ super.getVersion() + " from " + super.getCarrier() + " Battery level at: " + super.getBattery() + "%");
    }
}

