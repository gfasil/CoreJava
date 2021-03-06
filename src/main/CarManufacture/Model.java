package main.CarManufacture;

import java.time.LocalDate;

public class Model {

    private String name;
    private LocalDate manDate;
    private boolean isFwd;
    enum  Engine {V8,V6,V7,V2,V4}
    private Engine engine;

    public Model(String name, LocalDate manDate, boolean isFwd, Engine engine) {
        this.name = name;
        this.manDate = manDate;
        this.isFwd = isFwd;
        this.engine = engine;
    }
    public Model(){}
    public Model(String name){
        this.name=name;
        this.manDate=LocalDate.of(2018,11,28);
        this.isFwd=true;
        this.engine=Engine.V8;

    }

    @Override
    public String toString() {
        return "Model{" +
                "name='" + name + '\'' +
                ", manDate=" + manDate +
                ", isFwd=" + isFwd +
                ", engine=" + engine +
                '}';
    }
}
