public class VolskwagenFactory implements CarFactory{
    @Override
    public Car createCar(){
        return new B5();
    }
}
