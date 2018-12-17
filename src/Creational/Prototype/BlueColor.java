package Creational.Prototype;

public class BlueColor extends Color{

    public BlueColor() {
        this.colorName = "black";
    }

    @Override
    void addColor() {
        System.out.println("Blue added");
    }
}
