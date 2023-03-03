package mainclass;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    
    public static void drawAnyShape(List<? extends Shape> anyShapesList)
    {
        for(Shape shapeIns : anyShapesList)
        {
            shapeIns.draw();
        }
    }
    public static void main(String[] args) {
        List<Rectangle> rectList = new ArrayList<Rectangle>();
        List<Circle> cirList = new ArrayList<>();
        for(int i = 0; i<5; i++)
        {
            rectList.add(i, new Rectangle());
            cirList.add(i, new Circle());
        }
        
        drawAnyShape(rectList);
        drawAnyShape(cirList);
    }
    
}
