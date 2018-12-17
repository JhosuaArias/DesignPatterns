package Creational.Prototype;


public class BlackColor extends Color {

    public BlackColor() {
        this.colorName = "black";
    }

    @Override
    void addColor() {
        System.out.println("Black added");
    }
}
