package designpattern.prototype;

public class Demo {
    public static void main(String[] args) {
        CarCache.loadCache();

        Car race=CarCache.getCar("RaceCar");
        Car truck=(Truck)CarCache.getCar("Truck");

        System.out.println("type of clone car " + race.getName() +" hash code: " + race.hashCode());
        System.out.println("type of cone car" + truck.getName() + " hash code: "+truck.getPaintColor() );

    }

}
