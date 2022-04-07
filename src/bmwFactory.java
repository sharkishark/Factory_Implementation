public class bmwFactory implements CarFactory {
    @Override
    public Car createCar(){
        return new M5();
    }
}
