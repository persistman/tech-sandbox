package com.huhh.code.optimized.code.design.pattern.created.builder;

import com.huhh.code.optimized.code.design.pattern.created.builder.component.ControlComputer;
import com.huhh.code.optimized.code.design.pattern.created.builder.component.Engine;
import com.huhh.code.optimized.code.design.pattern.created.builder.component.Glass;
import com.huhh.code.optimized.code.design.pattern.created.builder.component.Seat;
import com.huhh.code.optimized.code.design.pattern.created.builder.component.Wheel;

public class CarDirector {

    public Car buildSuvCar(CarBuilder builder) {
        return builder.controlCompiter(new ControlComputer())
                .engine(new Engine())
                .glass(new Glass())
                .wheel(new Wheel(), 4)
                .seat(new Seat(), 4)
                .buildCar();
    }


    public Car buildMvpCar(CarBuilder builder) {
        return builder.controlCompiter(new ControlComputer())
                .engine(new Engine())
                .glass(new Glass())
                .wheel(new Wheel(), 4)
                .seat(new Seat(), 4)
                .buildCar();
    }

}
