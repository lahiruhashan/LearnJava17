package java17;

public non-sealed class Car implements Vehicle{
    @Override
    public void drive() {
        System.out.println("Driving a car");
    }
}
