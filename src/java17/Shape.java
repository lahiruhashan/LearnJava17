package java17;

public sealed class Shape permits Circle, Rectangle {
    public void isGood(){};
}
