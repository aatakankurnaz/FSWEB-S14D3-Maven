package org.example.company;

public class Mitsubishi extends Car{
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String brake() {
        String message = "The Mitsubishi is braking";
        System.out.println(getClass().getSimpleName());
        return message;
    }

    @Override
    public String accelerate() {
        String message = "The Mitsubishi is accelerating";
        System.out.println(getClass().getSimpleName());
        return message;
    }

    @Override
    public String startEngine() {
        String message = "The Mitsubishi's engine is starting";
        System.out.println(getClass().getSimpleName());
        return message;
    }
}
