package Creational.AbstractFactory;

import Creational.AbstractFactory.Border.Border;
import Creational.AbstractFactory.Color.Color;
import Creational.AbstractFactory.Factory.AbstractFactory;
import Creational.AbstractFactory.Factory.FactoryProducer;
import Creational.AbstractFactory.Shape.Shape;

public class Main {
    public static void main(String[] args) {

        AbstractFactory abstractFactory = FactoryProducer.getFactory("Color");
        Color color = abstractFactory.getColor("Blue");
        color.sayColor();

        color = abstractFactory.getColor("Red");
        color.sayColor();

        abstractFactory = FactoryProducer.getFactory("Border");
        Border border = abstractFactory.getBorder("Dot");
        border.sayBorderType();

        border = abstractFactory.getBorder("Solid");
        border.sayBorderType();

        abstractFactory = FactoryProducer.getFactory("Shape");
        Shape shape = abstractFactory.getShape("Circle");
        shape.sayShape();

        shape = abstractFactory.getShape("Square");
        shape.sayShape();
    }
}
