package org.example.company;

import org.example.arge.CarSkeleton;
import org.example.arge.ElectricCar;
import org.example.arge.GasPoweredCar;
import org.example.arge.HybridCar;

public class Main {
    public static void main(String[] args) {
        CarSkeleton electric = new ElectricCar("electricName", "electricDes",500, 50000);
        CarSkeleton gas = new GasPoweredCar("gasName","gasDes",400, 4 );
        CarSkeleton hybrid = new HybridCar("hybridName", "hybridDes", 900, 60000, 4);

    }
}
