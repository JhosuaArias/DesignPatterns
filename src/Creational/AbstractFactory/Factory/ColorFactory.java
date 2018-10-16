package Creational.AbstractFactory.Factory;

import Creational.AbstractFactory.Border.Border;
import Creational.AbstractFactory.Color.Blue;
import Creational.AbstractFactory.Color.Color;
import Creational.AbstractFactory.Color.Red;
import Creational.AbstractFactory.Shape.Shape;

public class ColorFactory implements AbstractFactory {


    @Override
    public Color getColor(String colorType) {
        Color color = null;

        switch (colorType){
            case "Blue":
                color = new Blue();
                break;
            case "Red":
                color = new Red();
                break;
        }
        return color;
    }

    @Override
    public Border getBorder(String borderType) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        return null;
    }
}
