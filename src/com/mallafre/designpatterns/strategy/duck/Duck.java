package com.mallafre.designpatterns.strategy.duck;

import com.mallafre.designpatterns.strategy.duck.behaviors.fly.FlyBehavior;
import com.mallafre.designpatterns.strategy.duck.behaviors.fly.FlyRocketPowered;
import com.mallafre.designpatterns.strategy.duck.behaviors.quack.QuackBehavior;
import com.mallafre.designpatterns.strategy.duck.ducks.MallardDuck;
import com.mallafre.designpatterns.strategy.duck.ducks.ModelDuck;

public abstract class Duck {

    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public Duck(){

    }

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.display();
        model.performQuack();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }

    public abstract void display();

    public void performQuack(){
        quackBehavior.quack();
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void swim(){
        System.out.println("All ducks float, even decoys!");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
