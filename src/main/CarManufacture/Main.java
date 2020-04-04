package main.CarManufacture;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    private static Car  buildCarUtil(String name){
        String temp[]=name.split(" ");
        StringBuilder n= new StringBuilder("");
        for(int i=1;i<temp.length;i++){
            n.append(temp[i]).append(" ");
        }
        Car car=new Car(temp[0],n.toString());
        return car;
    }
    public static Car  buildcar(String name){
        Car userCar = null;
        switch(name.toLowerCase()){
            case "a":
                userCar=  Main.buildCarUtil("Ford F15");
                break;
            case "b":
                userCar=  Main.buildCarUtil("Bugatti veronni");
                break;
            case "c":
                userCar=  Main.buildCarUtil("Ferari malta 124");
                break;
            default:
                 userCar=new Car();
        }
        return userCar;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        Car f15=new Car("F150",20, Car.Color.RED,new Model(),50000);
        Car f16=new Car("F150",20, Car.Color.RED,new Model("F150 model 2019", LocalDate.now(),true, Model.Engine.V8),70000);
        System.out.println("which car do u want to buy? \n" + "type A for F15 \n type B for bugatti \n type C for Ferarri1 \n type e to exit" );
        String carName= input.nextLine();
        if(carName.equalsIgnoreCase("e")) input.close();
        Car userCar = Main.buildcar(carName);

        System.out.println(userCar);

    }
}
