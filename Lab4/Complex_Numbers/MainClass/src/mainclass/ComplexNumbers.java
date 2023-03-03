package mainclass;

public interface ComplexNumbers<T> {
    T getReal();
    T getImg();
    
    public void displayComplex();
    ComplexNumbers<T> add(ComplexNumbers<T> z);
    ComplexNumbers<T> sub(ComplexNumbers<T> z);
    ComplexNumbers<T> product(ComplexNumbers<T> z);
    ComplexNumbers<T> div(ComplexNumbers<T> z);
}
