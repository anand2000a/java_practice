package com.test.rohit;
import com.test.rohit.Car;
public class Tester {
    public static void main(String[] args) {
        Car rohitCar=new Car("TATA","Safari");
        Car rahulCar=null;
        rahulCar=new Car("Lamborgini","aventador");
//        int x= Integer.parseInt(null);
        rohitCar.setCarName("nexon");
        System.out.println(rohitCar.getCarName());

        System.out.println(rohitCar.getEngineCC());
    }
}
