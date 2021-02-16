package com.company;

public class MathFunctionClass {
    private double x = 2, y = 3, z = 4;
    public MathFunctionClass(double birinchi, double ikkinchi, double uchinchi){
        this.x = birinchi;
        this.y = ikkinchi;
        this.z = uchinchi;
        System.out.println("konstrutor : "+ x +" "+ y +" "+ z);
    }

    public MathFunctionClass(){
    }

    public double uchbirchakPrimetri(){
        return x+y+z;
    }

    public Long yuza(Long a, Long b){
        return a*b;
    }
    public double yuza(double a, double b){
        return a*b;
    }
}
