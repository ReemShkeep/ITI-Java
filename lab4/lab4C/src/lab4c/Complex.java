/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package lab4c;

/**
 *
 * @author mahmo
 * @param <T>
 */
public interface Complex<T> {
    T getReal();
    T getImg();
    
    Complex<T> add(Complex<T> z);
    Complex<T> sub(Complex<T> z);
    Complex<T> mul(Complex<T> z);
    Complex<T> div(Complex<T> z);
}
