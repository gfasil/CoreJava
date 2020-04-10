package CarManufacture;


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
    public Car(String carName,String name){
        this.name = carName;
        this.avgMilesPerGallon =50;
        this.paintColor = Color.BLUE;
        this.model = new Model(name);
        this.price = 60000;
    }
    public void changeColor(Color color){
        this.paintColor=color;

    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", avgMilesPerGallon=" + avgMilesPerGallon +
                ", paintColor=" + paintColor +
                ", model=" + model +
                ", price=" + price +
                '}';
    }
    public  Car(){}
}
