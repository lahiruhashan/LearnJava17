package java17;

public sealed class Bike implements Vehicle permits Honda {
    @Override
    public void drive() {

    }
}
