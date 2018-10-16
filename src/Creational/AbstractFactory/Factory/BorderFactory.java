package Creational.AbstractFactory.Factory;

import Creational.AbstractFactory.Border.Border;
import Creational.AbstractFactory.Border.DotBorder;
import Creational.AbstractFactory.Border.SolidBorder;
import Creational.AbstractFactory.Color.Color;
import Creational.AbstractFactory.Shape.Shape;

public class BorderFactory implements AbstractFactory{

    @Override
    public Border getBorder(String borderType) {
        Border border = null;

        switch (borderType){
            case "Dot":
                border = new DotBorder();
                break;
            case "Solid":
                border = new SolidBorder();
                break;
        }

        return border;
    }

    @Override
    public Shape getShape(String shapeType) {
        return null;
    }

    @Override
    public Color getColor(String colorType) {
        return null;
    }

}
