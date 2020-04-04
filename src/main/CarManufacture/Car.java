package main.CarManufacture;


public class Car {

    private String name;
    private int avgMilesPerGallon;
    enum Color {RED,WHITE,BLUE}
    private Color paintColor;
    private Model model;
    private double price;

    public Car(String name, int avgMilesPerGallon, Color paintColor, Model model, double price) {
        this.name = name;
        this.avgMilesPerGallon = avgMilesPerGallon;
        this.paintColor = paintColor;
        this.model = model;
        this.price = price;
    }
    public Car(){}
}
