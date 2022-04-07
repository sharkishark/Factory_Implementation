public class Garage {
    public Garage(CarFactory carFactory){
        Car car = carFactory.createCar();
        car.drive();
    }
}
