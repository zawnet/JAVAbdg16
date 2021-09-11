public class Vehicle {
    protected String brand = "Skoda";
    public void honk(){
        System.out.println("Jaki to samochód");
    }
}

class Car extends Vehicle  {
    private String modelName = "Superb";

    public static void main(String[] args) {
        Car myFastCar = new Car();
        myFastCar.honk();
        System.out.println(myFastCar.brand + " " + myFastCar.modelName) ;
    }
}

