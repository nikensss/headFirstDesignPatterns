package com.mallafre.designpatterns.strategy.duck.behaviors.fly;

public class FlyNot implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly!");
    }
}
