package collection;

import CarManufacture.Car;
import CarManufacture.Model;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<Car, Model> cars=new HashMap<>();


        cars.put(new Car(),null);
        cars.put(new Car(),new Model("h1"));
        cars.put(null,new Model("h2"));
        Map<Car, Model> carsTable=new Hashtable<>();
//        carsTable.put(new Car(),null);
//        carsTable.put(null,new Model("h1"));
//        carsTable.put(null,new Model("h2"));
    //    Enumeration<Car> c3=carsTable.keySet().iterator();

        Map<Car,Model>  sortedCars=new TreeMap<>(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return Double.compare(o1.getPrice(),o2.getPrice());
            }
        });
        Iterator<Car> modelIterator=cars.keySet().iterator();
        while(modelIterator.hasNext()){
            Car c=modelIterator.next();
         //   modelIterator.remove();
    //        System.out.println("car name: " + c +"\n car model:" + cars.get(c));

        }
        System.out.println(  cars.entrySet());

    }
}
