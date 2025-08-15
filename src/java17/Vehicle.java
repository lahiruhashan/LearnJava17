package java17;

public sealed interface Vehicle permits Car, Bike {
    public void drive();
}
