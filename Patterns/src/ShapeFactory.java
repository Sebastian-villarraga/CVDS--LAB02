package src;

import src;
import src;
import src;
import src;

public class ShapeFactory {
    static Shape choosenShape = null;
    public static Shape create(RegularShapeType type){
        switch(type){
            case Triangle:
                return new Triangle();
            case Hexagon:
                return new Hexagon();
            case Pentagon:
                return new Pentagon();
            case Quadrilateral:
                return new Quadrilateral();
        }
        return choosenShape;
    }
}
