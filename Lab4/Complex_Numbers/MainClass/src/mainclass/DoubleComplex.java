package mainclass;

public class DoubleComplex implements ComplexNumbers<Double>{
    public Double real, img;
    
    public DoubleComplex(Double r, Double i)
    {
        real = 0d;
        img = 0d;
    }

    public void setDoubleComplex(Double real, Double img) {
        this.real = real;
        this.img = img;
    }
    
    @Override
    public Double getReal()
    {
        return real;
    }
    
    @Override
    public Double getImg()
    {
        return img;
    }
    
    @Override
    public ComplexNumbers<Double> add(ComplexNumbers<Double> c)
    {
        Double r = this.real + c.getReal();
        Double i = this.real + c.getImg();
        ComplexNumbers<Double> newComplex = new DoubleComplex(r, i);
        return newComplex;
    }
    
    @Override
    public ComplexNumbers<Double> sub(ComplexNumbers<Double> c)
    {
        Double r = this.real - c.getReal();
        Double i = this.real - c.getImg();
        ComplexNumbers<Double> newComplex = new DoubleComplex(r, i);
        return newComplex;
    }
    
    @Override
    public ComplexNumbers<Double> product(ComplexNumbers<Double> c)
    {
        Double r = this.real * c.getReal();
        Double i = this.real * c.getImg();
        ComplexNumbers<Double> newComplex = new DoubleComplex(r, i);
        return newComplex;
    }
    
    @Override
    public ComplexNumbers<Double> div(ComplexNumbers<Double> c)
    {
        Double r = this.real / c.getReal();
        Double i = this.real / c.getImg();
        ComplexNumbers<Double> newComplex = new DoubleComplex(r, i);
        return newComplex;
    }
    
    @Override
    public void displayComplex()
    {
        if(this.getImg() > 0)
        {
            System.out.println("X = " + this.getReal() + "+ i" + this.getImg());
        }
        if(this.getImg() < 0)
        {
            System.out.println("X = " + this.getReal() + "- i" + Math.abs(this.getImg()));
        }
    }
}
