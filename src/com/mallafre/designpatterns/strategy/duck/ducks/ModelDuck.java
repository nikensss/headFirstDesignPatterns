package com.mallafre.designpatterns.strategy.duck.ducks;

import com.mallafre.designpatterns.strategy.duck.Duck;
import com.mallafre.designpatterns.strategy.duck.behaviors.fly.FlyNot;
import com.mallafre.designpatterns.strategy.duck.behaviors.quack.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        setFlyBehavior(new FlyNot());
        setQuackBehavior(new Quack());
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck!");
    }
}
