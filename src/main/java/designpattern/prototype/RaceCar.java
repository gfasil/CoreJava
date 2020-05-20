package designpattern.prototype;

public class RaceCar extends Car {
    @Override
    public void drive() {
        System.out.println("driving race car");

    }
   public RaceCar(){
        this.name=this.getClass().getSimpleName();
    }

    @Override
    public Car clone() {
    return (RaceCar) super.clone();
     }
}
