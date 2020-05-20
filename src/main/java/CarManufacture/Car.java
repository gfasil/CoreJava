package CarManufacture;


public class Car {

    private String name;
    private int avgMilesPerGallon;
    enum Color {RED,WHITE,BLUE}
    private Color paintColor;
    private Model model;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAvgMilesPerGallon() {
        return avgMilesPerGallon;
    }

    public void setAvgMilesPerGallon(int avgMilesPerGallon) {
        this.avgMilesPerGallon = avgMilesPerGallon;
    }

    public Color getPaintColor() {
        return paintColor;
    }

    public void setPaintColor(Color paintColor) {
        this.paintColor = paintColor;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

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



