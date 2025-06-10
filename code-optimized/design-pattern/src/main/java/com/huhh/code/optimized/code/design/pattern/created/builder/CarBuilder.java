package com.huhh.code.optimized.code.design.pattern.created.builder;

import com.huhh.code.optimized.code.design.pattern.created.builder.component.ControlComputer;
import com.huhh.code.optimized.code.design.pattern.created.builder.component.Engine;
import com.huhh.code.optimized.code.design.pattern.created.builder.component.Glass;
import com.huhh.code.optimized.code.design.pattern.created.builder.component.Seat;
import com.huhh.code.optimized.code.design.pattern.created.builder.component.Wheel;

public interface CarBuilder {

    Car buildCar();

    CarBuilder wheel(Wheel wheel, int size);

    CarBuilder seat(Seat seat, int size);

    CarBuilder engine(Engine engine);

    CarBuilder glass(Glass glass);

    CarBuilder controlCompiter(ControlComputer computer);




}
