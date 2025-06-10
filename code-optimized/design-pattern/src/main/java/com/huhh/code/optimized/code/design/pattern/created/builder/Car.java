package com.huhh.code.optimized.code.design.pattern.created.builder;

import java.util.List;

import com.huhh.code.optimized.code.design.pattern.created.builder.component.ControlComputer;
import com.huhh.code.optimized.code.design.pattern.created.builder.component.Engine;
import com.huhh.code.optimized.code.design.pattern.created.builder.component.Glass;
import com.huhh.code.optimized.code.design.pattern.created.builder.component.Seat;
import com.huhh.code.optimized.code.design.pattern.created.builder.component.Wheel;

import lombok.Data;

@Data
public class Car {

    private List<Wheel> wheels;

    private Engine engine;

    private List<Seat> seats;

    private ControlComputer computer;

    private Glass glass;

    private String type;

}
