package Creational.AbstractFactory.Factory;

import Creational.AbstractFactory.Border.Border;
import Creational.AbstractFactory.Color.Color;
import Creational.AbstractFactory.Shape.Circle;
import Creational.AbstractFactory.Shape.Shape;
import Creational.AbstractFactory.Shape.Square;

public class ShapeFactory implements AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {
        Shape shape = null;

        switch (shapeType){
            case "Circle":
                shape = new Circle();
                break;
            case "Square":
                shape = new Square();
                break;
        }

        return shape;
    }

    @Override
    public Color getColor(String colorType) {
        return null;
    }

    @Override
    public Border getBorder(String borderType) {
        return null;
    }
}
