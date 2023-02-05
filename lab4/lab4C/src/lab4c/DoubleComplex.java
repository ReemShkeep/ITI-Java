/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4c;

/**
 *
 * @author mahmo
 */
public class DoubleComplex implements Complex<Double> {
    private final double real;
    private final double img;

    public DoubleComplex() {
        this.real = 0;
        this.img = 0;
    }

    public DoubleComplex(double d, double d0) {
        this.real = d;
        this.img = d0;
    }
    
    @Override
    public Double getReal() {
        return this.real;
    }

    @Override
    public Double getImg() {
        return this.img;
    }

    @Override
    public Complex<Double> add(Complex<Double> z) {
        return new DoubleComplex(this.real + z.getReal() ,this.img + z.getImg());
    }

    @Override
    public Complex<Double> sub(Complex<Double> z) {
        return new DoubleComplex(this.real - z.getReal() ,this.img - z.getImg());
    }

    @Override
    public Complex<Double> mul(Complex<Double> z) {
        return new DoubleComplex(this.real * z.getReal() ,this.img * z.getImg());
    }

    @Override
    public Complex<Double> div(Complex<Double> z) {
        return new DoubleComplex(this.real / z.getReal() ,this.img / z.getImg());
    }
    
    @Override
    public String toString() {
        return "Complex [real=" + this.getReal() + ", imaginary=" + this.getImg() + "]";
    }    
}
