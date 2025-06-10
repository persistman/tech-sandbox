package com.huhh.code.optimized.code.design.pattern.created.builder;

public class Client {

    public static void main(String[] args) {
        CarDirector director = new CarDirector();
        Car suvCar = director.buildMvpCar(new SuvCarBuilder());
        System.out.println(suvCar);
        Car mpvCar = director.buildMvpCar(new MvpCarBuilder());
        System.out.println(mpvCar);
    }
}
