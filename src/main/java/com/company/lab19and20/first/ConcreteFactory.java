package com.company.lab19and20.first;

public class ConcreteFactory implements ComplexAbstractFactory{

    @Override
    public Complex createComplex() {
        return new Complex();
    }

    @Override
    public Complex createComplex(int real, int imagine) {
        return new Complex(real, imagine);
    }
}
