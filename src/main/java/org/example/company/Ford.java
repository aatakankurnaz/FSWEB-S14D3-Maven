package org.example.company;

public class Ford extends Car{
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String brake() {
        String message = "The Ford is braking";
        System.out.println(getClass().getSimpleName());
        return message;
    }

    @Override
    public String accelerate() {
        String message = "The Ford is accelerating";
        System.out.println(getClass().getSimpleName());
        return message;
    }

    @Override
    public String startEngine() {
        String message = "The Ford's engine is starting";
        System.out.println(getClass().getSimpleName());
        return message;
    }
}
