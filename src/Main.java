import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Car{
    private String carId;

    private String brand;

    private String model;

    private double basePricePerDay;

    private boolean isAvailable;

    public Car(String carId , String brand ,String model, double basePricePerDay){
        this.carId=carId;
        this.brand=brand;
        this.model=model;
        this.basePricePerDay=basePricePerDay;
        this.isAvailable = true; // because new car is added to the list

    }

    public String getCarId() {
        return carId;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
    public double calculatePrice(int rentalDays){
        return basePricePerDay*rentalDays;
    }

}