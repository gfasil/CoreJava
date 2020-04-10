package CarManufacture;

import org.apache.commons.math3.stat.descriptive.summary.Product;

interface CarBuilderInterface {

    void buildBody();
    void insertWheels() ;
    void addHeadLights();
    Product getVehicle();
}

