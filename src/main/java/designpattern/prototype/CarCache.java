package designpattern.prototype;

import java.util.Hashtable;

public class CarCache {

    private static Hashtable<String,Car> carMap=new Hashtable<String, Car>();

    public static Car getCar(String name){
        Car temp=carMap.get(name);

        return (Car) temp.clone();

    }

    public static void loadCache(){
        RaceCar r=new RaceCar();
        Truck t=new Truck(12000.00);
        System.out.printf("first car %-5s \n",r.hashCode());
        System.out.printf("first truck %5s \n",t.hashCode());
        carMap.put(r.getName(),r);
        t.getName();
        carMap.put(t.getName(),t);

    }

}
