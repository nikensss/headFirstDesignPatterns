package com.mallafre.designpatterns.strategy.duck.ducks;

import com.mallafre.designpatterns.strategy.duck.Duck;
import com.mallafre.designpatterns.strategy.duck.behaviors.fly.FlyWithWings;
import com.mallafre.designpatterns.strategy.duck.behaviors.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck(){
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }
    @Override
    public void display() {
        System.out.println("I'm a mallard duck!");
    }
}
