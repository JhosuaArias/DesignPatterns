package Creational.AbstractFactory.Factory;

import Creational.AbstractFactory.Border.Border;
import Creational.AbstractFactory.Color.Color;
import Creational.AbstractFactory.Shape.Shape;

public interface AbstractFactory {
    Color getColor(String colorType);
    Border getBorder(String borderType);
    Shape getShape(String shapeType);
}
