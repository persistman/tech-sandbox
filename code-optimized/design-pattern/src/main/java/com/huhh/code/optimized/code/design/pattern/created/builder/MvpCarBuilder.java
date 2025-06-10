package com.huhh.code.optimized.code.design.pattern.created.builder;

import java.util.ArrayList;
import java.util.List;

import com.huhh.code.optimized.code.design.pattern.created.builder.component.ControlComputer;
import com.huhh.code.optimized.code.design.pattern.created.builder.component.Engine;
import com.huhh.code.optimized.code.design.pattern.created.builder.component.Glass;
import com.huhh.code.optimized.code.design.pattern.created.builder.component.Seat;
import com.huhh.code.optimized.code.design.pattern.created.builder.component.Wheel;

public class MvpCarBuilder implements CarBuilder {

   private final Car car;

    public MvpCarBuilder() {
        this.car = new Car();
    }

    @Override
    public Car buildCar() {
        this.car.setType("MPV");
        return this.car;
    }

    @Override
    public CarBuilder wheel(Wheel wheel, int size) {
       
        List<Wheel>  wheels = new ArrayList<>(size);
        wheels.add(wheel);
        this.car.setWheels(wheels);
        return this;
    }

    @Override
    public CarBuilder seat(Seat seat, int size) {
        // TODO Auto-generated method stub
        List<Seat> seats = new ArrayList<>(size);
        seats.add(seat);
        return this;
    }

    @Override
    public CarBuilder engine(Engine engine) {
        // TODO Auto-generated method stub
        this.car.setEngine(engine);
        return this;
    }

    @Override
    public CarBuilder glass(Glass glass) {
        // TODO Auto-generated method stub
        this.car.setGlass(glass);
       return this;
    }

    @Override
    public CarBuilder controlCompiter(ControlComputer computer) {
        // TODO Auto-generated method stub
        this.car.setComputer(computer);
        return this;
    }



}
