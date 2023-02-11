import java.awt.*;
import java.util.ArrayList;
public class ShapeUtility{
    public static Octagon getLargestOctagon(ArrayList<Shape> shapeList){
        if (shapeList == null) {
            return null;
        }
        Octagon largestOctagon = null;
        for (Shape shape : shapeList) {
            if (largestOctagon == null && shape instanceof Octagon) {
                largestOctagon = (Octagon) shape;
            }
            else {
                if (shape instanceof Octagon && shape.getArea() > largestOctagon.getArea()) {
                    largestOctagon = (Octagon) shape;
                }
            }
        }
        return largestOctagon;
    }

    public static ArrayList<Shape> getAllNonRectangles(ArrayList<Shape> shapeList) {
        if (shapeList == null) {
            return new ArrayList<Shape>();
        }
        ArrayList<Shape> result = new ArrayList<Shape>();
        for (Shape shape : shapeList) {
            if (!(shape instanceof Rectangle)) {
                result.add(shape);
            }
        }
        return result;
    }

    public static ArrayList<Square> getAllSquareWithMinArea(ArrayList<Shape> shapeList, int minArea){
        if ( shapeList == null) {
            return new ArrayList<Square>();
        }
        ArrayList<Square> result = new ArrayList<Square>();

        for (Shape shape : shapeList) {
            if (shape instanceof Square  && shape.getArea() > minArea) {
                result.add((Square) shape);
            }
        }
        return result;
    }

    public static ArrayList<Rectangle> getAllRectangleWithMinLength(ArrayList<Shape> shapeList, double minLength) {
        if (shapeList == null){
            return new ArrayList<Rectangle>();
        }
        ArrayList<Rectangle> result = new ArrayList<Rectangle>();

        for(Shape shape: shapeList) {
            if (shape instanceof Rectangle ) {
                Rectangle rect = (Rectangle) shape;
                if (rect.getLength() > minLength) {
                    result.add(rect);
                }
            }
        }
        return result;
    }
}
