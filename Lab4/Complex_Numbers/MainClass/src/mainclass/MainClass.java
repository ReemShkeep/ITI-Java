package mainclass;

public class MainClass {

    public static void main(String[] args) {
        DoubleComplex compNum1 = new DoubleComplex(5d, 3d);
        DoubleComplex compNum2 = new DoubleComplex(3d, 5d);
        //DoubleComplex compNum3 = new DoubleComplex(3.5d, 1.2d);
        
        ComplexNumbers<Double> compNum4 = compNum1.add(compNum2);
        compNum4.displayComplex();
    }
    
}
