package com.company;

class Udalitclass {
    double x,y,z,k;
    public Udalitclass(double bir,double ikki,double uch,double tort){
       this.k=bir;
       this.x=ikki;
        this.y=uch;
        this.z=tort;
        System.out.println("konstruktor;"+x+" "+y+" "+z+" "+k);

    }
    public Udalitclass(){
    }

    public double sum(double a, double b) {
        return a+b;
    }

    public double tortburchakp(){
        return x+y+z+k;
    }









}
