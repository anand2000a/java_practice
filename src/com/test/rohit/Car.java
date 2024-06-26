package com.test.rohit;

public class Car {
    private String brandName;
    private String carName;
    private int engineCC;

    public Car(String brandName, String carName) {
        this.brandName = brandName;
        this.carName = carName;
    }

    public Car(String brandName, String carName, int engineCC) {
        this.brandName = brandName;
        this.carName = carName;
        this.engineCC = engineCC;
    }

    public String getBrandName() {
        return brandName;
    }
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getEngineCC() {
        return engineCC;
    }

    public void setEngineCC(int engineCC) {
        this.engineCC = engineCC;
    }
}
