package org.example.company;

public class Holden extends Car{
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String brake() {
        String message = "The Holden is braking";
        System.out.println(getClass().getSimpleName());
        return message;
    }

    @Override
    public String accelerate() {
        String message = "The Holden is accelerating";
        System.out.println(getClass().getSimpleName());
        return message;
    }

    @Override
    public String startEngine() {
        String message = "The Holden's engine is starting";
        System.out.println(getClass().getSimpleName());
        return message;
    }
}
