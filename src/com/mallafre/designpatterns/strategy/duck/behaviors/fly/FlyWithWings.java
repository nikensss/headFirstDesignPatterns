package com.mallafre.designpatterns.strategy.duck.behaviors.fly;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with wings!");
    }
}
