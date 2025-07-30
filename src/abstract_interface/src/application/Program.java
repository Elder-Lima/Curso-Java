package abstract_interface.src.application;

import abstract_interface.src.model.entities.AbstractShape;
import abstract_interface.src.model.entities.Circle;
import abstract_interface.src.model.entities.Rectangle;
import abstract_interface.src.model.entities.Shape;
import abstract_interface.src.model.enums.Color;

public class Program {
    public static void main(String[] args) {

        AbstractShape s1 = new Circle(Color.BLACK, 2.0);
        AbstractShape s2 = new Rectangle(Color.WHITE, 3.0, 4.0);

        System.out.println("Circle color: " + s1.getColor());
        System.out.println("Circle area: " + String.format("%.2f", s1.area()));
        System.out.println("Rectangle color: " + s2.getColor());
        System.out.println("Rectangle: " + String.format("%.2f", s2.area()));

    }
}
