package Creational.AbstractFactory.Factory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String factoryType){
        AbstractFactory abstractFactory = null;

        switch (factoryType){
            case "Color":
                abstractFactory = new ColorFactory();
                break;
            case "Shape":
                abstractFactory = new ShapeFactory();
                break;
            case "Border":
                abstractFactory = new BorderFactory();
                break;
        }

        return abstractFactory;
    }
}
