package designpattern.prototype;

import CarManufacture.Model;

public class Truck extends Car {

    private Double load;



    public Truck(String name, Model m) {
        super(name,m);
    }

    public Double getLoad() {
        return load;
    }

    public void setLoad(Double load) {
        this.load = load;
    }

    public Truck(Double load) {
        this.load = load;
        this.name=this.getClass().getSimpleName();
    }

    @Override
    public void drive() {
        System.out.println("driving Truck car");

    }
    public Truck(){
        System.out.println(this.getClass().getSimpleName());
        this.name=this.getClass().getSimpleName();
    }

    @Override
    public Object clone() {
        System.out.println(this.getLoad());
        return (Truck )super.clone();
    }
}
